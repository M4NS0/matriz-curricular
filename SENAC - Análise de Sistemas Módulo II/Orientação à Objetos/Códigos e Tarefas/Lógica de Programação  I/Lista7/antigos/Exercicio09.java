package Lista7;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\n\tFaça um algoritmo que leia vários números positivos e calcule "
				+ "\n\te escreva a soma dos números pares e a média dos números impares. ");

		int media, n;
		int cadastrados = 0;
		int somaP = 0;
		int somaI = 0;
		int impares = 0 ;
		
		// laço de repetição infinito
		while (cadastrados >= 0) {
			cadastrados++;
			System.out.println("\nInsira um NUMERO, ou DIGITE '0' para TERMINAR: ");
			n = leia.nextInt();
			
			if (n < 0) {
				System.out.println("\nINVALIDO! Insira outro NUMERO, POSITIVO ou DIGITE '0' para TERMINAR: ");
				n = leia.nextInt();
			}
			if (n > 0) {
				if ((n % 2) == 0) {
					somaP = somaP + n;
				}
				if ((n % 2) != 0) {
					impares ++;
					somaI = somaI + n;
				}
			}
			media = somaI / impares;
			if (n == 0) {
				System.out.println("\n [FIM] \n\n---------------------RELATORIO---------------------");
				System.out.println("\nA soma dos PARES: " + somaP + "\nA media dos ÍMPARES: " + media);
				break; //deu ruim no laço devo ter errado em algo, por isso o break
			}
		}
	}

