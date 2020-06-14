package Lista1;
import java.util.Scanner;
public class exercicio02 {
	
		public static void main (String args[]) {
			
			//inteiro = int
			int num1,num2,d,r;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("digite o 1o no da divisao (dividendo):");
			num1 = leia.nextInt();
			
			System.out.println("digite o 2o no da divisao (dividendo): ");
			num2 = leia.nextInt();
			
			d= num1 / num2;
			r = num1 % num2;
			
			
		}
}
