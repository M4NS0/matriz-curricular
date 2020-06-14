package Lista6c;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		int n, num, maior = 0, menor = 0;
		float soma = 0, media, percPos, percNeg, contPos = 0, contNeg= 0;
		Scanner leia = new Scanner(System.in);
		
		// Leitura do numero da tabuada = X
		System.out.print("Digite um n� inteiro entre 1 e 20: ");
		n = leia.nextInt();
		while (!(n > 0 && n < 20)) {
			System.out.print("N� inv�lido! Digite o n� inteiro entre 1 e 20: ");
			n = leia.nextInt();
		}
		
		// Impress�o da tabuada
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o " + i + "� n�: ");
			num = leia.nextInt();
			
			if ((i == 1) || (num > maior)) {
				maior = num;
			}
			if ((i == 1) || (num < menor)) {
				menor = num;
			}
			
			if (num > 0) {
				contPos++;
			}
			if (num < 0) {
				contNeg++;
			}
			
			soma = soma + num;
		} 
		media = soma / n;
		percPos = contPos / n * 100;
		percNeg = contNeg / n * 100;

		System.out.println("Maior n� = " + maior);
		System.out.println("Menor n� = " + menor);
		System.out.println("Soma  n� = " + soma);
		System.out.println("M�dia n� = " + media);
		System.out.println("% de n� Positivos = " + percPos);
		System.out.println("% de n� Negativos = " + percNeg);
	}

	
	
	
	
	
	
	
	
	
	
}
