package Lista7;
import java.util.Scanner;
public class E2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		
		int num, cont,soma = 0;
		
		System.out.println("Insira um numero: ");
		num = leia.nextInt();
		
		for (cont = 1; cont <= num; cont ++) {
			soma = soma + cont;
			System.out.println(cont + "a Soma: "+ soma );
		}
		
	}
}
