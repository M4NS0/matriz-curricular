package Lista6;

import java.util.Scanner;

public class e10 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		
		float numerador = 1, denominador = 2, num;
		float divisao, somaParcial = 0;
		
		System.out.println("Insira um numero:");
		num = leia.nextInt();
		
		while (num < 0 || num > 50) {
			System.out.println("Invalido! Insira um numero:");
			num = leia.nextInt();
		}
		while (num >= numerador) {
			divisao = numerador / denominador;
			numerador ++;
			denominador ++;
			somaParcial = somaParcial + divisao;
			
		}
		System.out.println("RESULTADO: " + somaParcial);
	
	}
}
