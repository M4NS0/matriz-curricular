import java.util.Scanner;

public class ExemploEnquanto2 {

	public static void main(String[] args) {
		
		int cont = 1, num, opcao = 1; // opcao = vari�vel flag
		Scanner leia = new Scanner(System.in);
		
		// while = enquanto
		while (opcao != 0) {
			System.out.print("Digite o " + cont + "� n�: ");
			num = leia.nextInt();
			System.out.println("O " + cont + "� n� = " + num);
			//cont = cont + 1; // Vari�vel Acumuladora
			cont++;
			
			System.out.print("Digite 0 para sa�r ou 1 para continuar: ");
			opcao = leia.nextInt();
		}
		System.out.println("Fim do Programa");
	}
	
}
