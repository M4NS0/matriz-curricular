package Lista5c;


public class Exercicio04 {

	public static void main(String[] args) {
		
		float num = 3, soma = 3;
		
		System.out.println(soma + "(soma do n�mero 1 com o n�mero 2) ");
		while (num <= 10) {
			soma = soma + (num);
			if (num != 10) {
				System.out.println(soma + " (soma parcial com o n�mero " + num + ") ");
			}
			num++;
		}
		System.out.println("Soma total: " + soma);

	}

}
