package Lista3;
import java.util.Scanner;
public class exercicio05 {
	
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
	
	float valor1,valor2,diferença1,diferença2;
	
	System.out.print("\n\tEsse programa vai ler dois valores e mostrar a \n\tdiferença entre eles (o maior valor menos o menor valor)");
	
	System.out.print("\n\n\tDigite o PRIMEIRO valor: ");
	valor1 = leia.nextFloat();
	
	System.out.print("\n\tDigite o SEGUNDO valor: ");
	valor2 = leia.nextFloat();
	
	diferença1 = (valor1 - valor2);
	diferença2 = (valor2 - valor1);
	
	if (valor1 > valor2) {
		System.out.print("\n\tA diferença entre os valores é: " + diferença1);
	} else if (valor1 < valor2) { 
		System.out.print("\n\tA diferença entre os valores é: " + diferença2);
		}
	}
}
