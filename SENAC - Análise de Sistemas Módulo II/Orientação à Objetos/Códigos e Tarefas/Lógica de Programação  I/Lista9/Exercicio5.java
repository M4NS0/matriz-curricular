package Lista9;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\n\n\tUm armazém contém 400 produtos e para cada tipo de produto existe um código."
						     + "\n\tFaça um  algoritmo  para  ler o código do produto e a quantidade em estoque."
						     + "\n\tDepois, monte dois vetores para armazenar  respectivamente  os  códigos  das"
						     + "\n\tmercadorias e a quantidade dos produtos.");
		
		final int MAX = 400;
		String[] codigo = new String[MAX];
		int[] quantidade = new int[MAX];
		int contador;
		
		
		for (contador = 0; contador < MAX; contador ++) {
			System.out.println("\nDigite o CÓDIGO do produto: ");
			codigo[contador] = leia.next();
			
			System.out.println("\nDigite a QUANTIDADE em estoque do produto " + codigo[contador] + ": " );
			quantidade[contador] = leia.nextInt();
		}
		System.out.println("\n\t    LISTA DE PRODUTOS E A QUANTIDADE DELES \n        -----------------------------------------------\n");
		for (contador = 0; contador < MAX; contador ++) {
			System.out.println("\t  " + (contador+1) +  "→ PRODUTO '" + codigo[contador] + "' tem " + quantidade[contador] + " unidades no estoque" );
		}
}
}
