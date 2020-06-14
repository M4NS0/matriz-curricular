package Lista6;
import java.util.Scanner;
public class exercicio010{
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\n\tCalcular e exibir a soma dos 'N' primeiros valores da sequencia abaixo."
				+ "\n\tO valor 'N' sera digitado devera ser positivo, mas menor que cinquenta."
				+ "\n\tCaso o valor nao satisfaca a restricao, enviar mensagem de erro e solicitar o valor novamente."
				+ "\n\tA sequencia: 1/2, 2/3, 3/4, 4/5 ...");
		
		float nPrimeirosValores, somaParcial,numerador,denominador,divisao;
		numerador = 1;
		denominador = 2;
		somaParcial = 0;
		
		System.out.println("\n\tInsira a quantidade dos numeros iniciais da sequencia que ser� somada: ");
		nPrimeirosValores = leia.nextFloat();
		
		while (nPrimeirosValores < 0) {
			System.out.println("\n\tO numero inserido � MENOR que zero, favor inserir um numero MAIOR:");
			nPrimeirosValores = leia.nextFloat();
		}
		while (nPrimeirosValores > 50) {
			 System.out.println("\n\tO numero inserido � MAIOR que 50, favor inserir um numero MENOR:");
			 nPrimeirosValores = leia.nextFloat();
		}	 
		
		while (nPrimeirosValores >= numerador) {

		divisao = numerador /denominador;
		numerador++;
		denominador++;
		somaParcial = somaParcial + divisao;		
		}
		

		System.out.println("\n\tA soma dos " + nPrimeirosValores + " numeros � igual a " + somaParcial);
		
}
		
}	