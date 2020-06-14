package Lista3;
import java.util.Scanner;
public class exercicios02{

		public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n\tEste programa vai ler os nomes e os pesos de duas pessoas\n\te imprimir os dados da pessoa mais pesada.");
		
		String nome1, nome2;
		float peso1, peso2;
		
		System.out.print("\n\n\tDigite o nome da primeira pessoa:");
		nome1 = leia.nextLine();
		
		System.out.print("\tDigite o nome da segunda pessoa: ");
		nome2 = leia.nextLine();
		
		System.out.print("\n\tDigite o peso de " + nome1 + ": ");
		peso1 = leia.nextFloat();
		
		System.out.print("\tDigite o peso de " + nome2 + ": ");
		peso2 = leia.nextFloat();
		
		if (peso1>peso2) {
			System.out.print("\n\t" + nome1 +" é mais pesado que " + nome2);
		} else if (peso1<peso2) {
			System.out.print("\n\t" + nome1 +" é mais leve que " + nome2);
		}
		
	}
}
