

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Escola {
	static ArrayList<Profissional> lista = new ArrayList<Profissional>();
	static Profissional prof;
	
	public static void main(String[] args) {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir\n2- Listar\n3- Sair\nDigite a op��o"));
			if(op == 1) {
				inserirProfissional();
			}
			else if (op == 2) {
				listarProfissionais();
			}
		} while (op != 3);
	}

	public static void inserirProfissional() {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Professor Portugues\n2- Professor Matematica\n3- Professor Completo\n4- Diretor\nDigite a op��o"));
			if(op == 1) {
				prof = new ProfessorPortugues();
				prof.setNome(JOptionPane.showInputDialog("Qual o nome"));
				prof.setEscolaridade(JOptionPane.showInputDialog("Qual a escolaridade de " + prof.getNome()));
				lista.add(prof);
			}
			else if (op == 2) {
				prof = new ProfessorMatematica();
				prof.setNome(JOptionPane.showInputDialog("Qual o nome"));
				prof.setEscolaridade(JOptionPane.showInputDialog("Qual a escolaridade de " + prof.getNome()));
				lista.add(prof);
			}
			else if (op == 3) {
				prof = new ProfessorCompleto();
				prof.setNome(JOptionPane.showInputDialog("Qual o nome"));
				prof.setEscolaridade(JOptionPane.showInputDialog("Qual a escolaridade de " + prof.getNome()));
				lista.add(prof);
			}
			else if (op == 4) {
				prof = new Diretor();
				prof.setNome(JOptionPane.showInputDialog("Qual o nome"));
				prof.setEscolaridade(JOptionPane.showInputDialog("Qual a escolaridade de " + prof.getNome()));
				lista.add(prof);
			}
		} while (op < 1 || op > 3);
		
	}

	public static void listarProfissionais() {
		String texto = "";
		for (int i = 0; i < lista.size(); i++) {
			texto += lista.get(i).toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}

