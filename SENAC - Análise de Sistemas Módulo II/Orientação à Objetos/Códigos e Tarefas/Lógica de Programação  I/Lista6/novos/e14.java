package Lista6;

import java.util.Scanner;

public class e14 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int num;
		String escolha = "S";
		int contador;
		int fatorial = 1;
		

		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("Insira um No:");
			num = leia.nextInt();
			
			if (num < 0) {
				System.out.println("Invalido! Insira um No Positivo:");
				num = leia.nextInt();
			}
			for (contador = num; contador >= 2; contador --) {
				fatorial = fatorial * contador; 
				System.out.println(num + "! = " + fatorial);
				
			}
			System.out.println("\nPara novo calculo digite 'S' "
			+ "caso contrario digite 'F' para finalizar"); 
			escolha = leia.next();
			fatorial = 1;
		
		}
		if (!escolha.equalsIgnoreCase("S")) {
			System.out.println(" [FIM DO PROGRAMA]");
		}

	}
}
