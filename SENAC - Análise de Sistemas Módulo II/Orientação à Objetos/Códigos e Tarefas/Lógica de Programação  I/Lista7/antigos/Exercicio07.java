package Lista7;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\tEscreva um algoritmo que imprima todos os números "
				+ "\n\tmúltiplos de 5, no intervalo fechado de 1 a 500. ");

		int resposta, numero, multiplicador;

		for (numero = 1; numero <= 500; numero++) {

			if (numero % 5 == 0) {
				System.out.println(numero);
			}
		}
	}
}
