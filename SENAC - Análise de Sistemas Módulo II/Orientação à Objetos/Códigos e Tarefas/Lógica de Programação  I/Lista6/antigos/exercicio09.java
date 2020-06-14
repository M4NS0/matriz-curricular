package Lista6;
import java.util.Scanner;
public class exercicio09 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\n\tCalcular e exibir a soma dos “N” primeiros valores da seqüência abaixo."
				+ "\n\tO valor “N” será digitado, deverá ser positivo, mas menor que cem."
				+ "\n\tCaso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente."
				+ "\n\n\tA seqüência: 2, 5, 10, 17, 26, ...."); 
				
	int n,soma, resultado, cont;
	cont = 1;
	soma = 1;

	System.out.println("\n\t Insira a quantidade de numeros que serao somados na sequencia de numeros:  ");
	n = leia.nextInt();
	
		
		while (n < 1) {
		System.out.println("\tNumero invalido por ser negativo. \n\tDigite um Numero: ");
		n = leia.nextInt();
		}
		
		while (n > 100) { 
		System.out.println("\tNumero invalido por ser maior que 100. \n\tDigite um Numero: ");
		n = leia.nextInt();
		}
		
		soma = n*n + cont;
		System.out.println("  + " + n + " = " + soma);
		n ++;
		
	}
	

		}


