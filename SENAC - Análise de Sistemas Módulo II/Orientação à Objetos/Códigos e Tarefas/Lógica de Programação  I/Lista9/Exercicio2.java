package Lista9;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\tLer 200 números e imprimir na ordem inversa da leitura, "
				+ "\n\tou seja, o último número lido deve ser o primeiro impresso.");

		final int MAX = 200;
		int contador = 0;
		int[] num = new int[MAX];

		while (contador < MAX) {

			System.out.println("\nDigite o " + (contador + 1) + "°:");
			num[contador] = leia.nextInt();
			contador++;
		}
		System.out.println("\n\tLISTA DE NUMEROS\n       -------------------\n");
		contador = MAX;
		while (contador > 0) {
			contador--;
			System.out.println("\t\t→ " + num[contador]);
		}
	}
}
