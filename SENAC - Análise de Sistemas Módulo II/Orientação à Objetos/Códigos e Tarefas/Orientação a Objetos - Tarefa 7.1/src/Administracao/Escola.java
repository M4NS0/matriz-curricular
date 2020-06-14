package Administracao;

import java.util.ArrayList;

import javax.swing.JOptionPane;


import Cargo.*;

public class Escola extends Profissional {

	public static ArrayList<Profissional> listaProfissionais = new ArrayList<Profissional>();
	public static ArrayList<ProfessorPortugues> cargo1 = new ArrayList<ProfessorPortugues>();
	public static ArrayList<ProfessorMatamatica> cargo2 = new ArrayList<ProfessorMatamatica>();
	public static ArrayList<ProfessorCompleto> cargo3 = new ArrayList<ProfessorCompleto>();
	public static ArrayList<Diretor> cargo4 = new ArrayList<Diretor>();
	static int op;
	
	
	public Escola() {
	}

	public Escola(String n, String e) {
		super(n, e);
	}

	public int getOp() {
		return op;
	}

	public static void setOp(int op) {

		op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));
		
		if (op == 1) {
			inserirProfissional();
		}
		if (op ==2) {
			listarProfissional();
		} else {
			
		}
	}

	static void inserirProfissional() {

		String n = JOptionPane.showInputDialog("Digite o Nome: ");
		String e = JOptionPane.showInputDialog("Digite a Escolaridade: ");
		
		int funcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
									+ "1 - Professor de Portugues\n"
									+ "2 - Professor de Matemática\n"
									+ "3 - Professor Completo \n"
									+ "4 - Diretor\n"
									+ "Digite a opção: "));

		if (funcao == 1) {
			
			ProfessorPortugues func1 = new ProfessorPortugues();
			
			func1.setEscolaridade(e);
			func1.setNome(n);

			cargo1.add(func1);
			
			listaProfissionais.addAll(cargo1);
			
		}
		if (funcao == 2) {
			
			ProfessorMatamatica func2 = new ProfessorMatamatica();
			
			func2.setEscolaridade(e);
			func2.setNome(n);
			cargo2.add(func2);
			listaProfissionais.addAll(cargo2);
		
		}
		if (funcao == 3) {
			ProfessorCompleto func3 = new ProfessorCompleto();
			
			func3.setEscolaridade(e);
			func3.setNome(n);
			cargo3.add(func3);
			listaProfissionais.addAll(cargo3);
		}
		if (funcao == 4) {
			Diretor func4 = new Diretor();
			
			func4.setEscolaridade(e);
			func4.setNome(n);
			cargo4.add(func4);
			listaProfissionais.addAll(cargo4);
			
		} else if (funcao != 1 && funcao != 2 && funcao != 3 && funcao != 4){
			funcao = Integer.parseInt(JOptionPane.showInputDialog("Opção inválida Digite: \n"
					+ "1 - Professor de Portugues\n"
					+ "2 - Professor de Matemática\n"
					+ "3 - Professor Completo \n"
					+ "4 - Diretor\n"
					+ "Digite a opção: "));

		}

		setOp(op);

	}

	public static void listarProfissional() {
		System.out.println(listaProfissionais.clone());

		}
	}


