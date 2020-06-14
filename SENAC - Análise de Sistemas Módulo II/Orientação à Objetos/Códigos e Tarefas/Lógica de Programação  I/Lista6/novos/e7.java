package Lista6;

import java.util.Scanner;

public class e7 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		System.out.println("");

		int multiplicador, num = 1, resultado;
		String enter;

		for (num = 1; num <= 20; num++) {
			for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
				resultado = num * multiplicador;
				System.out.println(num + " x " + multiplicador + " = " + resultado);
			}
			System.out.println("Aperte <enter> para continuar...");
			enter = leia.nextLine();
		}
	}
}
