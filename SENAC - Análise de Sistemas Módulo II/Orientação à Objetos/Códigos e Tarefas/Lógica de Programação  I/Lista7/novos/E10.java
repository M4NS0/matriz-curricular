package Lista7;

import java.util.Scanner;

public class E10 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		String escolha = "S";
		String sexo;
		int idade;
		float peso, altura;
		int contador = 0;
		int somaidade = 0;
		float mediaidade;
		float somapeso = 0;
		float maioraltura = -999;
		float menoraltura = 999;
		int idadeinferior= 0;
		float porcentageminferior;
		
		
		while (escolha.equalsIgnoreCase("S")) {
			contador ++;
			System.out.println("\n____________________________________\n\n\n#" + contador + " Qual a sua idade? ");
			idade = leia.nextInt();

			while (idade <= -1) {
				System.out.println("Idade INVALIDA! #" + contador + " Qual a sua idade? ");
				idade = leia.nextInt();
			}
			somaidade = somaidade + idade;
			
			System.out.println("Qual seu peso?");
			peso = leia.nextFloat();
			somapeso = somapeso + peso;

			System.out.println("Qual é sua altura?");
			altura = leia.nextFloat();
			
			if (maioraltura < altura) {
				maioraltura = altura;
			}
			if (menoraltura > altura) {
				menoraltura = altura;
			}

			System.out.println("Digite 'M' ou 'H':");
			sexo = leia.next();
			
			if (idade < 25 && sexo.equalsIgnoreCase("M")) {
				idadeinferior ++;
			}
			
			System.out.println("\nDeseja cadastrar mais alguém? 'S' ou 'N'");
			escolha = leia.next();	
			
		}
		porcentageminferior = (idadeinferior * 100) / contador;
		mediaidade = somaidade / contador;
		
		if (escolha.equalsIgnoreCase("N")) {
			System.out.println("\n\t   -------RELATORIO--------"
					+ "\n\t   >A MEDIA DE IDADE: " + mediaidade
					+ "\n\t   >A SOMA DOS PESOS: " + somapeso
					+ "\n\t   >A MENOR ALTURA É: " + menoraltura
					+ "\n\t   >A MAIOR ALTURA É: " + maioraltura
					+ "\n\t   >M MENOS  25 ANOS: " + porcentageminferior + "%");
		}
	}
}
