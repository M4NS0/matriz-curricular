package Lista7;
import java.util.Scanner;
public class E1 {
	public static void main(String args [] ) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		int cont;
		
		System.out.println("Insira um numero: ");
		num = leia.nextInt();
		
		for (cont = 1; cont <= num; cont ++) {
			if (cont % 2 == 0) {
				System.out.println(cont);
			}
		}
		
	}
}
