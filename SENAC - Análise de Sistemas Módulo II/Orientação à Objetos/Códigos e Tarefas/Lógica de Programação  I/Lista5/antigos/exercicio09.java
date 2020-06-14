package Lista5;
import java.util.Scanner;
public class exercicio09 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tA avaliação de um aluno nas disciplinas de uma escola segue os critérios abaixo:"
				+ "\n\t- Em toda disciplina são aplicadas três provas"
				+ "\n\t- A média final é obtida com a média aritmética das três notas"
				+ "\n\t- Para que o aluno seja aprovado, a sua média deve ser igual ou superior a 7,0"
				+ "\n\t- Ter a freqüência mínima de 80% das 32 aulas ministradas."
				+ "\n\n\tEsse Script ira: \n"
				+ "\n\ta) Ler os números das matrículas de 70 alunos, as três notas de cada um e o número de aulas freqüentadas por eles;"
				+ "\n\tb) Calcular e imprimir o número da matrícula do aluno,a sua média final e o resultado (se aprovado ou não);"
				+ "\n\tc) Imprimir a média da turma, a maior e a menor média da turma de alunos;"
				+ "\n\td) Imprimir o total de alunos aprovados;"
				+ "\n\te) Imprimir o total de alunos reprovados por falta e por nota.");
		
		
		int i,matricula,frequenciatotal;
		double n1,n2,n3,media,mediadaescola,mediaaprovado,mediareprovado,mediaturma,frequenciadoaluno,frequenciaaprovado,frequenciareprovado,frequenciaminima;
		
		i=0;
		mediadaescola = 70.0;
		frequenciatotal = 32;
		frequenciaminima = frequenciatotal * (80/100);
		mediaaprovado = 0;
		mediareprovado = 0;
		frequenciaaprovado = 0;
		frequenciareprovado = 0;
		
		
		while (i<2) { 
			System.out.println("\n\tInsira o numero de matricula do aluno: ");
			matricula = leia.nextInt();
			
			System.out.println("\tInsira o Valor da n1 de "  + matricula + ": ");
			n1 = leia.nextInt();
			
			System.out.println("\tInsira o Valor da n2 de "  + matricula + ": ");
			n2 = leia.nextInt();
			
			System.out.println("\tInsira o Valor da n3 de "  + matricula + ": ");
			n3 = leia.nextInt();
			
			System.out.println("\tInsira a quantidade de aulas que o aluno de matricula numero " + matricula + " frequentou: ");
			frequenciadoaluno = leia.nextInt();
			
			
			media = (n1+n2+n3) / 3;

				if (media >= mediadaescola) { 
					mediaaprovado ++;
					} else if (media < mediadaescola) {
					mediareprovado ++;
					} else if (frequenciadoaluno >= frequenciaminima) {
					frequenciaaprovado ++;
					} else if (frequenciadoaluno < frequenciaminima){
					frequenciareprovado ++;
	
			i++;	
			}
			
				System.out.println("\n\tMatricula: " + matricula);
				System.out.println("\tMédia Final: " + media);
					if (media>=mediadaescola) {
						System.out.println("\t\t [ APROVADO ]");	
					} else if (media<mediadaescola){
						System.out.println("\t\t [ REPROVADO ]");	
			
			}
			i++;
			
				}
			
			
	
	}		
		
	
}


