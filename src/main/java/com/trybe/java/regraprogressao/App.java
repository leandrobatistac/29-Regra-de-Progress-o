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
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int qtdAtividades = Integer.parseInt((scanner.nextLine()));

    String[] nome = new String[qtdAtividades];
    Float[] peso = new Float[qtdAtividades];
    Float[] nota = new Float[qtdAtividades];

    for (int atv = 1; atv <= qtdAtividades; atv += 1) {
      System.out.println("Digite o nome da atividade " + atv + ":");
      nome[atv-1] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + atv + ":");
      peso[atv-1] = Float.parseFloat(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + nome[atv-1] + ":");
      nota[atv-1] = Float.parseFloat(scanner.nextLine());
    }

    scanner.close();
  }
}