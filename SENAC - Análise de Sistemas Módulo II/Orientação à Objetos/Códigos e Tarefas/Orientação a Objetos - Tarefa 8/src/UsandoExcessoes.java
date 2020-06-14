import javax.swing.JOptionPane;

public class UsandoExcessoes {
	public static void main(String[] args) {
		try {
			LançaExcessao();

		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Exceção tratada em 'main' ");

		}
		naoLançaExceção();

	}

	public static void LançaExcessao() throws Exception {
		try {
			JOptionPane.showMessageDialog(null, "Método para lançar exceções");
			throw new Exception();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Excessão tratada no método LançaExceção");
			throw exception;
		} finally {
			JOptionPane.showMessageDialog(null, "Foi executado 'por fim' em LançaExceção");
		}
	}

	public static void naoLançaExceção() {
		try {
			JOptionPane.showMessageDialog(null, "Método: naoLançaExceção");
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, exception);

		} finally {
			JOptionPane.showMessageDialog(null, "Foi executado 'por fim' em naoLançaExceção ");
		}
		JOptionPane.showMessageDialog(null, "Fim do método 'naoLançaExceção'");
	}

}
