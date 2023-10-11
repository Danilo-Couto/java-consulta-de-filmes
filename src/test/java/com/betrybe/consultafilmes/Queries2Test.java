package com.betrybe.consultafilmes;

import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Queries2Test {

  @Test
  @DisplayName("Consulta 2 - consulta com base em coleção vazia deve retornar um conjunto vazio")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), new ArrayList<>());
  }

  @Test
  @DisplayName("Consulta 2 - consulta deve retornar resultados corretos")
  public void consultaComFiltrosValidos() {
    testarConsulta(
        Set.of(Movies.homemAranhaSemVoltaParaCasa),
        List.of("Alfred Molina", "Benedict Cumberbatch", "Jamie Foxx", "Tom Holland", "Zendaya"));
  }


  private static void testarConsulta(Collection<Movie> movies, List<String> saidasEsperadas) {
    Queries queries = new Queries(movies);
    List<String> saidasReais = queries.allActorsInAlphabeticalOrder();
    assertEquals(saidasEsperadas, saidasReais);
  }
}
