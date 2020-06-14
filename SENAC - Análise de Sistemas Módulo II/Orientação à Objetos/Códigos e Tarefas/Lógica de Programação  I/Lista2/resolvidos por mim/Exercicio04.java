//	d)  Ler os dados de uma conta corrente: o nome do correntista, o nome do banco, o n�mero da conta,
//		o valor total de cheques a debitar, o total de dinheiro e cheques a creditar, o limite de cr�dito e o
//		saldo atual. Imprimir o nome do correntista, o nome do banco, o n�mero da conta e o saldo
//		dispon�vel (saldo dispon�vel = (saldo atual + valor do cr�dito + limite) - valor do d�bito).


package Lista2;

import java.util.Scanner;

public class Exercicio04{
	
		public static void main(String args[]) {
			
		String nomedocorrentista, nomedobanco;
		int numerodaconta;
		float chequesadebitar, totaldinheiro, chequesacreditar, limitedecredito, saldoatual, saldodisponivel;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Nome do correntista: ");
		nomedocorrentista = leia.nextLine();
		
		System.out.print("Digite o Nome do Banco: ");
		nomedobanco = leia.nextLine();
		
		System.out.print("Digite o Numero da Conta: ");
		numerodaconta = leia.nextInt();
		
		System.out.print("Digite o valor dos Cheques a debitar: ");
		chequesadebitar = leia.nextFloat();
		
		System.out.print("Digite o Total em Dinheiro: ");
		totaldinheiro = leia.nextFloat();
		
		System.out.print("Digite a quantidade de Cheques a debitar: ");
		chequesacreditar = leia.nextFloat();
		
		System.out.print("Digite Limite de Credito: ");
		limitedecredito = leia.nextFloat();
		
		System.out.print("Digite o Saldo Atual: ");
		saldoatual = leia.nextFloat();
		
		
		saldodisponivel = (saldoatual + chequesacreditar + limitedecredito) - chequesadebitar;
		
		System.out.println("O nome do correntista: " + nomedocorrentista);
		System.out.println("O nome do Banco: " + nomedobanco);
		System.out.println("O numero da conta: " + numerodaconta);
		System.out.println("O Valor dos cheques a debitar: " + chequesadebitar);
		System.out.println("O Total de dinheiro: " + totaldinheiro);
		System.out.println("O total de cheques a creditar: " + chequesacreditar);
		System.out.println("O Limite de credito: " + limitedecredito);
		System.out.println("O Saldo atual em conta: " + saldoatual);
		System.out.println("O Saldo disponivel: " + saldodisponivel);
			
		
		}
		
}