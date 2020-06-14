package Lista5;
import java.util.Scanner;
public class exercicio02 {
		
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\n\tEsse programa imprime o total da seqüência: 1, 1/2, 1/3 [...] 1/20.");
	
	String enter;
	System.out.println("\n\tAperte <ENTER>");
	enter = leia.nextLine();
	
	int i = 2;
	
	while (i <= 20) {
		System.out.println("\t\t1/" + i );
			
		i++;
	
		}
	}
}