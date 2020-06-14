package Lista6;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.print("\n\tEntrar via teclado com um valor (X) qualquer. "
				+ "\n\tTravar a digitação, no sentido de aceitar somente valores positivos."
				+ "\n\tSolicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado,"
				+ "\n\tsendo que o segundo valor (B), deverá ser maior que o primeiro (A), "
				+ "\n\tcaso contrário, digitar novamente somente o segundo."
				+ "\n\tApós a validação dos dados, exibir a tabuada do valor digitado,"
				+ "\n\tno intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.");

		int numero, resultado;
		int inicio, fim;

		System.out.print("\n\n\tInsira um número aleatório para calcular sua taboada em uma faixa determinada: ");
		numero = leia.nextInt();
		System.out.print("\n\n\tInsira o numero inicial: ");
		inicio = leia.nextInt();

		System.out.print("\n\n\tInsira o numero final: ");
		fim = leia.nextInt();

		while ((numero <= 0)) {
			System.out.print("\n\n\t Voce digitou um numero invalido, digite outor numero: ");
			numero = leia.nextInt();
		}

		while (fim < inicio) {
			System.out.print("\n\n\t voce digitou o segundo valor menor que o primeiro, digite o fim novamente: ");
			fim = leia.nextInt();
		}

		while (fim >= inicio) {
			resultado = (fim * numero);
			System.out.print("\n\t > " + numero + " x " + fim + " = " + resultado);
			fim--;

		}

		if (numero < 0) {
			System.out.print("\n\n\tInsira um número POSITIVO para calcular sua taboada de zero a dez: ");
			numero = leia.nextInt();
		}

	}
}
