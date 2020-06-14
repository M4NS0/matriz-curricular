package Lista7;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\tO IBOPE encomendou-lhe um programa para"
				+ "\n\tregistrar as pesquisas das eleições entre " + "\n\tos candidatos A, B e C. Faça um programa que"
				+ "\n\tdado o candidato escolhido (A, B ou C), a " + "\n\tidade e o sexo do eleitor(a), para um número "
				+ "\n\tindeterminado de eleitores, calcule e escreva:" + "\n\na) Qual o candidato mais votado ?"
				+ "\nb) Qual a média de idade entre os eleitores do candidato mais votado ? "
				+ "\nc) Qual o candidato preferido dos homens ?");

		String escolha, sexo, registro = "C";

		int idade;
		int A = 0;
		int B = 0;
		int C = 0;
		int H = 0;
		int M = 0;
		
		while (registro.equalsIgnoreCase("C") || (registro.equalsIgnoreCase("fim"))) {

			System.out.println("\nEscolha entre os candidatos 'A','B' ou 'C':");
			escolha = leia.next();

			if (escolha.equalsIgnoreCase("A")) {
				A++;
			}
			if (escolha.equalsIgnoreCase("B")) {
				B++;
			}
			if (escolha.equalsIgnoreCase("C")) {
				C++;
			}
			if (!escolha.equalsIgnoreCase("C") || !escolha.equalsIgnoreCase("B") || !escolha.equalsIgnoreCase("A")) {
				System.out.println("\nCandidato NÃO cadastrado, escolha entre os candidatos 'A','B' ou 'C':");
				escolha = leia.next();
			}

			System.out.println("Digite:\n'H' se você for Homem \n'M' se você for Mulher: ");
			sexo = leia.next();

			if (sexo.equalsIgnoreCase("H")) {
				H++;
			}
			if (sexo.equalsIgnoreCase("M")) {
				M++;
			} else {
				System.out.println("Sexo INVALIDO, escolha 'M' ou 'H': ");
				sexo = leia.next();
			}

			System.out.println("Qual sua IDADE?");
			idade = leia.nextInt();

			if (idade < 16) {
				System.out.println("MENORES de 16 anos NÃO votam");

			}

			System.out.println("\n\nDigite 'C' para cadastrar e 'fim' para sair e Imprimir estatisticas: ");
			registro = leia.next();

			if (!registro.equalsIgnoreCase("C")) {
				System.out.println("\n\n_______________________RELATÓRIO_______________________");

			}
		}
	}



