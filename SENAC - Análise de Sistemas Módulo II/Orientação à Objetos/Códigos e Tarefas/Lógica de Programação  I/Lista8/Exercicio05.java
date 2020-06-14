package Lista8;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\n\t5. Uma loja usa os seguintes códigos para as transações\n" + "\tde cada dia:\n"
				+ "\n" + "\t“d” – para compras à vista em dinheiro;\n" + "\t“c” – para compras ‘a vista em cheque.\n"
				+ "\n" + "\tÉ dada uma lista de transações contendo o valor de  cada \n"
				+ "\tcompra e o respectivo código da transação. Considere que \n" + "\thouve 25 transações no dia.\n"
				+ "\n" + "\tFaça um algoritmo que calcule e imprima:\n"
				+ "\t- valor total das compras à vista em dinheiro;\n"
				+ "\t- valor total das compras à vista em cheque;\n" + "\t- valor total das compras efetuadas..");

		
		// Para uma loja, ideal que esse numero seja definido pelo proprio usuario devido
		// a variacao de vendas ao dia.
		// MAS o problema pede 25 transações e, para teste, modifica-se o MAX para um numero minimo
		final int MAX = 25;

		// codigo transação
		int codigo;

		// forma de pagamento, a vista ou cheque
		String formadePG;

		// valor de cada compra
		double valor;

		// cadastros
		int cadastros;

		// uso do double para permitir numeros com virgulas, quebrados e grandes.
		// apenas inicia se for um valor que estiver dentro de um laço de repeticao

		// memoriza os pagamentos em dinheiro e inicializa com zero
		double pgDinheiro = 0;

		// memoriza os pagamentos em cheque e inicializa com zero
		double pgCheque = 0;

		// memoriza a soma do dinheiro gasto em dinheiro e inicializa com zero;
		double somaDinheiro = 0;

		// memoriza a soma do dinheiro gasto em cheque e inicializa com zero;
		double somaCheque = 0;

		// memoriza o valor total das vendas
		double valorTotal = 0;

		// laço:
		// é utilizado quando precisa cadastrar muitas coisas pra depois gerar um relatorio
		// ja que o problema define um incio e um fim, pode utilizar o FOR invez de WHILE
		// assim que alcançar 25 ele vai parar de cadastrar
		// cadastro inicia com 1 e repete 25 vezes (definido em MAX)
		// PARA cadastro iniciando em 1; roda até 25 vezes cadastro é igual ao cadastro anterior mais um cadastro (contador)
		for (cadastros = 1; cadastros <= MAX; cadastros++) {

			// cadastro:
			// input 1 numero do produto
			System.out.println("\n___________________________\nInsira o NÚMERO do produto: ");
			codigo = leia.nextInt();

			// input 2 valor do produto
			System.out.println("\nInsira o VALOR do No " + codigo + ": ");
			valor = leia.nextDouble();

			// input 3 forma de pagamento
			System.out.println("\nInsira qual foi a  FORMA de PAGAMENTO do produto No " + codigo
					+ "\nse 'D' em dinheiro ou 'C' em cheque do produto");
			formadePG = leia.next();

			// filtrando informações e memorizando
			// se a forma de pagamento for em dinheiro, memorizar em pgDinheiro
			// igual a D e ignora resposta em letra minuscula
			if (formadePG.equalsIgnoreCase("D")) {

				// contador de pagamentos em dinheiro
				pgDinheiro++;

				// soma produtos que foram pagos em dinheiro
				somaDinheiro = pgDinheiro * valor;
			}
			// se a forma de pagamento for em cheque, memorizar em pgCheque
			// igual a C e ignora resposta em letra minuscula
			if (formadePG.equalsIgnoreCase("C")) {

				// contador de pagamentos em dinheiro
				// multiplicando as vezes q a opcao dinheiro foi utilizada pelo valor
				pgCheque++;

				// soma produtos que foram pagos em cheque
				// multiplicando as vezes q a opcao cheque foi utilizada pelo valor
				somaCheque = pgCheque * valor;
			}

			// O valor total de todas as compras efetuadas ainda dentro do laço
			valorTotal = somaDinheiro + somaCheque;

		} 	//sai do laço 
		
		// Imprimindo resultados:
		// firulas cosmeticas
		// output 1 - valor total das compras à vista em dinheiro
		// output 2 - valor total das compras à vista em cheque
		// output 3 - Total gasto nas 25 compras
		// firulas cosmeticas
		System.out.println(" __________________________________"
				+ "\n| sub Total em DINHEIRO: " + somaDinheiro + "R$    "
				+ "\n|   sub Total em CHEQUE: " + somaCheque + "R$    "
				+ "\n|               > Total: " + valorTotal + "R$    "
				+ "\n|__________________________________");
				
	}
}
