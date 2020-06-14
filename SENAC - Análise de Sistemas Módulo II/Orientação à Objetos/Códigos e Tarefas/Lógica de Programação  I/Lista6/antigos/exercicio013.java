package Lista6;
import java.util.Scanner;
public class exercicio013 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
		
	
		
		System.out.println("\n\tEntrar via teclado com “N” valores quaisquer."
				+ "\n\tO valor “N” (que representa a quantidade de números)"
				+ "\n\tserá digitado, deverá ser positivo, mas menor que vinte."
				+ "\n\tCaso a quantidade não satisfaça a restrição,"
				+ "\n\tenviar mensagem de erro e solicitar o valor novamente."
				+ "\n\tApós a digitação dos “N” valores, exibir:"
				+ "\n\n\t\ta) O maior valor;"
				+ "\n\t\tb) O menor valor;"
				+ "\n\t\tc) A soma dos valores;"
				+ "\n\t\td) A média aritmética dos valores;"
				+ "\n\t\te) A porcentagem de valores que são positivos;"
				+ "\n\t\tf) A porcentagem de valores negativos;"
				+ "\n\n\tApós exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do programa."
				+ "\n\tPedir confirmação no sentido de aceitar somente “S” ou “N”"
				+ "\n\te encerrar o programa em função dessa resposta. ");

		float num, quant,cont, somaNum, mediaNum,maiorNum, menorNum;
		String resposta;
		
		cont = 0;
		somaNum=0;
		resposta = "c";
		maiorNum = -999999999;
		menorNum = 10000000;
		mediaNum = 0;
		
		// resposta ja começa positiva para fazer um loop  quando o script chegar ao fim
		while (resposta.equals("c")) {
			System.out.println("\n\tDigite a quantidade de numeros que sera inserido:  ");
			quant = leia.nextFloat();
		
		// checka se o numero é positivo
			while (quant<0) {
				System.out.println("\n\tNumero invalido por ser Negativo.\n\tInsira um numero positivo: ");
				quant = leia.nextFloat();
							}
		
		// checa se é negativo
			while (quant>20){
				System.out.println("\n\tNumero invalido por ser Maior que 20.\n\tInsira um numero menor: ");
				quant = leia.nextFloat();
							}	
			
		// checa se o contador (cont++) nao excede  o total do numero inserido no inicio da operacao (quant)
			while (quant > cont ) {	
				cont ++;
				System.out.println("\n\tDigite o valor do numero " + cont + ":  ");
				num = leia.nextFloat();
			
		// equacao abaixo guarda os inseridos somando entre si para obter valor total do q foi inserido
				somaNum = somaNum + num;	
						
		// fazendo media dividindo o valor total dos numeros digitados por a quantidade de numero (quant)
				mediaNum = somaNum /quant; 
				
		// maior valor e menor valor
				if (num > maiorNum) {
					maiorNum = num;
				}
				if (num < menorNum)
					menorNum = num;
	
			}
		// imprimindo as respostas
		System.out.println("\tO MAIOR valor da sequencia: " + maiorNum);
		System.out.println("\tO MENOR valor da sequencia: " + menorNum);
		System.out.println("\tA SOMA dos valores da sequencia: " + somaNum);
		System.out.println("\tA média aritimética dos valores inseridos é: " + mediaNum);
		
		// reinicia o script ou finaliza
		System.out.println("\n\tSe deseja encerrar o programa digite \"e\" \n\tSe deseja efetuar novos calculos digite \"c\": ");
		resposta = leia.next();		
		
		// zerando os contadores para que eles nao fiquem na memoria no proximo calculo
		cont = 0;
		num = 0;
		mediaNum = 0;
		somaNum = 0;
		maiorNum = -999999999;
		menorNum = 10000000;
		
		}

		while (resposta.equals("e")) {
			System.out.println("\n\t[Fim do Programa]");
			break;
			}
			
		
	
		
}
}

