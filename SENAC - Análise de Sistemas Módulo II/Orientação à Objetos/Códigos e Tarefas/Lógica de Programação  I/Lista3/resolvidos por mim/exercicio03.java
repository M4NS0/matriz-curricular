package Lista3;
import java.util.Scanner;
public class exercicio03 {
		
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("\n\tEste programa deve ler os anos de nascimento de duas pessoas\n\te calcular suas idades. Imprimir o nome e a idade de cada uma\n\te indicar qual a mais nova.");
	
	String nome1, nome2;
	int idade1, idade2;
	
	System.out.print("\n\n\tDigite o nome da primeira pessoa: ");
	nome1 = leia.nextLine();
	
	System.out.print("\n\tDigite o nome da segunda pessoa: ");
	nome2 = leia.nextLine();
	
	System.out.print("\n\tAgora, digite o ano de nascimento de " + nome1 + ": ");
	idade1 = leia.nextInt();
	
	System.out.print("\n\tPor fim, digite o ano de nascimento de " + nome2 + ": ");
	idade2 = leia.nextInt();
	
	if (idade1<idade2) { 
		System.out.print("\n\t" + nome2 + " é mais novo(a) que " + nome1);
	} else if  (idade1>idade2) {
		System.out.print("\n\t" + nome2 + " é mais velho(a) que " + nome1);
		
		}
	
	}	
}
