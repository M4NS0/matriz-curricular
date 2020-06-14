package Lista5;
import java.util.Scanner;
public class exercicio06 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tCadastrar e imprimir os dados das disciplinas de uma escola:"
				+ "\n\tnome, descrição do conteúdo, freqüência e nota mínima para aprovação do aluno.");
		
		String nome, descricao, frequencia, nota;
		int repeticao = 1;
		
		
		
		while (repeticao>=1) {
			repeticao ++;	
			System.out.println("\nInsira o nome da matéria: ");
			nome = leia.next();
			
			System.out.println("Insira sua descrição: ");
			descricao = leia.next();
			
			System.out.println("Insira o total de frequencia: ");
			frequencia = leia.next();
			
			System.out.println("Insira a nota minima para a aprovação desta: ");
			nota = leia.next();
		
		
			System.out.println("\t" + nome);
			System.out.println("\t" + descricao);
			System.out.println("\t" + frequencia + " é o total de aulas que tem nessa matéria");
			System.out.println("\t" + nota + " é a nota minima para aprovação do aluno");
	
			

			}
		
		}
	}
