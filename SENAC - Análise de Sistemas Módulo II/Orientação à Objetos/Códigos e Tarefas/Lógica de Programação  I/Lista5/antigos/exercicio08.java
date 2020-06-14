package Lista5;
import java.util.Scanner;
public class exercicio08 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tUma fábrica tem uma linha de produção capaz de produzir 400 peças/dia."
				+ "\nUm funcionário controla a qualidade, cadastrando o número da peça e o seu estado (aprovado ou reprovado)."
				+ "\nCriar um algoritmo para cadastrar"
				+ "\n- O controle de qualidade"
				+ "\n- Imprimir os números das peças reprovadas"
				+ "\n- O total de peças aprovadas e reprovadas no final do dia.");
		
		
		int i,numeropeca,aprovado,reprovado,qualidade;
	
		
		i = 0;
		aprovado = 0;
		reprovado = 0;
			
		while (i < 3) {
			System.out.println("\tInsira a numeração da peça: ");
			numeropeca = leia.nextInt();
			
			System.out.println("\tDigite \"1\" se a peça foi aprovada ou \"2\" se ela foi reprovada pela qualidade: ");
			qualidade = leia.nextInt();
				
			if (qualidade == 1) {
				aprovado ++;
			} else {
				reprovado ++;
				}
		i++;
		}
			System.out.print("\n\tPeças aprovadas: " + aprovado + "\nPeças Reprovadas: " + reprovado);
			
			//nao sei como imprimir a lista da numeracao dos aprovados e dos reprovados
	}
}

			
				
		
	