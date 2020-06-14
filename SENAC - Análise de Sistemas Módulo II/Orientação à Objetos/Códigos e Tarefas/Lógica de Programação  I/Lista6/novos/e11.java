package Lista6;

import java.util.Scanner;

public class e11 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		final int MAX = 3;
		int cont, num, media = 0;
		int maiorNum = -9999;
		int menorNum = 99999;
		int soma = 0;
		

		for (cont = 1; cont <= MAX; cont++) {
			System.out.println("Insira o valor #" + cont + ": ");
			num = leia.nextInt();
			while (num < 0) {
				System.out.println("Invalido, valor deve ser POSITIVO. Insira o valor #" + cont + ": ");
				num = leia.nextInt();
			
			if (maiorNum < num) {
				maiorNum = num;
			}
			if (menorNum > num) {
				menorNum = num;
			}
			soma = soma + num;
			media = soma / cont;
			
		}
		System.out.println("\nO MAIOR: " + maiorNum + "\nO MENOR: " + menorNum + "\nSOMA: " + soma + "\nMEDIA: " + media);


	}
}
}