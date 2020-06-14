import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Teste {

	static final String NOME_ARQ = "D:/TesteArquivo/meuArquivo.txt";
	
	public static String lerArquivo() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader( fr );
		String linha = "";
		while( br.ready() ){
			linha = linha + "\n" + br.readLine();
		}
		br.close();
		fr.close();
		return linha;
	}

	public static void gravarArquivo(String conteudo, boolean criarNovoArq) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, criarNovoArq);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(conteudo + "\n");
		JOptionPane.showMessageDialog(null, "Arquivo criado/conteúdo adicionado com sucesso!");
		bw.close();
		fw.close();
	}
	
	public static void main(String[] args) {
		try {
			int op;
			do {
				 op = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair\n1 - Adicionar Conteúdo\n2 - Imprimir Conteúdo"));
				 if (op == 1) {
					 String conteudo = JOptionPane.showInputDialog("Digite o conteúdo do arquivo: ");
					 gravarArquivo(conteudo, true);
				 }
				 else if (op == 2) {
					 String conteudo = lerArquivo();
					 JOptionPane.showMessageDialog(null, conteudo);
				 }
				 else if (op == 3) {
					 
				 }
			} while (op != 0);
		} catch (IOException e) {
			// e.getMessage() deve ser utilizado apenas para os desenvolvedores. Criar um log por exemplo
			JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo! Erro: " + e.getMessage());
		} 
		JOptionPane.showMessageDialog(null, "Programa finalizado ... ");
	}

}