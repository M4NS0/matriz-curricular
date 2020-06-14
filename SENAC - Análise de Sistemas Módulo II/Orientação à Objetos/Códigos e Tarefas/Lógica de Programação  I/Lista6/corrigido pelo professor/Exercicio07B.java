package Lista6c;

import java.util.Scanner;

public class Exercicio07B {

	public static void main(String[] args) {

		int tab;
		Scanner leia = new Scanner(System.in);
		
		int num = 1;

		while (num <= 20) {
			int i = 1;
			while (i <= 10) {
				tab = i * num;
				System.out.println(num + " x " + i + " = " + tab);
				i++;
			}
			System.out.println("pressione enter para continuar ...");
			leia.nextLine();
			num++;
		}
	}
}
