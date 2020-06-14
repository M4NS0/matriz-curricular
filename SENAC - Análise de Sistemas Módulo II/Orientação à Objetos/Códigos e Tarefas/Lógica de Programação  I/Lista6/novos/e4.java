package Lista6;
import java.util.Scanner;
public class e4 {
public static void main (String args [] ) {
	Scanner leia = new Scanner(System.in);
	
	int contador, resultado;

	
	for (contador= 1; contador <= 10;  contador ++) {
		resultado = contador * 5;
		
		System.out.println("5 x " + contador + " = " + resultado);
	}
}
}
