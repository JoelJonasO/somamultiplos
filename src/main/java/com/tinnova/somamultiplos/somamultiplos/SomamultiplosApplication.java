package com.tinnova.somamultiplos.somamultiplos;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tinnova.somamultiplos.somamultiplos.model.SomaMultiplos;

@SpringBootApplication
public class SomamultiplosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomamultiplosApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para calcular a soma dos múltiplos de 3 ou 5 até esse número: ");
		int numero;

		SomaMultiplos somaMultiplos = new SomaMultiplos();

		try {
			numero = scanner.nextInt();
			int num1 = 3;
			int num2 = 5;
			int resultado = somaMultiplos.calculate(num1, num2, numero);
			System.out.println("A soma dos múltiplos de " + num1 + " ou " + num2 + " até " + numero + " é: " + resultado);
		} catch (NumberFormatException e) {
			System.out.println("Por favor, forneça um número válido como argumento.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
