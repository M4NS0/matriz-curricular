package Lista9;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\n\tLer um  vetor de  50  números  e  montar  outro  vetor "
				+ "\n\tcom os valores do primeiro (vetor) multiplicados por 3.\n\n");

		final int MAX = 50;
		int cont;
		int[] num = new int[MAX];

		for (cont = 1; cont < MAX; cont++) {
			System.out.println("Digite o número " + cont + "°:");
			num[cont] = leia.nextInt();

		}
		System.out.println("\n\tLISTA DE NUMEROS MULTIPLICADOS POR 3\n       ---------------------------------------\n");
		for (cont = 1; cont < MAX; cont++) {
			System.out.println("\t→ " + (num[cont]) * 3);
		}

	}
}
