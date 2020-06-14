package Lista8;
import java.util.Scanner;
public class Exercicio03 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\n\n\n\t3. Escreva um algoritmo que receba uma medida em pés,\n" + 
				"\tfaça as conversões a seguir e mostre os  resultados.\n" + 
				"\n" + 
				"\ta) polegadas\n" + 
				"\tb) jardas\n" + 
				"\tc) milhas\n" + 
				"\t\n" + 
				"\tSabe-se que:\n" + 
				"\t1 pé = 12 polegadas\n" + 
				"\t1 jarda = 3 pés\n" + 
				"\t1 milha = 1760 jardas.");
		
		float num, polegadas, jardas, milhas;
		
		System.out.println("\n\tInsira a medida em PÉS para conversão para: POLEGADAS,JARDAS e MILHAS:");
		num = leia.nextFloat();
		
		polegadas = num * 12;
		jardas = num / 3;
		milhas = jardas / 176;
		
		System.out.println("\n\t EM POLEGADAS: " + polegadas + "\n\t EM JARDAS: " + jardas + "\n\t EM MILHAS: " + milhas);
	
	
	}
}


