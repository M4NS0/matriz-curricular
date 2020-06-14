package Lista1;
// 5. Solicitar o usuário que digite uma palavra e imprima: 
//    Qual o primeiro caractere da palavra e quantos caracteres ela possui. 


import java.util.Scanner;

public class Exercicio05 {

		public static void main(String args[]) {

	String palavra, caractere;
	int total;

	Scanner leia = new Scanner(System.in);
	
	System.out.print("Escreva uma palavra aleatória: ");
	palavra = leia.nextLine();

	caractere = palavra.substring(0,1);
	total = palavra.length();
	
	System.out.println("O primeiro caractere da palavra é: " + caractere);
	System.out.print("O Total de caracteres na palavra é: " + total);
	
	}
}	