

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lavajato {
	static ArrayList<Item> lista = new ArrayList<Item>();
	static Item item;
	
	public static void main(String[] args) {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir\n2- Listar\n3- testar construtores\n4- Sair\nDigite a op��o"));
			if(op == 1) {
				inserir();
			}
			else if (op == 2) {
				listar();
			}
			else if (op == 3) {
				testarConstrutores();
			}
		}while (op != 4);
		
	}

	public static void testarConstrutores() {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- carro\n2- moto\n3- bicicleta\nDigite a op��o"));
			if(op == 1) {
				item = new Carro();
				item.setNome("teste");
				JOptionPane.showMessageDialog(null, item.toString());
			}
			else if (op == 2) {
				item = new Moto();
				item.setNome("teste");
				JOptionPane.showMessageDialog(null, item.toString());
			}
			else if (op == 3) {
				item = new Bicicleta();
				item.setNome("teste");
				JOptionPane.showMessageDialog(null, item.toString());
			}
		}while (op < 1 || op > 3);
	}

	public static void inserir() {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- carro\n2- moto\n3- bicicleta\nDigite a op��o"));
			if(op == 1) {
				item = new Carro();
				item.setNome(JOptionPane.showInputDialog("Qual o nome"));
				perguntas();
				lista.add(item);
			}
			else if (op == 2) {
				item = new Moto();
				item.setNome(JOptionPane.showInputDialog("Qual o nome"));
				perguntas();
				lista.add(item);
			}
			else if (op == 3) {
				item = new Bicicleta();
				item.setNome(JOptionPane.showInputDialog("Qual o nome"));
				perguntas();
				lista.add(item);
			}
		}while (op < 1 || op > 3);
		
	}
	
	public static boolean pergunta(String texto) {
		int op;
		while (true) {
			op = Integer.parseInt(JOptionPane.showInputDialog("� para " + texto + "\n1- sim\n2- n�o\nDigite a op��o"));
			if(op == 1) {
				return true;
			}
			else if (op == 2) {
				return false;
			}
		}
	}
	
	public static void perguntas() {
		if(pergunta("lavar")) {
			item.lavar();
		}
		if(pergunta("encerar")) {
			item.encerar();
		}
		if(pergunta("aspirar")) {
			item.aspirar();
		}
	}		

	public static void listar() {
		String texto = "";
		for (int i = 0; i < lista.size(); i++) {
			texto += lista.get(i).toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}
