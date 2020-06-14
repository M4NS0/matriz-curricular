package Lista7;
import java.util.Scanner;
public class Exercicio06c {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
	
		System.out.println("\n\n\tO IBOPE encomendou-lhe um programa para"
				+ "\n\tregistrar as pesquisas das eleições entre " + "\n\tos candidatos A, B e C. Faça um programa que"
				+ "\n\tdado o candidato escolhido (A, B ou C), a " + "\n\tidade e o sexo do eleitor(a), para um número "
				+ "\n\tindeterminado de eleitores, calcule e escreva:" + "\n\na) Qual o candidato mais votado ?"
				+ "\nb) Qual a média de idade entre os eleitores do candidato mais votado ? "
				+ "\nc) Qual o candidato preferido dos homens ?");
		
		
		String candidato, opcao = "N";
		int idade, sexo;
		int contA = 0;
		int contB = 0;
		int contC =0;	
		int contHomemA = 0, contHomemB = 0, contHomemC = 0;
		float somaA = 0, somaB = 0, somaC = 0, mediaIdade;
		
		while (!opcao.equalsIgnoreCase("S")) {
			System.out.println("\nEscolha entre A, B ou C");
			candidato = leia.next();
			System.out.println("Digite 1 para Homem e 2 para Mulher:");
			sexo = leia.nextInt();
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			
			if (candidato.equalsIgnoreCase("A")) {
				contA++;
				somaA= somaA + idade;
				
			}
			if (candidato.equalsIgnoreCase("B")) {
				contB++;
				somaB= somaB + idade;
				mediaIdade = somaA / contA;
			}
			if (candidato.equalsIgnoreCase("C")) {
				contC++;
				somaB= somaB + idade;
				mediaIdade = somaB / contA;
			}
			
					
		System.out.println("Sai do programa? 'S' ou 'N': ");
		opcao = leia.next();
		}
		if (contA>contB && contA>contC) {
			System.out.println("_________________RESULTADO_________________\n\t> A foi o mais votado");
			mediaIdade = somaA / contA;
			System.out.println("\n> A media do Mais votado (A): " +mediaIdade);
		}
		else if (contB>contA && contB>contC) {
			System.out.println("_________________RESULTADO_________________\n\t> B foi o mais votado");
			mediaIdade = somaA / contA;
			System.out.println("\n> A media do Mais votado (B): " +mediaIdade);
		}
		else if (contB>contA && contB>contC) {
			System.out.println("_________________RESULTADO_________________\n\t> B foi o mais votado");
			mediaIdade = somaB / contA;
			System.out.println("\n> A media do Mais votado (C): " +mediaIdade);
		}
		else {
			System.out.println("_________________RESULTADO_________________\n\t>  C foi o mais votado");
		}
	}
	
}
