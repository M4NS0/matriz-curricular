package Lista6c;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float num1, num2;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�: ");
		num1 = leia.nextFloat();
		
		System.out.print("Digite o 2� maior que o 1� n�: ");
		num2 = leia.nextFloat();
		
		while (num2 < num1) {
			System.out.print("N� menor que " + num1 + ". Digite o 2� n� novamente: ");
			num2 = leia.nextFloat();
		}
		System.out.println("Fim do programa!");

	}

}
