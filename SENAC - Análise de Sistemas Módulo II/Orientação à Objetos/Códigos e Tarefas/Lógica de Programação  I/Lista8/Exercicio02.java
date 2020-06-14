package Lista8;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\n\n\t2. Escreva um algoritmo  que receba  como \n"
				+ "\tentrada três números inteiros e verifique\n" + "\tse a soma dos mesmos é  maior  ou igual a \n"
				+ "\t100. O algoritmo deve emitir uma mensagem\n\tem caso positivo.");

		int n1, n2, n3, soma;

		System.out.println("\n Insira o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("\n Insira o segundo número: ");
		n2 = leia.nextInt();

		System.out.println("\n Insira o terceiro número: ");
		n3 = leia.nextInt();

		soma = n1 + n2 + n3;

		if (soma >= 100) {
			System.out.println("\n> Soma dos numeros é MAIOR e IGUAL a 100! <");
		}
	}
}
