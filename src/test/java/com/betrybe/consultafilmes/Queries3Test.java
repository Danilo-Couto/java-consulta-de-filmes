package com.betrybe.consultafilmes;

import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Queries3Test {

  @Test
  @DisplayName("Consulta 3 - consulta com base em coleção vazia deve retornar um conjunto vazio")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), "", emptyMap());
  }

  @Test
  @DisplayName("Consulta 3 - consulta deve retornar resultados corretos")
  public void consultaComFiltrosValidos() {
    testarConsulta(
        Set.of(Movies.djangoLivre, Movies.naoOlheParaCima),
        "Leonardo DiCaprio",
        Map.of("Leonardo DiCaprio", Set.of("Django Livre", "Não Olhe para Cima")));
  }


  private static void testarConsulta(Collection<Movie> movies, String ator,
      Map<String, Set<String>> saidasEsperadas) {
    Queries queries = new Queries(movies);
    Map<String, Set<String>> saidasReais = queries.selectMoviesByActor(ator);
    assertEquals(saidasEsperadas, saidasReais);
  }
}
