package com.betrybe.consultafilmes;

public class Main {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    Queries queries = new Queries(Movies.all());
    var resultados = queries.moviesReleasedInYearGroupedByCategory(2021);
    System.out.println(resultados);
  }
}
