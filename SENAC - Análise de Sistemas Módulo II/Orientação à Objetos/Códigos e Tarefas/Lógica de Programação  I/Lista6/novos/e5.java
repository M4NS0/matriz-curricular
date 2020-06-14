package Lista6;

import java.util.Scanner;

public class e5 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		float num;
		int contador = 0;
		float resultado;

		System.out.println("Insira um valor: ");
		num = leia.nextFloat();

		if (num < 0) {
			System.out.println("VALOR INVALIDO, Insira um valor POSITIVO: ");
			num = leia.nextFloat();
		}

		System.out.println("\nTABUADA DE " + num);
		for (contador = 1; contador <= 10; contador++) {
			resultado = num * contador;

			System.out.println(num + " x " + contador + " = " + resultado);
		}
	}
}
