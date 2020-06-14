package Lista5;
import java.util.Scanner;
public class exercicio04 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\n\tSomar os números de 1 a 10, apresentando as somas parciais e, no final, o total."
				+"\n\tA impressão deve seguir o padrão abaixo:"
				+"\n\t3 (soma do número 1 com o número 2)"
				+"\n\t6 (soma parcial com o número 3)"
				+"\n\t10 (soma parcial com o número 4)"
				+"\n\t[...]"
				+"\n\t55 (soma parcial com o número 10)"
				+"\n\tSoma total : 55");
		
		int i, soma;
		
		i = 0;
		soma = 0;
			
		while (i <= 9) {
			soma = soma + i;
			if(i>1) {
			System.out.println("\n\tSoma parcial com número " + soma);
			if (soma == 55) {
				System.out.println("\n\tSoma Total dos números é " + soma);
				}
			}
		i ++;
		}
	}
}
