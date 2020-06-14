package Lista8;
import java.util.Scanner;
public class Exercicio01 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\n\n\t1. Escreva um algoritmo que receba dois" + 
				"\n\tnúmeros  inteiros,  calcule  e  escreva:" +
			    "a) soma dos dois números\n" + 
				"b) subtração do primeiro pelo segundo\n" + 
				"c) subtração do segundo pelo primeiro\n" + 
				"d) multiplicação dos dois números\n" + 
				"e) divisão do primeiro pelo segundo\n" + 
				"f) divisão do segundo pelo primeiro\n" + 
				"g) o primeiro elevado ao quadrado.");
		
		int n1,n2,soma,subtracao1,subtracao2, multiplicacao,divisao1, divisao2, elevado;
		
		System.out.println("\n Insira o primeiro número: ");
		n1 = leia.nextInt();
		

		System.out.println("\n Insira o segundo número: ");
		n2 = leia.nextInt();
				
		// soma dos dois numeros
		soma = n1 + n2;
		
		// subtração do primeiro pelo segundo
		subtracao1 = n1 - n2;
		
		// subtração do segundo pelo primeiro
		subtracao2 = n2 -n1;
		
		// multiplicação dos dois números
		multiplicacao = n1 * n2;
		
		// divisão do primeiro pelo segundo
		divisao1 = n1 / n2;
		
		// divisão do segundo pelo primeiro
		divisao2 = n2 / n1;
		
		// o primeiro elevado ao quadrado 
		elevado = (int) Math.pow(n1, 2);
		
		System.out.println("\n____________________RESULTADOS____________________\n"
				         + "\n a) soma dos dois numeros: " + soma
				         + "\n b) subtração do primeiro pelo segundo: " + subtracao1
				         + "\n c) subtração do segundo pelo primeiro:" + subtracao2
				         + "\n d) multiplicação dos dois números:" + multiplicacao
				         + "\n e) divisão do primeiro pelo segundo: " + divisao1
				         + "\n f) divisão do segundo pelo primeiro:" + divisao2
				         + "\n g) o primeiro elevado ao quadrado: " + elevado);  
	}
}
