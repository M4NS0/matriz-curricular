package Lista8;
import java.util.Scanner;
public class Exercicio06 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\n _______________________________________________________________________________\n" +
				"|\t\t\t\t\t\t\t\t\t\t|\n" +
				"|\t 6. Uma  pessoa  construindo sua  residência  resolveu  colocar \t|\n" + 
				"|\t em sua casa uma caixa  para servir como  reservatório de  água.\t|\n" + 
				"|\t Considerando que a  caixa  seja  retangular, faça um algoritmo\t\t|\n" + 
				"|\t que leia as dimensões da caixa (comprimento, altura e largura),\t|\n" + 
				"|\t calcule e escreva o volume de  água  que  pode ser  armazenado.\t|\n" +
				"|_______________________________________________________________________________|");
	
		double comprimento, altura, largura, volume;
		
		// Input:
		System.out.println("\n\nDigite o COMPRIMENTO: ");
		comprimento = leia.nextDouble();
		
		System.out.println("     Digite a ALTURA: ");
		altura = leia.nextDouble();
		
		System.out.println("    Digite a LARGURA: ");
		largura = leia.nextDouble();
		
		// calculando o volume
		volume = comprimento*altura*largura;
		
		// Output: 
		System.out.println("> O volume da Caixa d'água é de: " + volume + " metros cúbicos <");
	}
	
}
