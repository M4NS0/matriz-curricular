package Lista5c;

public class Exercicio04B {

	public static void main(String[] args) {
		
		float num = 1, soma = 0;
		
		while (num <= 10) {
			soma = soma + num;
			if (num == 2) {
				System.out.println(soma + "(soma do n�mero 1 com o n�mero 2) ");
			} 
			else if ((num > 2) && (num <= 9)) {
				System.out.println(soma + " (soma parcial com o n�mero " + num + ") ");
			}
			else if (num == 10) {
				System.out.println("Soma total: " + soma);
			}
			num++;
		}
	}

}
