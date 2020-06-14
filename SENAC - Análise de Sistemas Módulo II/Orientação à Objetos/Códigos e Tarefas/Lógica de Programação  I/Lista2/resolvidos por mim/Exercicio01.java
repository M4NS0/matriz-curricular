//	a)  Ler o nome e as tr�s notas de um qualquer aluno, o nome da disciplina e o n�mero da turma.
//		Imprimir os dados lidos e a m�dia aritm�tica das notas (soma das notas dividida por tr�s).

package Lista2;

import java.util.Scanner;

public class Exercicio01{
	
		public static void main(String args[]) {
			
			String nome, diciplina;
			int nota1, nota2, nota3, turma, media;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Escreva o Nome: ");
			nome = leia.nextLine();
			
			System.out.print("Escreva o nome da diciplina: ");
			diciplina = leia.nextLine();
			
			System.out.print("Escreva o numero da turma: " );
			turma = leia.nextInt();
			
			System.out.println("Escreva o valor da primeira nota: " );
			nota1 = leia.nextInt();
			
			System.out.println("Escreva o valor da segunda nota: " );
			nota2 = leia.nextInt();
			
			System.out.println("Escreva o valor da terceira nota: " );
			nota3 = leia.nextInt();
			
			media = (nota1 + nota2 + nota3) / 3;
			
			System.out.println("O Nome do Aluno: " + nome);
			System.out.println("O Nome da Diciplina: " + diciplina);
			System.out.println("O Numero da Turma: " + turma);
			System.out.println("O Valor da primeira nota: " + nota1);
			System.out.println("O Valor da segunda nota: " + nota2);
			System.out.println("O Valor da terceira nota: " + nota3);
			System.out.println("A Media das Notas: " + media);
			
		}
		

}
