package Lista7;
import java.util.Scanner;
public class Exercicioo10 {
	public static void main(String args []) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n\n\n\n\tEm um ônibus estão n pessoas. Faça um algoritmo que leia, para "
				+ "\n\tcada pessoa: a idade, o peso, a altura, o sexo (F ou M) e calcule: "
				+ "\n\n\t\t• A idade média entre elas; "
				+ "\n\t\t• O somatório dos pesos;"
				+ "\n\t\t• A menor e a maior altura, respectivamente; "
				+ "\n\t\t• A porcentagem de mulheres com idade inferior a 25 anos entre as mulheres."
				+ "\n\t\t• Use como flag idade –1, faça validação para idade, peso e altura. ");
		
	
		int cadastro;
		int somaM = 0;
		int somaM25 = 0;
		float maiorA = (float) -2.99;
		float menorA = (float) +2.99;
		float porcent;
		float altura, peso, idade, idadeMedia;
		float pesoSoma = 0;
		float idadeTotal = 0;
		String sexo;
		
			//quantidade de pessoas para inserir
		System.out.println("\n\tDigite a quantidade de pessoas para cadastro: ");
		
		cadastro = leia.nextInt();
		
			
			for (int cont = 1;  cadastro >= cont; cont ++) {
				
				System.out.println("\n\nQual sua IDADE:");
				idade = leia.nextInt();
				idadeTotal = idadeTotal + idade;
				
				System.out.println("\n\nQual sua ALTURA:");
				altura = leia.nextFloat(); 
				
				System.out.println("\n\nQual seu PESO:");
				peso = leia.nextFloat();
				pesoSoma = pesoSoma + peso;
				
				System.out.println("\n\nQual seu SEXO:");
				sexo = leia.next();
			
				while (sexo.equalsIgnoreCase("F,M")) {
					somaM ++;
				}
				while  (sexo.equalsIgnoreCase("F,M") && (idade<25)) {
					somaM25 ++;
				}
				if (maiorA < idade) {
					maiorA = idade;
				}
				if (menorA < idade) {
					menorA = idade;
				}
			}
			
	
			idadeMedia = idadeTotal / cadastro;
			porcent = ( somaM25 * 100 ) / somaM;
			
			
			
			System.out.println("\n----------------------RELATORIO----------------------");
			System.out.println("\nA média de idade entre as pessoas é: " + idadeMedia);
			System.out.println("\nO somatorio dos pesos é: " + pesoSoma);
			System.out.println("\nA porcentagem de mulheres com idade inferior a 25 anos entre as mulheres" + porcent);
			System.out.println("A MAIOR altura: " + maiorA);
			System.out.println("A MENOR altura: " + menorA);
		
		}
	}
