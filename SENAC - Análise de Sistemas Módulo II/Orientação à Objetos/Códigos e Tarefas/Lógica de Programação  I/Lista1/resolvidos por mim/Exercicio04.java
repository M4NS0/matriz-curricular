package Lista1;
// 4. Cadastrar o peso de quatro pessoas. Imprimir a média do peso dessas pessoas. 

import java.util.Scanner;

public class Exercicio04 {

		public static void main(String args[]) {

	int p1, p2, p3, p4, media;
	Scanner leia = new Scanner(System.in);

	System.out.println("Digite o peso da primeira pessoa: ");
	p1 = leia.nextInt();

	System.out.println("Digite o peso da segunda pessoa: ");
	p2 = leia.nextInt();

	System.out.println("Digite o peso da terceira pessoa: ");
	p3 = leia.nextInt();

	System.out.println("Digite o peso da quarta pessoa: ");
	p4 = leia.nextInt();

	media = (p1+p2+p3+p4) / 4;

	System.out.println("A media dos pesos é: " + media);

	}
}