package Lista6c;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		int num, tab;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n� inteiro positivo: ");
		num = leia.nextInt();
		while (num <= 0) {
			System.out.print("N� inv�lido! Digite o n� novamente (inteiro e positivo): ");
			num = leia.nextInt();
		}

		for (int i = 1; i <= 10; i++) {
			tab = i * num;
			System.out.println(num + " x " + i + " = " + tab);
		} 
		
	}

}
