package Lista6c;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		int tab;
		Scanner leia = new Scanner(System.in);
		
		for (int num = 1; num <= 20; num++) {
			for (int i = 1; i <= 10; i++) {
				tab = i * num;
				System.out.println(num + " x " + i + " = " + tab);
			}
			System.out.println("pressione enter para continuar ...");
			leia.nextLine();
		}
	}
}
