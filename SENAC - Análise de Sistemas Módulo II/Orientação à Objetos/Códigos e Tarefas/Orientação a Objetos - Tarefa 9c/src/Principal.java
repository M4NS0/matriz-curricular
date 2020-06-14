import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	// Constante
	static final String NOME_ARQ = "Professores.txt";
	// Variável Global
	static ArrayList<Professor> lista = new ArrayList<Professor>();

	public static int menu() {
		int op; // variável local
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(
							  "0 - Sair\n" 
							+ "1 - Inserir Professor\n" 
							+ "2 - Listar Professores\n" 
							+ "3 - Listar Professores Arq\n" 
							+ "Digite a opção: "));
		} while ((op < 0) || (op > 3));
		return op;
	}
	
	public static String lerDado(String mens) {
		return JOptionPane.showInputDialog(mens);
	}
	
	public static void inserirProfessor() throws IOException {
		Professor p = new Professor();

		p.setNome(lerDado("Nome: "));
		p.setFormacao(lerDado("Formação: "));
		p.setDisciplina(lerDado("Disciplina: "));
		p.setPeriodo(Integer.parseInt(lerDado("Período: ")));
		
		lista.add(p);
		ManipularArquivos.gravar(NOME_ARQ, p.retornaDadosCSV(), true, true);
	}
	
	public static void listarProfessores() {
		String dados = "";
		for (Professor p : lista) {
			dados = dados + p.toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, dados);
	}

	public static void carregarArq() throws Exception {
		ArrayList<String> dados = ManipularArquivos.ler(NOME_ARQ);
		String temp[];
		
		for (String linha : dados) {
			temp = linha.split(";");
			Professor p = new Professor(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]));
			lista.add(p);
		}
	}

	public static void listarProfessoresArq() throws Exception {
		ArrayList<String> dados = ManipularArquivos.ler(NOME_ARQ);
		String d = "";
		for (String linha : dados) {
			d = d + linha + "\n";
		}
		JOptionPane.showMessageDialog(null, d);
	}

	public static void main(String[] args) {
		int opcao;

		try {
			carregarArq();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo! Erro: " + e1.getMessage());
		}
		
		do {
			opcao = menu();
			if (opcao == 1) {
				try {
					inserirProfessor();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Erro ao gravar! Erro: " + e.getMessage());
				}
			}
			else if (opcao == 2) {
				listarProfessores();
			}
			else if (opcao == 3) {
				try {
					listarProfessoresArq();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo! Erro: " + e.getMessage());
				}
			}
		} while (opcao != 0);
	}

}
