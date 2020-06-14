package Lista5c;

import javax.swing.JOptionPane;

public class Exercicio05B {

	public static void main(String[] args) {
		
		int num1, num2, tentativas = 1;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro entre 1 e 10: "));
		while ((num1 <= 0) || (num1 > 10)) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("N�mero inv�lido! Digite um n�mero inteiro entre 1 e 10: "));
		}
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o n�mero do 1� Jogador (1 e 10): "));
		while (num1 != num2) {
			tentativas++;
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Errou!!! Tente novamente: "));
		}

		JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + num2 
				+ ". Voc� acertou em " + tentativas + " tentativa(s)");
	}
}
