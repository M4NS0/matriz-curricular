package Lista6;
import java.util.Scanner;
public class exercicio012{
	public static void main (String []args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tEntrar via teclado com “X” valores quaisquer."
								+ "\n\tO valor “N” (que representa a quantidade de números)" 
								+ "\n\tserá digitado, deverá ser positivo, mas menor que vinte" 
								+ "\n\tCaso a quantidade não satisfaça a restrição,\"\n"  
								+ "\n\tenviar mensagem de erro e solicitar o valor novamente"  
								+ "\n\tApós a digitação dos “N” valores, exibir:" 
								+ "\n\n\t\ta) O maior valor;" 
								+ "\n\t\tb) O menor valor;" 
								+ "\n\t\tc) A soma dos valores" 
								+ "\n\t\td) A média aritmética dos valores;" 
								+ "\n\t\te) A porcentagem de valores que são positivos;" 
								+ "\n\t\tf) A porcentagem de valores negativos;");
		
		
		float quantNums,contador,num, soma, media, maiorNum, menorNum, positivos, negativos, percentualPositivo, percentualNegativo; 
		contador = 0;
		soma = 0;
		maiorNum = -999999;
		menorNum = 1000000;
		positivos = 0;
		negativos = 0;
		media = 0;
		percentualPositivo = 0;
		percentualNegativo =0;
		
		System.out.println("\n\tInsira o tamanho da sequencia de numeros para calculos: ");
		quantNums = leia.nextFloat();
		
		while (quantNums < 0)  {
			System.out.println("\tO valor digitado é NEGATIVO, insira um novo numero: ");
			quantNums = leia.nextFloat();
								}
		while (quantNums > 20) {
			System.out.println("O valor digitado é MAIOR que 20, insira um novo numero: ");	
			quantNums = leia.nextFloat();
								}
		while (quantNums > contador)   {
			contador ++;
			System.out.println("\tInsira o " + contador + " numero da sequencia: ");
			num = leia.nextFloat();
		
		// soma dos valores
			soma = soma + num;
		
		// media das somas
			media = soma / quantNums;
		
		// maior valor
			if (num > maiorNum) { 
				maiorNum = num;
			}
			if (num<menorNum)
				menorNum = num;
				
		// extraindo quantidades de valores positivos e negativos dentro da sequencia
			if (num > 0) { //sempre sim devido ao maiorNum = -99999
				positivos ++;
			}
			if (num < 0)  //sempre sim devido ao menorNum = 100000
				negativos ++;
			
		
		// extraindo percentual dos positivos 
			percentualPositivo = (positivos * 100) / (positivos + negativos);
		
		// extraindo percentual dos negativos
			percentualNegativo = (negativos * 100) / (positivos + negativos);
			}
			
			System.out.println("\tO MAIOR valor da sequencia: " + maiorNum);
			System.out.println("\tO MENOR valor da sequencia: " + menorNum);
			System.out.println("\tA SOMA dos valores da sequencia: " + soma);
			System.out.println("\tA MEDIA dos valores da sequencia: " + media);
			System.out.println("\tA PORCENTAGEM de valores que são POSITIVOS: " + percentualPositivo + "%");
			System.out.println("\tA PORCENTAGEM de valores que são NEGATIVOS: " + percentualNegativo + "%");
			
			
			
			
										}
	
													}


