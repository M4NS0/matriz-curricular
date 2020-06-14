package Lista5;
import java.util.Scanner;
public class exercicio05 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tSimular o jogo de adivinhação: o jogador 1 escolhe um número entre 1 e 10;"
				+ "\n\to jogador 2 insere números na tentativa de acertar o número escolhido pelo jogador 1."
				+ "\n\tQuando ele acertar, o algoritmo deve informar que ele acertou o número x"
				+ "\n\t(escolhido pelo jogador 1)em x tentativas (quantidade de tentativas do jogador 2).");
		
		
		int p1escolha, p2escolha, i = 1;
		String player1, player2;
		
		System.out.println("\n\tPlayer 1, insira seu nome: ");
		player1 = leia.nextLine();
		
		System.out.println("\n\tPlayer 2, insira seu nome: ");
		player2 = leia.nextLine();
		
		System.out.println("\n\t" + player1 +", escolha um numero entre 1 e 10: ");
		p1escolha = leia.nextInt();
				
		System.out.println("\n\t" + player2 +", escolha um numero entre 1 e 10: ");
		p2escolha = leia.nextInt();
		
		while (p1escolha != p2escolha) {
			System.out.println("\n\tVocê errou! Escolha um novo número: ");
			p2escolha = leia.nextInt();
			i ++;
		}
			
		System.out.println("\n\t" + player2 + " você acertou o número de " + player1 + " (numero " + p1escolha +")" + " em  " + i + " tentativa(s)");
			
			}
		}
	