package com.tinnova.somamultiplos.somamultiplos.model;

public class SomaMultiplos {
  /**
   * Calcula a soma de todos os números múltiplos de num1 ou num2 até um número
   * especificado numLimit.
   * 
   * @param num1 O primeiro número que será usado no cálculo.
   * @param num2 O segundo número que será usado no cálculo.
   * @param numLimit O número até o qual a soma dos múltiplos de num1 ou num2 será calculada.
   * @return A soma de todos os múltiplos de num1 ou num2 até numLimit.
   * @throws IllegalArgumentException Se num1, num2 ou numLimit for menor ou igual a 0.
   */
  public int calculate(int num1, int num2, int numLimit) {
    if (num1 <= 0) {
      throw new IllegalArgumentException("O primeiro número deve ser maior que zero.");
    }
    if (num2 <= 0) {
      throw new IllegalArgumentException("O segundo número deve ser maior que zero.");
    }
    if (numLimit <= 0) {
      throw new IllegalArgumentException("O número limite deve ser maior que zero.");
    }

    int soma = 0;
    for (int i = 1; i < numLimit; i++) {
      if (i % num1 == 0 || i % num2 == 0) {
        soma += i;
      }
    }
    return soma;
  }
}
