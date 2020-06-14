package Lista3;
import java.util.Scanner;
public class exercicio01{

	
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2;
				
		System.out.print("\n\tEste programa tem objetivo de ler dois números e \n\tverificar qual o menor e qual o maior");
	
		System.out.print("\n\n\tInforme o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.print("\n\tInforme o segundo numero: ");
		n2 = leia.nextFloat();
		
		if (n1>n2) { 
			System.out.print("\n\tO primeiro numero digitado é MAIOR que o segundo.");
		} else if (n1<n2) {
			System.out.print("\n\tO primeiro numero digitado é MENOR que o segundo.");
			
		}
		
		
		
		
		
	}
}
