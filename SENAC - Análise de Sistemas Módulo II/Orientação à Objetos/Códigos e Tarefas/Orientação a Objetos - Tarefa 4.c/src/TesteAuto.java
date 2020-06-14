import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteAuto {

	// Variável Global
	static ArrayList<Automovel> listaAuto = new ArrayList<Automovel>();
	static Automovel a = new Automovel();

	public static void main(String[] args) {
		int op;
		do {
			String valor = JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n3 - Sair\nDigite a opção: ");
			op = Integer.parseInt(valor);

			if (op == 1) {
				inserirAutomovel();
			} else if (op == 2) {
				listarAutomovel();
			}
		} while (op != 3);
		JOptionPane.showMessageDialog(null, "Fim do programa!");
	}

	public static void inserirAutomovel() {
		
		Automovel.incrementarCont();
		
		a.setId(Automovel.getCont());
		a.setFabricante(JOptionPane.showInputDialog("Cadastro de Automóvel\nDigite o Fabricante: "));
		a.setModelo(JOptionPane.showInputDialog("Digite o Modelo: "));
		a.setCor(JOptionPane.showInputDialog("Digite o Cor: "));
		a.setPlaca(JOptionPane.showInputDialog("Digite o Placa: "));
		a.setChassi(JOptionPane.showInputDialog("Digite o Chassi: "));
		a.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")));
		
		listaAuto.add(a);
	}

	public static void listarAutomovel() {
		String dados = "";
		for (int i = 0; i < listaAuto.size(); i++) {
			dados = dados + listaAuto.get(i).toString() + "\n";
			// dados = dados + listaAuto.get(i) + "\n"; - o método toString é chamado automaticamento pelo Java
		}
		JOptionPane.showMessageDialog(null, dados);
	}

}
