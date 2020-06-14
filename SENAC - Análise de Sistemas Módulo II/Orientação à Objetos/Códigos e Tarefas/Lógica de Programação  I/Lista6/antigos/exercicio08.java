package Lista6;
import java.util.Scanner;
public class exercicio08 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tExibir a soma dos números inteiros positivos do intervalo de um a cem.");
		///soma de gauss
		
		int contador;
		int n1 = 2;
		contador = 1;
		
		while (contador<=100) {
			contador++;
			n1 = n1 + contador;
			
		}
		System.out.println("\n\tA soma dos numeros inteiros de um a cem igual a: " + n1);
		}
		}
