package Lista6;

import java.util.Scanner;

public class e6 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int num;
		int inicio, fim;
		int contador = 0;
		int resultado;

		System.out.println("\n\n\n Insira um numero: ");
		num = leia.nextInt();

		if (num < 0) {
			System.out.println("\n\n\nNumero NEGATIVO, Insira um novo numero: ");
			num = leia.nextInt();
		}

		System.out.println("\nInsira o intervalo para o calculo da tabuada \nCOMEÇA EM:");
		inicio = leia.nextInt();

		System.out.println("TERMINA EM: ");
		fim = leia.nextInt();

		if (fim < inicio) {
			System.out.println("\nINICIO maior que o FIM! Repetindo...");
			System.out.println("\n\nCOMEÇA EM:");
			inicio = leia.nextInt();

			System.out.println("TERMINA EM: ");
			fim = leia.nextInt();
		}

		for (contador = fim; contador >= inicio; contador --) {
				resultado = (num * contador);

				System.out.println(num + " x " + contador + " = " + resultado);

			
		}
	}
}
