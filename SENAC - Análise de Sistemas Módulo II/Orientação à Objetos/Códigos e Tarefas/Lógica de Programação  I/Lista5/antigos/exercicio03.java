package Lista5;
import java.util.Scanner;
public class exercicio03 {
	
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
	String enter;
	
	System.out.println("\n\tEsse algoritmo imprime os números pares entre 100 e 1.");
	
	System.out.println("\n\tAperte < ENTER >");
	enter = leia.nextLine();
	
	int i = 0;
	while (i<100) {
		if ((i % 2) == 0) {
		System.out.println("\t" + i);
			}
	i ++;
		}
	}
}