package Lista6;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		String enter;

		System.out.print("\n\tExibir a tabuada do número cinco no intervalo de um a dez.");
		System.out.print("\n\tAperte <ENTER> para continuar");
		enter = leia.nextLine();

		int multiplicador, resultado;
		int i = 1;
		multiplicador = 5;

		while (i<=10) {
			resultado = multiplicador * i;
				System.out.print("\n\t> 5 x " + i + " = " + resultado);
				i ++;
			}
		}
	}
