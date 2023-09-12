package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */

public class App {

  /**
 * Metodo main.
 */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de atividades para cadastrar:");
    int qtdAtividades = Integer.parseInt((scanner.nextLine()));
    
    String[] nome = new String[qtdAtividades];
    Float[] peso = new Float[qtdAtividades];

    for (int i = 1; i <= qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      nome[i - 1] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      peso[i - 1] = Float.parseFloat(scanner.nextLine());
    }

    scanner.close();
  }
}