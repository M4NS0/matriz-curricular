package Lista4;
import java.util.Scanner;


public class exercicio04 {

	public static void main(String[] args) {
		
		System.out.print("\n\tVerificar se três valores quaisquer (A,B, C) que serão" +
		"\n\tdigitados  formam  ou  não  um  triângulo  retângulo." +
		"\n\tLembre-se que o quadrado da hipotenusa é igual" +
		"\n\ta soma dos quadrados dos catetos.");
		
		
		float lado1,lado2,lado3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n\n\tDigite o tamanho do lado A:  ");
		lado1 = leia.nextFloat();
		
		System.out.print("\n\tDigite  o  tamanho  do lado B:  ");
		lado2 = leia.nextFloat();
		
		System.out.print("\n\tDigite  o tamanho  do lado C:  ");
		lado3 = leia.nextFloat();
		
		if  ((lado1*lado1) + (lado2*lado2) <= (lado3*lado3) || (lado1*lado1) + (lado3*lado3) <= (lado2*lado2) || (lado3*lado3) + (lado2*lado2) <= (lado1*lado1))  { 
			System.out.print("\n\tÉ um Triangulo Retângulo ");
			
		} else {
			System.out.print("\n\tNão é um Triangulo Retângulo ");
		}
		
				
	}
}
