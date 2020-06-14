package Lista6;
import java.util.Scanner;
public class exercicio01 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n\tCriar uma rotina de entrada que aceite somente um valor positivo.\n");
		
		float numero;
		int i = 0;
		
		System.out.print("\n Insira um numero qualquer ou digite \"0\" para finalizar o Programa: ");
		numero = leia.nextFloat();
		
		while (numero != i) {
			
			if (numero < 0) {
				System.out.print("> Esse número não foi aceito");
			} if (numero > 0) {
				System.out.print("> Esse número foi aceito!");
			}
			
			
			System.out.print("\n\n Insira um numero qualquer ou digite \"0\" para finalizar o Programa: ");
			numero = leia.nextFloat();	
			
			} if (numero == 0) {
			System.out.print("\n\t\t [FIM DO POGRAMA] ");
			
		}
	}
}
