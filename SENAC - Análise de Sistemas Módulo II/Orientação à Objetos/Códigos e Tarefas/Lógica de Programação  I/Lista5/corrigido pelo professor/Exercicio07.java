package Lista5c;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		String nome, cpf;
		int cont = 1, numDep, opcao = 1;
		float rendaAnual, desconto, rendaLiq, imposto;
		Scanner leia = new Scanner(System.in);
		

		while (opcao != 0) {
			System.out.print("Digite o CPF " + cont + "� contribuinte: ");
			cpf = leia.next();
			System.out.print("Digite o nome: ");
			nome = leia.next();
			System.out.print("Digite a Renda Anual: ");
			rendaAnual = leia.nextFloat();
			System.out.print("Digite o n� de dependentes: ");
			numDep = leia.nextInt();

			desconto = numDep * 110;
			rendaLiq = rendaAnual - desconto;
			
			if (rendaLiq <= 900) {
				System.out.println("A renda l�quida = R$ " + rendaLiq + " e o contribuinte est� ISENTO!");
			}
			else if (rendaLiq <= 5000){
				imposto = rendaLiq * 0.05f; // 5/100
				System.out.println("A renda l�quida = R$ " + rendaLiq + " e o contribuinte pagar� R$ !" + imposto + " de imposto.");
			}
			else if (rendaLiq <= 10000){
				imposto = rendaLiq * 0.10f; // 5/100
				System.out.println("A renda l�quida = R$ " + rendaLiq + " e o contribuinte pagar� R$ !" + imposto + " de imposto.");
			}
			else {
				imposto = rendaLiq * 0.15f; // 5/100
				System.out.println("A renda l�quida = R$ " + rendaLiq + " e o contribuinte pagar� R$ !" + imposto + " de imposto.");
			}
			
			cont = cont + 1;
			
			System.out.println("Deseja continuar cadastrando? 1 = Sim e 0 = N�o: ");
			opcao = leia.nextInt();
		}
		System.out.println("Fim do programa");
	}

}
