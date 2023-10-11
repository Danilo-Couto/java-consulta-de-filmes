package com.betrybe.consultafilmes;

import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Queries1Test {
  @Test
  @DisplayName("Consulta 1 - consulta com base em coleção vazia deve retornar um conjunto vazio")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), 0, new ArrayList<>());
  }

  @Test
  @DisplayName("Consulta 1 - consulta deve retornar resultados corretos")
  public void consultaComFiltrosValidos() {
    testarConsulta(
        Movies.all(),
        2021,
        List.of(
            Movies.homemAranhaSemVoltaParaCasa,
            Movies.naoOlheParaCima,
            Movies.matrixResurrections,
            Movies.spaceJam2021));
  }


  private static void testarConsulta(Collection<Movie> movies, int year, List<Movie> saidasEsperadas) {
    Queries queries = new Queries(movies);
    List<Movie> saidasReais = queries.moviesByGivenYear(year);
    boolean assertionResult = saidasEsperadas.containsAll(saidasReais);
    assertTrue(assertionResult);
  }
}
