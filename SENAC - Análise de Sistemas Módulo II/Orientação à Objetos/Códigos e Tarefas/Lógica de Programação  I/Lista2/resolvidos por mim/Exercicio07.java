// g)    O pre�o de um produto ao consumidor � a soma do pre�o de custo mais as porcentagens de
// 		impostos e a do distribuidor. Ler o nome do produto, seu custo de f�brica e as taxas de impostos e
//		do distribuidor. Imprimir o nome do produto e o pre�o final ao consumidor. 


package Lista2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {
		
		String nome;
		float custo, imposto, taxadistribuidor, precofinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		nome = 	leia.nextLine();
		
		System.out.print("Digite o valor do custo: ");
		custo = leia.nextFloat();
		
		System.out.print("Digite o valor da taxa de imposto: ");
		imposto = leia.nextFloat();
		
		System.out.print("Digite o valor da taxa do distribuidor: ");
		taxadistribuidor = leia.nextFloat();
		
		precofinal = custo + imposto + taxadistribuidor;
				
		System.out.println("O nome do produto:  " + nome);
		System.out.println("O Preco final ao consumidor: " + precofinal);
		
	}
}
