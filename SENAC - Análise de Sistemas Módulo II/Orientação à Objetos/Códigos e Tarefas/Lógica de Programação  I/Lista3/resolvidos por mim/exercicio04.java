package Lista3;
import java.util.Scanner;
public class exercicio04 {

	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
	
	int numero, resto;
		
	System.out.print("\n\tEste programa tem objetivo de ler um numero\n\te verificar se ele é par ou impar. Observacao:\n\tpara o numero ser par, o resto de sua divisao\n\tpor dois deve ser igual a zero.");
	
	System.out.print("\n\n\tDigite um numero qualquer: ");
	numero = leia.nextInt();
	
	resto = (numero % 2);
		
	if (resto != 0) {
		System.out.print("\n\tO numero digitado é IMPAR");
	} else if (resto == 0) {
		System.out.print("\n\tO numero é PAR");
		
				
		
		
	}

	}
}
