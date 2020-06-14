

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class DivididoPorZeroComExceçao {
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;

	}

	public static void main(String Args[]) {
		
		boolean continuaLoop = true;
		
		do {
			try {
			int numerador = Integer.parseInt(JOptionPane.showInputDialog("Digite o numerador:"));
			int denominador = Integer.parseInt(JOptionPane.showInputDialog("Digite o denominador:"));
			
			int resultado = numerador/denominador;
			
			JOptionPane.showMessageDialog(null, "O numerador " 
					+ numerador + " dividido pelo denominador " 
					+ denominador + " é igual a " + resultado + "\t  " );
			continuaLoop = false;
			}
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nExceção: %s%n", inputMismatchException);
				JOptionPane.showMessageDialog(null,"Insira números inteiros. Tente novamente.%n%n");
				
			}
			catch (ArithmeticException arithmeticException) {
				System.err.printf("%nExceção: %s%n",arithmeticException);
				JOptionPane.showMessageDialog(null,"Zero é um denominador inválido, tente novamente \t");
			}
		} while (continuaLoop);
	}
}
