package Lista1;

//  8.  Calcular e exibir a tensão de um determinado circuito eletrônico 
//	a partir dos valores da resistência e 
//	corrente elétrica que serão digitados. 
//	Utilize a lei de Ohm (U=Ri). 

import java.util.Scanner;

public class Exercicio08 {

		public static void main(String args[]) {

	int U, R, i;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o valor da resistência: ");
	R = leia.nextInt();
	
	System.out.println("Digite o valor da corrente: ");
	i = leia.nextInt();

	U = R * i;
	
	System.out.println("O valor da resistencia será: " + U);
 	
	}	
}

