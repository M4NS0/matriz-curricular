// f)   Ler o valor de troca de um d�lar por um real e o valor de uma quantia em d�lar.
//		Imprimir a quantia de reais correspondente aos d�lares lidos.


package Lista2;

import java.util.Scanner;

public class Exercicio06{

	public static void main(String args[]) {
		
		float cotacao, quantidadedolar, valoremreais;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a Cota��o do dolar:  ");
		cotacao = 	leia.nextFloat();
		
		System.out.print("Digite a quantidade em dolares:  ");
		quantidadedolar = 	leia.nextFloat();
			
		
		valoremreais = quantidadedolar * cotacao;
		
		System.out.println("O valor dos dolares em reais: " + valoremreais);
				
		
	}
}
