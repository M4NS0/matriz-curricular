package Lista5c;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num1, num2, tentativas = 1;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro entre 1 e 10: ");
		num1 = leia.nextInt();
		while ((num1 <= 0) || (num1 > 10)) {
			System.out.print("\nN�mero inv�lido! Digite um n�mero inteiro entre 1 e 10: ");
			num1 = leia.nextInt();
		}
		
		
		System.out.print("\nTente adivinhar o n�mero do 1� Jogador (1 e 10): ");
		num2 = leia.nextInt();
		while (num1 != num2) {
			tentativas++;
			System.out.print("\nErrou!!! Tente novamente: ");
			num2 = leia.nextInt();
		}

		System.out.println("\nO n�mero digitado foi: " + num2 
				+ ". Voc� acertou em " + tentativas + " tentativa(s)");
	}
}
