package Lista6c;

import java.util.Scanner;

public class Exercicio03B {

	public static void main(String[] args) {
		
		String sexo;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o sexo da pessoa (M ou F): ");
		sexo = leia.next();
		
		while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
			System.out.print("Sexo inv�lido! Digite o sexo da pessoa (M ou F): ");
			sexo = leia.next();
		}
		System.out.println("Fim do programa!");

	}

}
