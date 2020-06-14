package Lista6;

import java.util.Scanner;

public class e1 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		float num;
		int contagem = 0;

		while (contagem >= 0) {

			System.out.println("Insira um numero: ");
			num = leia.nextFloat();

			if (num >= 0) {
			} else {
				System.out.println("Numero invalido por ser NEGATIVO, insira outro POSITIVO: ");
				num = leia.nextFloat();
			}
		}
	}
}