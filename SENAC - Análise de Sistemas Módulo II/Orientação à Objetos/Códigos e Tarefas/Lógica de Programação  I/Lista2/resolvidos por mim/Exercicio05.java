// e)   Ler o nome de um cliente de fast food e a quantidade de cada item do menu que ele vai pedir.
// 		Imprimir o nome do cliente e o total da compra.




package Lista2;

import java.util.Scanner;

public class Exercicio05{

	public static void main(String args[]) {
		
	String nome;
	int bigmac, macfritas, refrigerante, casquinhadechocolate;
	float valor1, valor2, valor3, valor4, valortotal;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite o Nome do Cliente: ");
	nome = leia.nextLine();
	
	System.out.print("A quantidade de BigMacs: ");
	bigmac = leia.nextInt();
	
	System.out.print("O valor do BigMac: ");
	valor1 = leia.nextFloat();
		
	System.out.print("A quantidade de MacFritas: ");
	macfritas = leia.nextInt();
	
	System.out.print("O valor da MaCFritas: ");
	valor2 = leia.nextFloat();
	
	System.out.print("Copos de refrigerante: ");
	refrigerante = leia.nextInt();
	
	System.out.print("O valor do copo de refrigerante: ");
	valor3 = leia.nextFloat();
	
	System.out.print("A quantidade de casquinha de chocolate: ");
	casquinhadechocolate = leia.nextInt();
	
	System.out.print("O valor da Casquinha de Chocolate: ");
	valor4 = leia.nextFloat();
	
	valortotal = (bigmac * valor1) + (macfritas * valor2) + (refrigerante * valor3) + (casquinhadechocolate * valor4);
	
	System.out.println("O nome do Cliente: " + nome);
	System.out.println("O valor total da compra: " + valortotal);
			
		
	}
}
