package Lista1;
// 6. 	Solicitar ao usuário quatro valores quaisquer. 
//  	Imprimir a raiz quadrada do primeiro, 
//  	o segundo valor digitado multiplicado por 10, 
//	o terceiro menos 1 e 
// 	o quarto valor será a soma de todos os resultados anteriores. 


import java.util.Scanner;

public class Exercicio06 {

		public static void main(String args[]) {

	int v1, v2, v3, v4;
	float calc1, calc2, calc3, calc4;
	
	Scanner leia = new Scanner(System.in);

	System.out.println("Escreva o primeiro valor: ");
	v1 = leia.nextInt();

	System.out.println("Escreva o segundo valor: ");
	v2 = leia.nextInt();

	System.out.println("Escreva o terceiro valor: ");
	v3 = leia.nextInt();

	System.out.println("Escreva o quarto valor: ");
	v4 = leia.nextInt();

	calc1 = (float)Math.sqrt(v1);
	calc2 = v2 * 10;
	calc3 = v3 - 1;
	calc4 = calc1 + calc2 + calc3;

	System.out.println("A raiz quadratica do primeiro numero é: " + calc1);
	System.out.println("O segundo valor digitado multiplicado por dez é: " + calc2);
	System.out.println("O terceiro valor digitado menos um é: " + calc3);
	System.out.println("O quarto valor sera a soma dos resultados anteriores: " +calc4);

	}
}