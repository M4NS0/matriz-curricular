package Lista4;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		System.out.print("\n\tEsse programa alcula e exibe a  área de  um  retângulo,  a  partir \n\tdos valores da base e altura que serão digitados. Se  a  área  for \n\tmaior que 100, exibir a mensagem \"Terreno grande \", caso contrário, \n\texibir a mensagem \"Terreno pequeno\"\n\n");
		
		float base, altura, area;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n\t\tDigite a Base (em metros): ");
		base = leia.nextFloat();
		
		System.out.print("\t\tDigite a Altura (em metros): ");
		altura = leia.nextFloat();
		
		area = base * altura;
				
		if (area >= 100) {
			System.out.print("\n\t\t-Terreno grande! Area de " + area + " metros");
		} else {
			System.out.print("\n\t\t-Terreno pequeno! Area de " + area + " metros");
		}
				
				
		
	}
	
	
}
