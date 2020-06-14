
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Loja {
	static ArrayList<Movel> lista = new ArrayList<Movel>();
	static Movel movel;
	
	public static void main(String[] args) {
		int op;
		do {
			op = perguntaInt("1- Inserir\n2- Listar\n3- Sair\nDigite a op��o:");
			switch (op) {
			case 1:
				inserirMovel();
				break;
			case 2:
				listarMoveis();
			}
		}while (op != 3);
		
	}

	public static void listarMoveis() {
		String texto = "";
		for (int i = 0; i < lista.size(); i++) {
			texto += lista.get(i).toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}

	public static void inserirMovel() {
		int op;
		do {
			op = perguntaInt("Qual o material do m�vel?\n1- Madeira\n2- Metal\n3- Plastico\nDigite a op��o:");
			switch(op) {
			case 1:
				opMadeira();
				break;
			case 2:
				opMetal();
				break;
		    case 3:
				opPlastico();
			}
		}while (op < 1 || op > 3);
	}

	public static void opPlastico() {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual m�vel?\n1- Mesa\n2- Armario Banheiro\nDigite a op��o:"));
			switch(op) {
			case 1:
				opMesa();
				break;
			case 2:
				opArmarioBanheiro();
			}
		}while (op < 1 || op > 2);
	}

	public static void opArmarioBanheiro() {
		movel = new ArmarioBanheiro();
		movel = cadastroPlastico((Plastico) movel);
		((ArmarioBanheiro)movel).setComVidro(perguntaBoole("Contem vidro?"));
		lista.add(movel);
	}

	public static void opMesa() {
		movel = new Mesa();
		movel = cadastroPlastico((Plastico) movel);
		((Mesa)movel).setQtdeCadeiras(perguntaInt("Qual a quantidade de cadeiras?"));
		((Mesa)movel).setCor(perguntaString("Qual a cor da mesa?"));
		lista.add(movel);
	}

	public static void opMetal() {
		opEstante();
	}

	public static void opEstante() {
		movel = new Estante();
		movel = cadastroMetal((Metal) movel);
		((Estante)movel).setAltura(perguntaFloat("Qual a altura"));
		((Estante)movel).setLargura(perguntaFloat("Qual a largura"));
		lista.add(movel);
	}

	public static void opMadeira() {
		int op;
		do {
			op = perguntaInt("Qual o tipo de m�vel?\n1- GuardaRoupa\n2- Cama\nDigite a op��o:");
			switch (op) {
			case 1:
				opGuardaRoupa();
				break;
			case 2:	
				opCama();
			}
		}while (op < 1 || op > 2);
		
	}
	
	public static void opCama() {
		movel = new Cama();
		movel = cadastroMadeira((Madeira) movel);
		((Cama)movel).setCasal(perguntaBoole("A cama e de casal?"));
		lista.add(movel);
	}

	public static void opGuardaRoupa() {
		movel = new GuardaRoupa();
		movel = cadastroMadeira((Madeira) movel);
		((GuardaRoupa)movel).setNumPortas(perguntaInt("Qual o numero de portas?"));
		((GuardaRoupa)movel).setLargura(perguntaFloat("Qual a largura?"));
		((GuardaRoupa)movel).setAltura(perguntaFloat("Qual a altura?"));
		lista.add(movel);
	}

	
	public static Movel cadastroMovel(Movel x) {
		x.setDescricao(perguntaString("Descri��o do m�vel?"));
		x.setCusto(perguntaFloat("Qual o custo?"));
		x.setPrecoVenda(perguntaFloat("Qual o pre�o de venda?"));
		return x;
	}
	
	private static int perguntaInt(String texto) {
		return Integer.parseInt(JOptionPane.showInputDialog(texto));
	}
	
	private static boolean perguntaBoole(String texto) {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(texto + "\n1 - sim\n2 - n�o"));
		}while(op != 1 && op != 2);	
		switch(op) {
		case 1:
			return true;
		default:
			return false;
		}
	}
	
	private static float perguntaFloat(String texto) {
		return Float.parseFloat(JOptionPane.showInputDialog(texto));
	}
	
	private static String perguntaString(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	public static Madeira cadastroMadeira(Madeira x) {
		x = (Madeira) cadastroMovel(x);
		x.setTipoMadeira(perguntaString("Qual o tipo de madeira?"));
		x.setMaterial("Madeira");
		return x;
	}
	
	public static Metal cadastroMetal(Metal x) {
		x = (Metal) cadastroMovel(x);
		x.setEspessura(perguntaFloat("Qual a espessura?"));
		x.setCor(perguntaString("Qual a cor?"));
		x.setMaterial("Metal");
		return x;
	}
	
	public static Plastico cadastroPlastico(Plastico x) {
		x = (Plastico) cadastroMovel(x);
		x.setQualidade(perguntaInt("Qual a qualidade do pl�stico?"));
		x.setMaterial("Plastico");
		return x;
	}
}
