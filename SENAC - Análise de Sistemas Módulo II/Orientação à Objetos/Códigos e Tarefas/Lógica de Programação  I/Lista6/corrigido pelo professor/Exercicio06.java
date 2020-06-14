package Lista6c;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		int x, tab, a, b;
		Scanner leia = new Scanner(System.in);
		
		// Leitura do numero da tabuada = X
		System.out.print("Digite um n� inteiro positivo: ");
		x = leia.nextInt();
		while (x <= 0) {
			System.out.print("N� inv�lido! Digite o n� novamente (inteiro e positivo): ");
			x = leia.nextInt();
		}
		
		// Leitura dos extremos da tabuada A e o B
		System.out.print("Digite o intervalo final da tabuada: ");
		a = leia.nextInt();
		
		System.out.print("Digite o intervalo inicial da tabuada maior que o 1�: ");
		b = leia.nextInt();
		
		while (b < a) {
			System.out.print("N� menor que " + a + ". Digite o 2� n� novamente: ");
			b = leia.nextInt();
		}

		// Impress�o da tabuada
		for (int i = b; i >= a; i--) {
			tab = i * x;
			System.out.println(x + " x " + i + " = " + tab);
		} 
		
	}

}
