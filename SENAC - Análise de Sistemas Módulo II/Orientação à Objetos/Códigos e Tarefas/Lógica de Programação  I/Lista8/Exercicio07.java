package Lista8;
import java.util.Scanner;
public class Exercicio07 {
	public static void main (String args[]) {
		Scanner leia =  new Scanner(System.in);
		
		
		System.out.println("\n\n _______________________________________________________________________________\n" +
				"|\t\t\t\t\t\t\t\t\t\t|\n" +
				"|\t 7. Tem-se um conjunto de dados contendo a altura e o sexo  \t\t|\n" + 
				"|\t (masculino, feminino) de 10 pessoas. Fazerum programa que \t\t|\n" + 
				"|\t calcule e escreva: \t\t\t\t\t\t\t|\n" + 
				"|\t\t\t\t\t\t\t\t\t\t|\n" +
				"|\t a) A maior e a menor altura do grupo \t\t\t\t\t|\n" +
				"|\t b) A média de altura das mulheres \t\t\t\t\t|\n" +
				"|\t c) O número de homens \t\t\t\t\t\t\t|\n" +
				"|_______________________________________________________________________________|");
	
		// cadastro inteiro porque nao existe meio cadastro...
		int cadastro;
		
		// define a quantidade final de cadastros
		final int MAX = 10;
		
		// float porque pode ser numero quebrado
		float  altura;
		
		// string porque so recebe valores literais
		String sexo;
		
		// inicializando maiorAltura e a menorAltura (letra a)
		float maiorAltura = -9999;
		float menorAltura = 9999;
						
		// somaM inicializada (letra b)
		int somaM = 0;
		
		// media (letra b)
		float media = 0;
		
		// somaAltura (letra b)
		float somaAltura = 0;
		
		// somaH inicializada (letra c)
		int somaH = 0; 
				
		// Input ( entrada de dados)
		// ja que existe um numero fixo de cadastros a serem feitos
		// usa-se o FOR inves de WHILE
		// variavel carastro aparecera dentro da condicação do for e sera inicializada la tambem.
		for (cadastro = 1; cadastro <= MAX; cadastro ++) {
			// input 1
			System.out.println("\n\n\n\n\n_____________________\n\n"
					         + "> Insira sua ALTURA: ");
			altura = leia.nextFloat();
			
			//input 2
			System.out.println("Digite, 'M' se for MULHER ou 'H' se for HOMEM: ");
			sexo = leia.next();
			
			//letra a
			// inicializa-se duas variaveis, maiorAltura e menorAltura
			// a maior com um numero absurdamente baixo
			// e o menor com numero absurdamente alto
			// afim de fazer a devida comparacao de valores
			// aceita q doi menos.
			// iniciando comparações:
			if (altura >= maiorAltura) {
				maiorAltura = altura;
			}
			if (altura <= menorAltura) {
				menorAltura = altura;
			}
			if (sexo.equalsIgnoreCase("M")) {
				// soma 1 ao contador somaM e deve ser inicializado com valor zero
				// somaM = somaM + 1 ou:
				somaM ++;
				// soma o total de altura entre as pessoas cadastradas do sexo feminino
				somaAltura = somaAltura + altura;
				
				// faz a media das alturas cadastradas do sexo feminino
				media = somaAltura / somaM;
			}
			// letra c
			// se o valor digitado for M mesmo se em minuscula....
			if (sexo.equalsIgnoreCase("H")) {
				// soma 1 ao contador somaM e deve ser inicializado com valor zero
				// somaH = somaH + 1 ou:
				somaH ++;				
			}
		}
		
		System.out.println(" _______________________________________________________\n" + 
				"\n" +
				"    >         A MAIOR altura do grupo: " + maiorAltura + " metros\n" + 
				"    >         A MENOR altura do grupo: " + menorAltura + " metros\n" + 
				"    >  A média de altura das mulheres: " + media + " metros\n" + 
				"    >              O número de homens: " + somaH + "\n" + 
				"_______________________________________________________");
	}
}
