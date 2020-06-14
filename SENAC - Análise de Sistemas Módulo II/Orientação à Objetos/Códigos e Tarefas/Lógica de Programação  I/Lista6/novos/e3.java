package Lista6;
import java.util.Scanner;
public class e3 {
public static void main (String args [] ) {
	Scanner leia = new Scanner (System.in);
	
	String sexo;
	int repeticao = 0;
	
	while (repeticao >= 0 ) {
	
	System.out.println("Digite 'M' para MULHER e 'H' para Homem: ");
	sexo = leia.nextLine();
	
		if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H")) {
			System.out.println("SEXO INVALIDO! Digite 'M' para MULHER e 'H' para Homem: ");
			sexo = leia.nextLine();
		}
	}
}
}
