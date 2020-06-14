package Lista6;

import java.util.Scanner;

public class e2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		float num1, num2;
		int contador = 0;

		while (contador >= 0) {
			System.out.println("Insira o 1o valor: ");
			num1 = leia.nextFloat();

			System.out.println("Insira o 2o valor: ");
			num2 = leia.nextFloat();

			if (num2 > num1) {
			} else {
				System.out.println("Primeiro número MAIOR que o segundo, insira o 2o valor novamente: ");
				num2 = leia.nextFloat();
			}

		}

	}
}
