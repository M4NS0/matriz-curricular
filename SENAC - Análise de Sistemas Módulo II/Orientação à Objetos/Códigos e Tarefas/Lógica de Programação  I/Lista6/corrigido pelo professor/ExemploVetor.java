package Lista6c;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		float num[] = new float[6];
		Scanner leia = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "� n�: ");
			num[i] = leia.nextFloat();
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " n�: " + num[i] );
		}
		System.out.println("Fim do programa!");

	}

}
