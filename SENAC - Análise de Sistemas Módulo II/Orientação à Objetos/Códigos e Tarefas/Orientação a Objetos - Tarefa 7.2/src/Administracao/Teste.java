package Administracao;

import javax.swing.JOptionPane;

import Veiculos.*;

public class Teste extends LavaJato{
	public static void main(String[] args) {
		LavaJato menu = new LavaJato();
		
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n3 - Testar Construtores\n0 - Sair\nDigite a opção: "));
		menu.setOp(op);
		
		do {
			
			int op1 = Integer.parseInt(JOptionPane.showInputDialog("Qual veículo deseja incluir?\n1 - Carro\n2 - Moto\n3 - Bicicleta\n0 - Voltar\nDigite a opção: "));

			
			if (op1 == 1) {
				
				String nome = JOptionPane.showInputDialog("Digite o Nome: ");
				Carro c1 = new Carro(nome);
				boolean motor = false;
				boolean bancos = false;
				boolean portaMalas = false;
				
				String m = JOptionPane.showInputDialog("Deseja Lavar o Motor? Digite 'S' ou 'N'");
				
				if (m.equalsIgnoreCase("S")) {
					motor = true;
				}
				if (m.equalsIgnoreCase("N")) {
					motor = true;
				}
				
				String b = JOptionPane.showInputDialog("Deseja Lavar os Bancos? Digite 'S' ou 'N'");
				
				if (b.equalsIgnoreCase("S")) {
					bancos = true;
				}
				if (b.equalsIgnoreCase("N")) {
					bancos = true;
				}
				String p = JOptionPane.showInputDialog("Deseja Lavar o Porta Malas? Digite 'S' ou 'N'");
				
				if (p.equalsIgnoreCase("S")) {
					portaMalas = true;
				}
				if (p.equalsIgnoreCase("N")) {
					portaMalas = true;
				}

				c1.setNome(nome);
				c1.setMotor(motor);
				c1.setBancos(bancos);
				c1.setPortaMalas(portaMalas);

				lista.add(c1);
					
				op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n3 - Testar Construtores\n0 - Sair\nDigite a opção: "));
				
			}
			
	
			
			if (op1 == 2) {
				String nome = JOptionPane.showInputDialog("Digite o Nome: ");
				Moto m1 = new Moto(nome);
				boolean motor = false;
				
				String m = JOptionPane.showInputDialog("Deseja Lavar o Motor? Digite 'S' ou 'N'");
				
				if (m.equalsIgnoreCase("S")) {
					motor = true;
				}
				if (m.equalsIgnoreCase("N")) {
					motor = true;
				}
		
				m1.setNome(nome);
				m1.setMotor(motor);
				lista.add(m1);
				
				
				op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n3 - Testar Construtores\n0 - Sair\nDigite a opção: "));

			}
			if (op1 == 3) {
				String nome = JOptionPane.showInputDialog("Digite o Nome: ");
				Bicicleta b1 = new Bicicleta(nome);
				b1.setNome(nome);
				lista.add(b1);
				
				op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n3 - Testar Construtores\n0 - Sair\nDigite a opção: "));

			}
		
		} while (op == 1);
		
		do {
			System.out.println(lista);
			
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n3 - Testar Construtores\n0 - Sair\nDigite a opção: "));

			
		} while (op == 2);
			
		do {
			
			
		} while (op == 3);

		do {
			
		} while (op == 0);

		do {
			
		} while (op != 1 && op != 2 && op != 3 && op != 0);
	}
}

