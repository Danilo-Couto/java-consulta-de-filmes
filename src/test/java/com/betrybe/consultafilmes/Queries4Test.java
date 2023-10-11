package com.betrybe.consultafilmes;

import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Queries4Test {

  @Test
  @DisplayName("Consulta 4 - consulta com base em coleção vazia deve retornar um conjunto vazio")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), emptySet());
  }

  @Test
  @DisplayName(
      "Consulta 4 - consulta deve retornar um conjunto vazio quando nenhum artista atende ao requisito"
  )
  public void nenhumAtorAtendeAoRequisito() {
    testarConsulta(
        Set.of(Movies.vingadoresUltimato, Movies.matrixResurrections, Movies.bastardosInglorios),
        emptySet()
    );
  }

  @Test
  @DisplayName("Consulta 4 - consulta deve retornar resultados corretos")
  public void algunsAtoresAtendemAoRequisito() {
    testarConsulta(
        Movies.all(),
        Set.of("LeBron James", "John Malkovich")
    );
  }

  private static void testarConsulta(Collection<Movie> movies, Set<String> saidasEsperadas) {
    Queries queries = new Queries(movies);
    Set<String> saidasReais = queries.actorsThatInterpretThemselves();
    assertEquals(saidasEsperadas, saidasReais);
  }
}
