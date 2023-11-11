package com.betrybe.consultafilmes;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Queries {

  private final Collection<Movie> movies;

  public Queries(Collection<Movie> movies) {
    this.movies = movies;
  }

  /**
   * Consulta 1: Retorne uma lista com os filmes lançados em um ano específico.
   */
  public List<Movie> moviesByGivenYear(int ano) {
    return this.movies.stream()
        .filter(movie -> movie.getReleaseYear() == ano)
        .collect(Collectors.toList());
  }

  /**
   * Consulta 2: Retorna uma lista ordenada com os nomes de todos os atores e atrizes.
   */
  public List<String> allActorsInAlphabeticalOrder() {
    return this.movies.stream()
        .map(movie -> movie.getActors())
        .flatMap(Collection::stream)
        .sorted()
        .collect(Collectors.toList());
  }

  /**
   * Consulta 3: Retorna um Map que tem como chave os atores ou atrizes e como valor um conjunto com
   * os filmes que eles interpretaram.
   */
  public Map<String, Set<String>> selectMoviesByActor(String ator) {
    Map<String, Set<String>> moviesForActorMap = new HashMap<>();
    Set<String> moviesForActor = this.movies.stream()
        .filter(movie -> movie.actors.contains(ator))
        .map(movie -> movie.title)
        .collect(Collectors.toSet());
    if (!moviesForActor.isEmpty()) {
      moviesForActorMap.put(ator, moviesForActor);
    }
    return moviesForActorMap;
  }

  /**
   * Consulta 4: a partir da coleção de filmes desta classe, este método retorna o conjunto de
   * atores que interpretaram a si próprios em pelo menos um desses filmes.
   * <p>Considera-se "atores que interpretaram a si próprios" aqueles que têm o seu nome como
   * uma das chaves do Map `atoresPorPersonagem` e também como um dos itens pertencentes ao conjunto
   * associado a esta mesma chave.</p>
   */
  public Set<String> actorsThatInterpretThemselves() {
    return this.movies.stream()
        .flatMap(movie -> movie.getActorsByCharacters().entrySet().stream()
            .filter(entry -> entry.getValue().contains(entry.getKey()))
            .map(entry -> entry.getKey())
        )
        .collect(Collectors.toSet());
  }

  /**
   * Consulta 5: a partir da coleção de filmes desta classe, este método retorna a lista de atores
   * que atuaram em pelo menos um filme de um determinado diretor. A lista retornada está disposta
   * em ordem alfabética.
   * <p>Considera-se que um ator tenha atuado em um filme de um determinado diretor se ele tem o
   * seu nome como um dos itens do campo `atores`, ao mesmo tempo em que o diretor em questão tem o
   * seu nome como um dos itens do campo `directors` do mesmo filme.</p>
   */
  public List<String> actorsThatActedInMoviesOfDirectorInAlphabeticOrder(String diretor) {
    return this.movies.stream()
        .filter(m -> m.getDirectors().contains(diretor))
        .map(m -> m.getActors())
        .flatMap(actors -> actors.stream())
        .distinct()
        .sorted()
        .collect(Collectors.toList());
  }

  /**
   * Consulta 6: a partir da coleção de filmes desta classe, este método retorna a lista de filmes
   * em que pelo menos um dos directors tenha atuado. A lista retornada está disposta em ordem de
   * lançamento, com os filmes mais recentes no início.
   * <p>Considera-se "filmes em que pelo menos um dos directors tenha atuado" aqueles em que
   * pelo menos um dos itens do campo `directors` também é um item do campo `atores`.</p>
   */

  public List<Movie> moviesWithAtLeastOneDirectorActedMostRecentFirst() {
    return this.movies.stream()
        .filter(movie -> movie.getDirectors().stream()
            .anyMatch(actor -> movie.getActors().contains(actor)))
        .distinct()
        .sorted((m1, m2) -> Integer.compare(m2.getReleaseYear(), m1.getReleaseYear()))
        .collect(Collectors.toList());
  }

  /**
   * Consulta 7: a partir da coleção de filmes desta classe, este método retorna um Map contendo all
   * os filmes lançados em um determinado ano agrupados por categoria.
   * <p>Cada chave do Map representa uma categoria, enquanto cada valor representa o
   * conjunto de filmes que se encaixam na categoria da chave correspondente.</p>
   */

  public Map<String, Set<Movie>> moviesReleasedInYearGroupedByCategory(int ano) {
    return this.movies.stream()
        .filter(movie -> movie.getReleaseYear() == ano)
        .flatMap(movie -> movie.getCategories().stream()
            .map(category -> Map.entry(category, movie)) //até aqui é Set<Entry<String, Movie>>
        )
        //        .collect(Collectors.toSet());
        .collect(Collectors.groupingBy(
            entry -> entry.getKey(),
            Collectors.mapping(entry -> entry.getValue(), Collectors.toSet())
        ));
  }
}
