package Lista7;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\tFazer um algoritmo que imprima na tela todos os números pares"
				+ "\n\tde 1 a n, onde n e fornecido pelo usuário.\n ");

		int numero, i;
		i = 1;

		System.out.println("\n\tInsira o valor do numero final para obter os numeros pares anteriores: ");
		numero = leia.nextInt();

		while (numero > i) {
			if ((i % 2) == 0) {
				System.out.println("\t> " + i);
			}
			i++;
		}
		while (numero < i) {
			if ((i % 2) == 0) {
				System.out.println("\t> " + i);
			}
			i--;

		}

	}

}
