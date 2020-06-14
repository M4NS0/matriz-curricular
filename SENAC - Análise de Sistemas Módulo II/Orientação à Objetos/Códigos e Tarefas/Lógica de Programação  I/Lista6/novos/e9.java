package Lista6;

import java.util.Scanner;

public class e9 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int num, soma = 1;

		System.out.println("\n\nInsira um No:");
		num = leia.nextInt();

		while (num < 0 || num > 100) {
			System.out.println("\n\nInvalido, precisa ser maior que ZERO e menor que CEM. Insira outro No:");
			num = leia.nextInt();
		}
		while (num >= 0 || num <= 100) {
			soma = num * num + 1;
			System.out.println("\nA soma dos primeiros numeros é: " + soma);
			System.out.println("\n\nInsira um No:");
			num = leia.nextInt();

		}
	}
}