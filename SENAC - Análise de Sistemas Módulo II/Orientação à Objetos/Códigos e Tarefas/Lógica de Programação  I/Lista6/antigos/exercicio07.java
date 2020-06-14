package Lista6;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\tExibir a tabuada dos valores de um a vinte, no intervalo de um a dez. "
				+ "\n\tEntre as tabuadas, solicitar que o usuÃ¡rio pressione uma tecla. \n");

		int i,numero, tabuada;
		String enter;
		enter = "";
		numero = 1;
		
		while (enter.equals("")) {
		
			while (numero <= 20) {
				i = 0;
				while (i <= 10) {
					tabuada = i * numero;
					System.out.println("\t" + numero + " X " + i + " = " + tabuada);
					i ++;
			}

			System.out.println("\n\tPressione <enter> para imprimir a proxima tabuada: ");
			enter = leia.nextLine();
			numero ++;
		}

		}
	}
}

