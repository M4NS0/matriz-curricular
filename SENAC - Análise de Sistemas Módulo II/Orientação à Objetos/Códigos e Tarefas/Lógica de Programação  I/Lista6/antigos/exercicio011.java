package Lista6;
import java.util.Scanner;
public class exercicio011 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tEntrar via teclado com dez valores positivos."
				+ "\n\tPedir a digitação e enviar mensagem de erro, se necessário."
				+ "\n\tApós a digitação, exibir:"
				+ "\n\t\ta) O maior valor;"
				+ "\n\t\tb) A soma dos valores;"
				+ "\n\t\tc) A média aritmética dos valores;");
		
		float cont, n, somaNums, media,maiorNum, menorNum;
		final int MAX = 10; //numero de teste que seu valor default é 10
		cont = 1;
		media = 0;
		somaNums = 0;
		maiorNum = -99999;
		menorNum = 100000;
		
		while (MAX >= cont)	{
			
			
			System.out.println("\n\tDigite o numero " + cont + ":");
			n = leia.nextFloat();
			
			// enquanto o numero for negativo pede novo numero
			while (n<0) 	{
				System.out.println("\n\tInvalido! Numero Menor q zero, Digite o numero " + cont + ":");
				n = leia.nextFloat();
			
			}
			// contador
			cont ++;
			
			// soma os numeros inseridos entre eles
			somaNums = somaNums + n;
			
			// extraindo maior numero do que fo digitado
				if (n>maiorNum) {
					maiorNum = n;
				}
			// extraindo o menor numero do que foi digitado	
				if (n<menorNum) 
					menorNum = n;
				
			// media entre numeros digitados
			media = somaNums / MAX;
			
			
			
			
						   	}
		System.out.println("\tO MENOR numero inseridos é: " + menorNum);
		System.out.println("\tO MAIOR numero inseridos é: " + maiorNum);
		System.out.println("\tA MEDIA dos valores inseridos é: " + media);
		System.out.println("\tA SOMA dos valores inseridos é: " + somaNums);									
												}
							}
