package lista5;

import java.util.Scanner;

public class e8 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		final int MAX = 4;
		int cadastros;
		String numero, controledeQualidade;
		int contaR = 0;
		int contaA = 0;
		
		
		
		for (cadastros = 1; cadastros <= MAX; cadastros ++) {
			System.out.println("No da PEÇA: ");
			numero = leia.nextLine();
			
			System.out.println("'R' para reprovada, 'A' para aprovada: ");
			controledeQualidade = leia.nextLine();
			
				if (controledeQualidade.equalsIgnoreCase("R")) {
					contaR ++;
				}
				if (controledeQualidade.equalsIgnoreCase("A")) {
					contaA ++;
				}
		}
		System.out.println("\n\t REPROVADAS: " + contaR + 
				           "\n\t  APROVADAS: " +  contaA);	
	}
}
