package Lista6;
import java.util.Scanner;
public class exercicio02 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n\tEntrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro."
				+ "\n\tCaso contrário solicitar novamente apenas o segundo valor.");
		
		
		float valor1,valor2;
		
		
		
		System.out.print("\n\nInsira o Primeiro Valor: ");
		valor1 = leia.nextFloat();
		System.out.print("Insira o Segundo Valor: ");
		valor2 = leia.nextFloat();
		
		while (valor1 != valor2) { 
			if (valor1<valor2) {
			System.out.print("\t\t\t[OK]");
			} else if (valor1>valor2) {
				System.out.print("Segundo numero MAIOR que o primeiro. Insira o Segundo Valor novamente: ");
				valor2 = leia.nextFloat();
		
			}
			System.out.print("\n\nInsira o Primeiro Valor: ");
			valor1 = leia.nextFloat();
			System.out.print("Insira o Segundo Valor: ");
			valor2 = leia.nextFloat();
		
			}
		}
	}
