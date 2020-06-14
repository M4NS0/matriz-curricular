package Lista4;
import java.util.Scanner;

public class exercicio03 {
		
	public static void main(String[] args) {
		
		System.out.print("\n\tA partir de três valores que serão digitados, verificar se"
				+ "\n\tformam ou não um triângulo. Em caso positivo, exibir sua classificação:"
				+ "\n\t\"Isósceles, escaleno ou eqüilátero\".Um triângulo escaleno possui todos"
				+ "\n\tos lados iguais. Para existir triângulo é necessário que a soma de dois "
				+ "\n\tlados quaisquer seja maior que o outro, isto, para os três lados.");
		
		float lado1,lado2,lado3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n\n\tDigite o tamanho do primeiro lado:  ");
		lado1 = leia.nextFloat();
		
		System.out.print("\n\tDigite o tamanho do segundo lado:  ");
		lado2 = leia.nextFloat();
		
		System.out.print("\n\tDigite o tamanho do terceiro lado:  ");
		lado3 = leia.nextFloat();
		
		
			
		if  ((lado1 == lado2) && (lado2 == lado3)) {
			System.out.print("\n\tEssa é a medida de um triangulo EQUILATERO");
			
		} else if  ((lado1==lado2) || (lado1==lado3) || (lado2==lado3)) {
				System.out.print("\n\tEssa é a medida de um triangulo ISOCELES");
			
		} else {
			System.out.print("\n\tEssa é a medida nao é de um ESCALENO");
			
			
				}
			}
		}


