package lista5;

import java.util.Scanner;

public class e5 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		String nome1, nome2;
		int escolha1, escolha2;
		int tentativas = 0;
		escolha1 = 0;
		escolha2 = 1;

		System.out.println("Insira o nome do Player 1: ");
		nome1 = leia.nextLine();

		System.out.println("Insira o nome do Player 2: ");
		nome2 = leia.nextLine();

		System.out.println(nome1 + ", insira um numero de 0 a 10 para que " + nome2 + " o adivinhe: ");
		escolha1 = leia.nextInt();

		while (escolha1 != escolha2) {
			tentativas++;

			System.out.println("\nTENTATIVA No " + tentativas + ": " + nome2 + ", insira um numero de 0 a 10 que" + nome1
					+ " digitou: ");
			escolha2 = leia.nextInt();

		}
				System.out.println("\n [PARABENS VOCÊ ACERTOU]");
			
		
	}
}
