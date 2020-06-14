import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManipularArquivos {

	public static void gravar(String nomeArq, String conteudo, boolean quebraLinha, boolean manterArq) 
			throws IOException {
		FileWriter fw = new FileWriter(nomeArq, manterArq);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(conteudo);
		if (quebraLinha) {
			bw.newLine();
		}
		bw.close();
		fw.close();
	}
	
	public static ArrayList<String> ler(String nomeArq) 
			throws Exception {
		
		FileReader fr = new FileReader(nomeArq);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> dados = new ArrayList<String>();
		
		while (br.ready()) {
			String linha = br.readLine();
			dados.add(linha);
		}
		br.close();
		fr.close();
		return dados;
	}
	
	
}
