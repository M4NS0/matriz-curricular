package Lista7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\tUma Companhia de teatro planeja dar uma série de espetáculos."
				+ "\n\tA direção calcula que, a R$ 6,00 o ingresso, serão vendidos 130 ingressos"
				+ "\n\te as despesas montarão em R$300,00. A uma diminuição de R$ 0,60 no preço"
				+ "\n\tdos ingressos espera-se que haja um aumento de 30 ingressos vendidos."
				+ "\n\tFazer um algoritmo que escreva uma tabela de valores do lucro esperado "
				+ "\n\tem função do preço do ingresso, fazendo-se variar este preço de R$ 6,00 a"
				+ "\n\tR$ 1,00 de R$ 0,60 em R$ 0,60. Escreva ainda o lucro máximo esperado, o "
				+ "\n\tpreço e o número de ingressos correspondentes.");

		System.out.println("\n\t\tImprimindo Resultados:");
		
		// 0.6f o f indica um float
		float preçoFinal = 0.0f;
		float preço =  6.0f;
		float diminuiçao =  0.0f;
		float lucro = 0;
		int quantVendido = 130;
		int quantidadeFinalVendido = 0;
		int contador = 1;
		
		// DecimalFormat para converter na quantidade de casa decimal indicada
		DecimalFormat saida = new DecimalFormat("0.00");
		
		// serao necessarias 8 operacoes para o
		// preço ser diminuido de 5,40 até 1,20
		// porisso utiliza-se o contador
		for (contador = 1; contador <= 8; contador++) {

			// faz a diminuição de 0,60 em 0,60 por 8 vezes
			diminuiçao = (diminuiçao + 0.6f);

			// calcula o preço final conforme a diminuição
			preçoFinal = preço - diminuiçao;

			// soma 30 pessoas conforme o preço desce 0,60 por 8 vezes
			quantidadeFinalVendido = (30 * contador) + quantVendido;
			lucro = (quantidadeFinalVendido * preçoFinal) - 300;
			;
			System.out.println("     _______________________________________________" + "\n\n\tDiminuindo " + saida.format(diminuiçao)
					+ " R$ \n\tO preço final será: " + saida.format(preçoFinal) + " R$\n\tA quantidade vendida será: "
					+ quantidadeFinalVendido + " Ingressos\n\tE o Lucro será de: " + saida.format(lucro) + " R$");
		}
	}
}
