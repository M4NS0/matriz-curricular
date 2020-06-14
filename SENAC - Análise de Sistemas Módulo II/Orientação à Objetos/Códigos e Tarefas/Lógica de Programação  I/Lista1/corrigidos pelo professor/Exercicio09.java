
// 9.   Entrar via teclado com o valor da cotação do dólar 
//	e uma certa quantidade de dólares. Calcular e exibir 
//	o valor correspondente em Reais (R$). 


import java.util.Scanner;

public class Exercicio09 {

		public static void main(String args[]) {

	int D, R, Cot;
	Scanner leia = new Scanner(System.in);

	System.out.println("Escreva o valor em Dolares para a conversão em reais: ");
	D = leia.nextInt();

	System.out.println("Escreva o valor da cotação do dollar do dia de hoje: ");
	Cot = leia.nextInt();

	R = D * Cot;

	System.out.println("O valor convertido em reais é de: " + R);

	}
}