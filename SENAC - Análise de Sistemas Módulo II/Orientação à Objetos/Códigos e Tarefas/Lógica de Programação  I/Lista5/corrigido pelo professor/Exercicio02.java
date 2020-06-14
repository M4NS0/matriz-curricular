package Lista5c;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float den = 1, soma = 0;
		
		while (den <= 20) {
			soma = soma + (1/den);
			den++;
		}
		System.out.println("A soma da sequencia 1/1 + 1/2 + 1/3 ... + 1/20 = " + soma);

	}

}
