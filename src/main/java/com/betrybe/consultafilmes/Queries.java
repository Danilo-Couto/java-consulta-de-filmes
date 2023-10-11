package com.betrybe.consultafilmes;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Queries {

  private final Collection<Movie> movies;

  public Queries(Collection<Movie> movies) {
    this.movies = movies;
  }

  /**
   * Consulta 1: Retorne uma lista com os filmes lançados em um ano específico.
   */
  public List<Movie> moviesByGivenYear(int ano) {
    return emptyList();
  }

  /**
   * Consulta 2: Retorna uma lista ordenada com os nomes de todos os atores e atrizes.
   */
  public List<String> allActorsInAlphabeticalOrder() {
    return emptyList(); // TODO: Implementar.
  }

  /**
   * Consulta 3: Retorna um Map que tem como chave os atores ou atrizes e como valor um conjunto com
   * os filmes que eles interpretaram.
   */
  public Map<String, Set<String>> selectMoviesByActor(String ator) {
    return emptyMap(); // TODO: Implementar.
  }

  /**
   * Consulta 4: a partir da coleção de filmes desta classe, este método retorna o conjunto de
   * atores que interpretaram a si próprios em pelo menos um desses filmes.
   *
   * <p>Considera-se "atores que interpretaram a si próprios" aqueles que têm o seu nome como
   * uma das chaves do Map `atoresPorPersonagem` e também como um dos itens pertencentes ao conjunto
   * associado a esta mesma chave.</p>
   */
  public Set<String> actorsThatInterpretThemselves() {
    return emptySet(); // TODO: Implementar.
  }

  /**
   * Consulta 5: a partir da coleção de filmes desta classe, este método retorna a lista de atores
   * que atuaram em pelo menos um filme de um determinado diretor. A lista retornada está disposta
   * em ordem alfabética.
   *
   * <p>Considera-se que um ator tenha atuado em um filme de um determinado diretor se ele tem o
   * seu nome como um dos itens do campo `atores`, ao mesmo tempo em que o diretor em questão tem o
   * seu nome como um dos itens do campo `directors` do mesmo filme.</p>
   */
  public List<String> actorsThatActedInMoviesOfDirectorInAlphabeticOrder(String diretor) {
    return emptyList(); // TODO: Implementar.
  }

  /**
   * Consulta 6: a partir da coleção de filmes desta classe, este método retorna a lista de filmes
   * em que pelo menos um dos directors tenha atuado. A lista retornada está disposta em ordem de
   * lançamento, com os filmes mais recentes no início.
   *
   * <p>Considera-se "filmes em que pelo menos um dos directors tenha atuado" aqueles em que
   * pelo menos um dos itens do campo `directors` também é um item do campo `atores`.</p>
   */
  public List<Movie> moviesWithAtLeastOneDirectorActedMostRecentFirst() {
    return emptyList(); // TODO: Implementar.
  }

  /**
   * Consulta 7: a partir da coleção de filmes desta classe, este método retorna um Map contendo all
   * os filmes lançados em um determinado ano agrupados por categoria.
   *
   * <p>Cada chave do Map representa uma categoria, enquanto cada valor representa o
   * conjunto de filmes que se encaixam na categoria da chave correspondente.</p>
   */
  public Map<String, Set<Movie>> moviesReleasedInYearGroupedByCategory(int ano) {
    return emptyMap(); // TODO: Implementar (bônus).
  }
}
