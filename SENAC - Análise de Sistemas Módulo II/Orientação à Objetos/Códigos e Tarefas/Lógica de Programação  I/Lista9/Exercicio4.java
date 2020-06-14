package Lista9;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String args[]) { 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\n\tLer 50 nomes de professores e seus  respectivos tempos de profissão."
				 		+  "\n\tArmazenar esses valores em dois vetores: PROFESSOR e TEMPOPROFISSAO.");
	final int MAX = 50;
	String[] professor = new String[MAX];
	int[] tempoProfissao = new int[MAX];
	int cont;
	
	for (cont = 0; cont < MAX; cont++) {
		System.out.println("\nDigite o nome do(a) professor(a) n°" +(cont + 1) + ":");
		professor[cont] = leia.next();
		System.out.println("Digite o tempo de profissão do(a) professor(a) " + professor[cont]  + " em anos: ");
		tempoProfissao[cont] = leia.nextInt();
		
	}
	
	System.out.println("\n\tLISTA DE PROFESSORES E DE TEMPO DE PROFISSAO DELES \n     -----------------------------------------------------\n");
	for (cont = 0; cont < MAX; cont++) {
		System.out.println("\n" + (cont+1) +  "→ Professor(a) " + professor[cont] + " tem " + tempoProfissao[cont] + " anos de experiencia" );
	}
	
	
	
	
	}
}
