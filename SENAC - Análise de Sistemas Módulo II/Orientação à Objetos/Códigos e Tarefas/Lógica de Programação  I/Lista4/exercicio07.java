package Lista4;
import java.util.Scanner;

public class exercicio07 {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
		System.out.print("\n\tUma escola com cursos em regime semestral, realiza duas avaliações durante o semestre" +
		"\n\te calcula a média do aluno, da seguinte maneira: MEDIA = (P1 + 2P2) / 3" +
		"\n\tFazer um programa para entrar via teclado com os valores das notas (P1 e P2)" +
		"\n\te calcular a média. Exibir a situação final do aluno (\"Aprovado ou Reprovado\")" +
		"\n\tsabendo que a média de aprovação é igual a cinco\n\n");
				
		float avaliacao1,avaliacao2,media;
		
		System.out.print("\n\t\tDigite o valor da primeira nota: ");
		avaliacao1 = leia.nextFloat();
		
		System.out.print("\n\t\tDigite o valor da segunda nota: ");
		avaliacao2 = leia.nextFloat();
		
		media = (avaliacao1 + 2*avaliacao2)/3;
		
		if (media >= 50) {
			System.out.print("\n\t\tParabens voce foi aprovado!!");
		} else {
			System.out.print("\n\t\tVoce Bombou, infeliz! ");
		}
		
		
		
		
	}
}
