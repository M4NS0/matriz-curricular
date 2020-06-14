import javax.swing.JOptionPane;

public class Assertivas {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 até 10:"));
		
		assert (num >= 0 && num <=10) : "número inadequado: " + num;
		System.out.printf("Foi inserido %d%n", num);
		}

	}

