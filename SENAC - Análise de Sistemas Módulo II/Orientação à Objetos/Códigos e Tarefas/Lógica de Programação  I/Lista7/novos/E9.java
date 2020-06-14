package Lista7;
import java.util.Scanner;
public class E9 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		String escolha ="S";
		int num;
		int somapares = 0;
		int mediaimpares = 0;
		int somaimpares = 0;
		int impares = 0;
		
		
		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("Digite um numero para eferuar calculos: ");
			num = leia.nextInt();
			
			if (num < 0) {
				System.out.println("Numero NEGATIVO Digite um numero POSITIVO: ");
				num = leia.nextInt();
			}
			if (num % 2 == 0) {
				somapares =somapares + num;
			}
			if (num % 3 == 0) {
				impares ++;
				somaimpares = somaimpares + num;
				mediaimpares = somaimpares / impares;
			}
			
			System.out.println("\nDeseja inserir novo numero? digite 'S' ou 'N' para parar:");
			escolha = leia.next();
		}
		if (escolha.equalsIgnoreCase("N"))
		System.out.println("\n\t     Exibindo Relatorio"
				+ "\n\t   Soma dos PARES: " + somapares
				+ "\n\tMedia dos IMPARES: " + mediaimpares);
	}
}
