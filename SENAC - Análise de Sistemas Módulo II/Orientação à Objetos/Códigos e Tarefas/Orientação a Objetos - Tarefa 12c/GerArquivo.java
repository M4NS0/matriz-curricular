import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerArquivo {

	static final String NOME_ARQ = "contatos.txt";
	
	public static void lerArquivo(ArrayList<Pessoa> lista) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader( fr );

		while( br.ready() ){
			String linha = br.readLine();
			String dados[] = linha.split(";");
			Pessoa p = new Pessoa(dados[0], dados[1], Integer.parseInt(dados[2]));
			lista.add(p);
		}
		br.close();
		fr.close();
	}

	public static void gravarArquivo(String conteudo, boolean manterArq) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, manterArq);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(conteudo + "\n");
		bw.close();
		fw.close();
	}

	public static void gravarArquivo(ArrayList<Pessoa> lista) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, false);
		BufferedWriter bw = new BufferedWriter(fw);
		for (Pessoa p : lista) {
			bw.write(p.toString() + "\n");
		}
		bw.close();
		fw.close();
	}
	
}
