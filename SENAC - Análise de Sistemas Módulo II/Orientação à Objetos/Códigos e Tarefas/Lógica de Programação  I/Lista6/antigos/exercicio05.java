package Lista6;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.print("\n\tEntrar via teclado com um valor qualquer."
				+ "\n\tTravar a digitação, no sentido de aceitar somente valores positivos"
				+ "\n\tApós a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.");

		int numero, multiplicador, resultado;

		multiplicador = 0; // contador

		System.out.print("\n\n\tInsira um número aleatório para calcular sua taboada de zero a dez: ");
		numero = leia.nextInt();

		while ((numero > 10 | numero < 0)) {
			System.out.print("\n\n\t Voce digitou um numero invalido, digite outro numero: ");
			numero = leia.nextInt();
		}
		while ((multiplicador <= 10) && (multiplicador >= 0)) {
			resultado = (multiplicador * numero);

				if (numero >= 0) {
					System.out.print("\n\t > " + multiplicador + " x " + numero + " = " + resultado);
					multiplicador++;

				}
			}

		}

	}

