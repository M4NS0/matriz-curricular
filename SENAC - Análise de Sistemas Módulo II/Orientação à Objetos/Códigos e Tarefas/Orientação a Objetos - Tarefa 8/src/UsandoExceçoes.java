import javax.swing.JOptionPane;

public class UsandoExceçoes {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception exceçao) {
			JOptionPane.showMessageDialog(null, exceçao.getMessage());
			exceçao.printStackTrace();
			StackTraceElement[] vestigioDeElementos = exceçao.getStackTrace();

			JOptionPane.showMessageDialog(null, "Pilha de vestígios de getStackTrace: ");
			JOptionPane.showMessageDialog(null, "Classe \t\tArquivo \tMétodo");

			for (StackTraceElement elemento : vestigioDeElementos) {
				System.out.println("\t" +  elemento.getClassName());
				System.out.println("\t" +   elemento.getFileName());
				System.out.println("\t" +  elemento.getLineNumber());
				System.out.println("\t" +   elemento.getMethodName());

			}
		}
	}

	public static void metodo1() throws Exception {
		metodo2();
	}

	public static void metodo2() throws Exception {
		metodo3();
	}

	public static void metodo3() throws Exception {
		throw new Exception("Exceção lançada em metodo3	");
	}

}
