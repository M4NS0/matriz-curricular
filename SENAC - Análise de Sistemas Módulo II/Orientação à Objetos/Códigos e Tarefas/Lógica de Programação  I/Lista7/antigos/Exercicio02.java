package Lista7;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tFazer um algoritmo que calcule e imprima "
				+ "\n\to valor do somatório de todos os números"
				+ "\n\tde 1 a n, onde n e fornecido pelo usuário. ");
		
		int contador,num, numero;
		
		num = 2;
		contador = 1;
		
		System.out.println("\n\tInsira um numero que define o fim da soma de numeros apartir do numero 1: ");
		numero = leia.nextInt();
		
		while (numero > contador) {
			contador ++;
			num = num + contador;	
		}
		
		while (numero < contador) {
			contador --;
			num = num + contador;
		}
		System.out.println("\tA Soma é igual a: " + num);

	}
}


