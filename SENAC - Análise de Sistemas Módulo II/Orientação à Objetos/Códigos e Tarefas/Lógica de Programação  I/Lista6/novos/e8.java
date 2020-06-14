package Lista6;

import java.util.Scanner;

public class e8 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		System.out.println("");
		
		int contador, soma = 0;
		
		for (contador = 1; contador <=100; contador ++) {
			soma = soma + contador;
			
			System.out.println(soma);
		}
	}
}
