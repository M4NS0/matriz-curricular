package Lista8;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\n\t\t\t4. Um supermercado  deseja reajustar os preços de seus\n"
				+ "\t\t\tprodutos usando o seguinte critério: o produto  poderá\n"
				+ "\t\t\tter seu  preço aumentado ou  diminuído. Para alterar o \n"
				+ "\t\t\tpreço, o produto  deve preencher  pelo  menos  um  dos \n" + "\t\t\trequisitos a seguir:\n"
				+ "\n\t ________________________________________________________________________________________"
				+ "\n\t|\tREQUISITOS\t|\t\t\tREAJUSTES\t\t\t\t |"
				+ "\n\t------------------------------------------------------------------------------------------"
				+ "\n\t| VENDA MEDIA MENSAL    |\tPREÇO ATUAL \t\t| % DE AUMENTO\t| % DE DIMINUIÇÃO|"
				+ "\n\t|   < 500\t\t|     < 30,00 R$\t\t|\t10\t|     -----\t |"
				+ "\n\t|  >= 500 e < 1200\t|    >= 30,00 R$ e < 60 R$\t|\t15\t|     ----- \t |"
				+ "\n\t|  >= 1200 \t\t|    >= 80,00 R$ e < 60 R$\t|     ------\t|\t20\t |"
				+ "\n\t------------------------------------------------------------------------------------------"
				+ "\n\n Faça um algoritmo que receba  o  preço atual e a venda "
				+ "mensal média do produto, calcule e mostre o novo preço.\n");

		float valor, valorAtualizado;
		int quant;

		System.out.println("\n\nInsira o Valor atual do produto: ");
		valor = leia.nextFloat();
		System.out.println("\n\nInsira a Quantidade mensal vendida do produto: ");
		quant = leia.nextInt();

		if (quant < 500 && valor < 30) {
			valorAtualizado = valor + (valor * (0.1f));
			System.out.println("\nO Valor do produto atualizado, segundo a tabela é: " + valorAtualizado + " R$");
		}
		if ((quant >= 500 && quant < 1200) && (valor >= 30 && valor < 60)) {
			valorAtualizado = valor + (valor * (0.15f));
			System.out.println("\nO Valor do produto atualizado, segundo a tabela é: " + valorAtualizado + " R$");
		}
		if ((quant >= 1200) && (valor >= 60 && valor < 80)) {
			valorAtualizado = valor - (valor * (0.2f));
			System.out.println("\nO Valor do produto atualizado, segundo a tabela é: " + valorAtualizado + " R$");
		}
	}
}
