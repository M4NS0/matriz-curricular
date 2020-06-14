package Lista5c;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		String mat;
		int cont = 1, freq, contAp = 0, contRep;
		final int MAX = 5;
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, media, somaNotaTurma = 0, mediaTurma;
		float maiorMedia = 0, menorMedia = 10;
		

		while (cont <= MAX) {
			// Leitura dos dados do aluno - letra a
			System.out.print("Digite a matrícula do " + cont + "º aluno: ");
			mat = leia.next();
			System.out.print("Digite a N1: ");
			n1 = leia.nextFloat();
			System.out.print("Digite a N2: ");
			n2 = leia.nextFloat();
			System.out.print("Digite a N3: ");
			n3 = leia.nextFloat();
			System.out.print("Digite a quantidade de aulas frequentadas (máx: 32): ");
			freq = leia.nextInt();

			// letra b
			media = (n1 + n2 + n3) / 3;
			somaNotaTurma = somaNotaTurma + media;
			if ((media >= 7) && (freq >= 26)) {
				System.out.println("O aluno com a matrícula de nº " + mat + " ficou com a média " + media + " e seu resultado final foi: APROVADO");
				contAp = contAp + 1;
			}
			else {
				System.out.println("O aluno com a matrícula de nº " + mat + " ficou com a média " + media + " e seu resultado final foi: REPROVADO");
			}
			
			if (media >= maiorMedia) {
				maiorMedia = media;
			}
			if (media <= menorMedia) {
				menorMedia = media;
			}
			cont = cont + 1;
		}
		
		mediaTurma = somaNotaTurma / MAX;
		System.out.println("Média da Turma = " + mediaTurma);
		System.out.println("Maior média da Turma = " + maiorMedia);
		System.out.println("Menor média da Turma = " + menorMedia);
		System.out.println("Alunos Aprovados  = " + contAp);
		contRep = MAX - contAp;
		System.out.println("Alunos Reprovados = " + contRep);
	}

}