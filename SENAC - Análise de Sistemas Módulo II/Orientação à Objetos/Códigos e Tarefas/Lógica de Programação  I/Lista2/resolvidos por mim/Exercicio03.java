// c)   Em uma loja existe um total mensal de vendas. Fazer a leitura do nome da loja e dos totais de
// 		vendas em um ano. Imprimir o nome da loja e os totais de vendas semestrais.


package Lista2;

import java.util.Scanner;

public class Exercicio03{
	
		public static void main(String args[]) {

		String nome;
		int totalanual, totalsemestre;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Nome da Loja: ");
		nome = leia.nextLine();
		
		System.out.print("Digite o total das vendas em um ano: ");
		totalanual = leia.nextInt();
		
		totalsemestre = totalanual / 2;
		
		System.out.println("Total de vendas no ano: " + totalanual);
		System.out.println("Total de vendas por semestre: " + totalsemestre);
				
			
	}
}