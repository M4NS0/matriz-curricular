package lista5;

import java.util.Scanner;

public class e9 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		
		final int MAX = 4;
		float n1, n2, n3, media,mediatotal;
		float maiorMedia = 0;
		float menorMedia = 10;
		int cadastros, frequencia;
		int frequenciaMaxima = 32;
		float somaMedia = 0;
		int aprovados = 0;
		int reprovados = 0;
		float mediaGeral;
		
	
		String matricula;

		for (cadastros = 1; cadastros <= MAX; cadastros++) {

			System.out.println("\n\nMATRICULA: ");
			matricula = leia.next();

			System.out.println("N1: ");
			n1 = leia.nextFloat();

			System.out.println("N2: ");
			n2 = leia.nextFloat();

			System.out.println("N3: ");
			n3 = leia.nextFloat();

			System.out.println("FREQUENCIA: ");
			frequencia = leia.nextInt();

			media = (n1 + n2 + n3) / 3;
			somaMedia = (somaMedia + media);
			
			if (media >= 7.0 && frequencia >= 26) {
				System.out.println("\n\n\t" + matricula + "\n\tMEDIA: " + media + "\n\tFREQ: " + frequencia + " >APROVADO< ");
			}
			else{
				System.out.println("\n\n\t" + matricula + "\n\tMEDIA: " + media + "\n\tFREQ: " + frequencia + " >REPROVADO< ");
				reprovados ++;
			}
						
			if (maiorMedia <= media) {
				maiorMedia = media;
			}
			if (menorMedia >= media) {
				menorMedia = media;
			}
			
		}
		mediaGeral = somaMedia/MAX;
		aprovados = MAX - reprovados; 
		System.out.println("\n\tMEDIA GERAL: " + somaMedia + 
				             "\nMAIOR MEDIA: " + maiorMedia +
				             "\nMENOR MEDIA: " + menorMedia + 
				             "\n REPROVADOS: " + reprovados + 
				             "\n  APROVADOS: " + aprovados);
	}
}