package Lista6c;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int cont = 1, tab;
		
		System.out.println("Enquanto = while");
		System.out.println("Tabuada do n� 5");
		while (cont <= 10) {
			tab = cont * 5;
			System.out.println("5 x " + cont + " = " + tab);
			cont++;
		}
		
		System.out.println("***********************");
		System.out.println("Para = for ");
		System.out.println("Tabuada do n� 5");
		for (int i = 1; i <= 10; i++) {
			tab = i * 5;
			System.out.println("5 x " + i + " = " + tab);
		} 
	}
}








