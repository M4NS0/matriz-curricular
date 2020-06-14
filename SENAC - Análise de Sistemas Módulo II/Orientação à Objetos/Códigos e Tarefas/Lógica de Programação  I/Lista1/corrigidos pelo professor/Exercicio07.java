
// 7.	 Sabendo que uma milha marítima equivale a
//	 um mil, oitocentos e cinqüenta e dois metros e que um 
//	 quilômetro possui mil metros, 
// 	 fazer um programa para converter milhas marítimas em quilômetros.


import java.util.Scanner;

public class Exercicio07 {

		public static void main(String args[]) {
		
	int km, milha;
	
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o valor a ser convertido para quilometros: ");
	milha = leia.nextInt();
	
	km = (milha * 1852) / 1000;

	System.out.println("O valor das milhas em quilometros é: " + km);

	}
}
