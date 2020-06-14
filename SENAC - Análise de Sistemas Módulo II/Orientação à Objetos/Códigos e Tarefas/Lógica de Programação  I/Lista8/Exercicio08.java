package Lista8;
import java.util.Scanner;
public class Exercicio08 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("\n\n _______________________________________________________________\n" +
				"|\t\t\t\t\t\t\t\t|\n" +
				"|\t8. Fazer um programa  para  ler  a  base e  a  \t\t|\n" + 
				"|\taltura de 10 triângulos e imprimir suas áreas  \t\t|\n" + 
				"|\t\t\t\t\t\t\t\t|\n" +
				"|_______________________________________________________________|\n");
		
		float base, altura, area;
		
		// define a quantidade final de cadastros
		final int MAX = 10;
		
		// define a contagem dos triangulos
		int contagem;
		
		// Input ( entrada de dados)
		// ja que existe um numero fixo de cadastros a serem feitos
		// usa-se o FOR inves de WHILE
		// variavel carastro aparecera dentro da condicação do for e sera inicializada la tambem.
		for (contagem = 1; contagem <= MAX; contagem ++) {
			
			// Input 1
			System.out.println("> Insira a BASE do triangulo No" + contagem + ": ");
			base = leia.nextFloat();
			
			// Input 2
			System.out.println("> Insira a ALTURA do triangulo No" + contagem + ": ");
			altura = leia.nextFloat();
			
			area = base * altura;
			System.out.println("\n\n_______________________________________\n\n"
					+ "> Triangulo " + contagem + " Area de " + area + " metros"
					+ "\n_______________________________________\n\n\n");
		
		}
	}
}
