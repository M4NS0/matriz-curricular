import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class App {
	static String linha;
	static String subs;

	public static void main(String[] args) throws Exception {
		
		ArrayList<Professores> lista = new ArrayList<Professores>();
		
		JOptionPane.showMessageDialog(null, "Esse programa cria uma lista de professores que será incluido em um arquivo de texto, clique em OK para contiunar");
		String caminho = (JOptionPane.showInputDialog("Insira o caminho e o nome do arquivo de Log que será criado"));
		String arquivo = caminho;

		int op = -1;

		do {

			op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n" 
					+ "0 - Sair\n" 
					+ "1 - Inserir Professor\n"
					+ "2 - Listar Professores\n" 
					+ "3 - Excluir Professor\n" 
					+ "4 - Alterar Professor\n"
					+ "5 - Abrir arquivo de Log\n\n"));

			if (op == 1) {
		
				Professores p1 = new Professores();
				String nome = (JOptionPane.showInputDialog("Insira o nome do professor"));
				p1.setNome(nome);
				String disciplina = (JOptionPane.showInputDialog("Insira a disciplina que " + nome + " leciona"));
				p1.setDisciplina(disciplina);
				String formacao = (JOptionPane.showInputDialog("Insira a formação de " + nome));
				p1.setFormacao(formacao);
				int periodo = Integer.parseInt(JOptionPane.showInputDialog("Insira o periodo que " + nome + " leciona"));
				p1.setPeriodo(periodo);

				lista.add(p1);

				FileWriter fw = new FileWriter(arquivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(lista + "\n");
				bw.close();
				fw.close();
				
			}

			if (op == 2) {   
				
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				String linha = "";
				while (br.ready()) {
					
					linha = linha + "\n" + br.readLine();
				}
				br.close();
				fr.close();
				
				JOptionPane.showMessageDialog(null, linha + "\n");
			}

			if (op == 3) {
				int i = Integer.parseInt(JOptionPane.showInputDialog("Qual o campo deseja remover? de 1 a " + lista.size()));
				
				lista.remove(i-1);
				
				FileWriter fw = new FileWriter(arquivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(lista + "\n");
				bw.close();
				fw.close();

			}
			if (op == 4) { 
				int i = Integer.parseInt(JOptionPane.showInputDialog("Qual o campo deseja substituir? de 1 a " + lista.size()));
				
				lista.remove(i-1);
				
				Professores p1 = new Professores();
				String nome = (JOptionPane.showInputDialog("Insira o nome do professor"));
				p1.setNome(nome);
				String disciplina = (JOptionPane.showInputDialog("Insira a disciplina que " + nome + " leciona"));
				p1.setDisciplina(disciplina);
				String formacao = (JOptionPane.showInputDialog("Insira a formação de " + nome));
				p1.setFormacao(formacao);
				int periodo = Integer.parseInt(JOptionPane.showInputDialog("Insira o periodo que " + nome + " leciona"));
				p1.setPeriodo(periodo);

				lista.add(p1);
				
				FileWriter fw = new FileWriter(arquivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(lista + "\n");
				bw.close();
				fw.close();
			}

			if (op == 5) {
				JOptionPane.showMessageDialog(null, "\nAperte OK para abrir o arquivo contendo a lista de professores\n");
				File file = new File("/home/linuxlite/Documents/log.txt");
				Desktop.getDesktop().open(file);
				
				
			}
			if (op != 0 && op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
			
			
		} while (op != 0);

		JOptionPane.showMessageDialog(null, "Fim do programa");

	}

}
