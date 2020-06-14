package Lista7;

import java.util.Scanner;

public class E6 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		String voto, sexo;
		String escolha = "S";
		int a = 0, b = 0, c = 0, m = 0, h = 0;
		int idade, media = 0;
		int maisvotado = 0;
		int somaidadeA = 0;
		int somaidadeB = 0;
		int somaidadeC = 0;
		int maisvotadosHA = 0;
		int maisvotadosHB = 0;
		int maisvotadosHC = 0;
		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("\n\n____________________________\n " + "\n    ESCOLHA SEU CANDIDATO\n"
					+ "____________________________\n\n" + "  Digite 'A', 'B' ou 'C': ");
			voto = leia.next();

			System.out.println("> Qual seu sexo? 'M' ou 'H': ");
			sexo = leia.next();

			if (sexo.equalsIgnoreCase("M")) {
				m++;
			}
			if (sexo.equalsIgnoreCase("H")) {
				h++;
			}
			System.out.println("> Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\nSe quiser continuar digite 'S', ou digite 'N' par exibir o relatorio");
			escolha = leia.next();

			if (voto.equalsIgnoreCase("A")) {
				a++;
				if (sexo.equalsIgnoreCase("M")) {
					maisvotadosHA++;
				}
			}
			if (voto.equalsIgnoreCase("B")) {
				b++;
				if (sexo.equalsIgnoreCase("M")) {
					maisvotadosHB++;
				}
			}
			if (voto.equalsIgnoreCase("C")) {
				c++;
				somaidadeC = somaidadeC + idade;
				if (sexo.equalsIgnoreCase("M")) {
					maisvotadosHC++;
				}
			}
			somaidadeA = somaidadeA + idade;
			somaidadeB = somaidadeB + idade;
			somaidadeC = somaidadeC + idade;

			if (a > b && a > c) {
				maisvotado++;
				media = somaidadeA / (a + b + c); 
				System.out.println("\n____________________________________________________\n"
						+ "\n\t    RELATORIO"
						+ "\"\n____________________________________________________\n"
						+ "\nO Mais votado foi o candidato A com " + maisvotado + " votos" 
						+ "\nA media das idades foi:" + media+ " anos.");
			}
			if (b > a && b > c) {
				maisvotado++;
				media = somaidadeB / (a + b + c);
				System.out.println("\n____________________________________________________\n"
						+ "\n\t    RELATORIO"
						+ "\"\n____________________________________________________\n"
						+ "\nO Mais votado foi o candidato B com " + maisvotado + " votos" 
						+ "\nA media das idades foi:" + media+ " anos.");
	
			}
			if (c > a && c > b) {
				maisvotado++;
				media = somaidadeC / (a + b + c);
				System.out.println("\n____________________________________________________\n"
						+ "\n\t    RELATORIO"
						+ "\"\n____________________________________________________\n"
						+ "\nO Mais votado foi o candidato C com " + maisvotado + " votos" 
						+ "\nA media das idades foi:" + media+ " anos.");
			}
			if (maisvotadosHA > maisvotadosHB && maisvotadosHA > maisvotadosHC) {
				maisvotadosHA++;
				System.out.println("O mais votado entre os Homens foi o candidato A com " + maisvotadosHA + " votos");
			}
			if (maisvotadosHB > maisvotadosHA && maisvotadosHB > maisvotadosHC) {
				maisvotadosHB++;
				System.out.println("O mais votado entre os Homens foi o candidato B com " + maisvotadosHB + " votos");

			}
			if (maisvotadosHC > maisvotadosHA && maisvotadosHC > maisvotadosHB) {
				maisvotadosHC++;
				System.out.println("O mais votado entre os Homens foi o candidato C com " + maisvotadosHC + " votos");

			}
			
			if (escolha.equalsIgnoreCase("N")) {
				System.out.println("\n\t [FIM]\n ");
				
			}
		}
	}
}
