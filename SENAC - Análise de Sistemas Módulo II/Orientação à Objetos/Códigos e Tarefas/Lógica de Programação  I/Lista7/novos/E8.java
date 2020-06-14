package Lista7;

import java.util.Scanner;

public class E8 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int lotacao, idade;
		String escolha;
		float percentualC;
		float percentualB;
		float diferencaBC;
		float percentualE;
		float mediaidadeD;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int somaidadeA = 0;
		int somaidadeB = 0;
		int somaidadeC = 0;
		int somaidadeD = 0;
		int somaidadeE = 0;
		int maioridadeE = -999;
		int maioridadeA = -999;
		int maioridadeD = -999;
		int diferencaAD;

		for (lotacao = 1; lotacao <= 7; lotacao++) {
			System.out.println("\n\n\t PESQUISA de OPINIÃO " + "\n\nInsira sua IDADE: ");
			idade = leia.nextInt();
			System.out.println("Escolha se o filme foi: A, B, C, D, E ");
			escolha = leia.next();

			if (escolha.equalsIgnoreCase("A")) {
				A++;
				somaidadeA = somaidadeA + idade;
				if (maioridadeA < idade) {
					maioridadeA = idade;
				}
			}
			if (escolha.equalsIgnoreCase("B")) {
				B++;
				somaidadeB = somaidadeB + idade;
			}
			if (escolha.equalsIgnoreCase("C")) {
				C++;
				somaidadeC = somaidadeC + idade;
			}
			if (escolha.equalsIgnoreCase("D")) {
				D++;
				somaidadeD = somaidadeD + idade;
				if (maioridadeD < idade) {
					maioridadeD = idade;
				}
			}
			if (escolha.equalsIgnoreCase("E")) {
				E++;
				somaidadeE = somaidadeE + idade;
				if (maioridadeE < idade) {
					maioridadeE = idade;
				}
			}
		}
		percentualC = (C * 100) / (C + B);
		percentualB = (B * 100) / (C + B);
		diferencaBC = percentualC - percentualB;

		mediaidadeD = somaidadeE / E;

		percentualE = (E * 100) / (A + B + C + D + E);

		diferencaAD = maioridadeE - maioridadeA;

		System.out.println("\n\tA quantidade de escolhas 'A' foi " + A 
				+ "\n\tA diferença percentual entre respostas 'B' e 'C' foi: " + Math.abs(diferencaBC) + "%"
				+ "\n\tA media das idades das pessoas que responderam 'E' foi: " + mediaidadeD
				+ "\n\tA porcentagem de  respostas 'E' foi: " + percentualE + "%"
				+ "\n\tA idade da pessoa mais velha que respondeu 'E' foi: " + maioridadeE + " anos"
				+ "\n\tA diferença de idade entre as pessoas mais velhas que responderam 'A' e 'D' foi: " + diferencaAD + " anos");

	}
}
