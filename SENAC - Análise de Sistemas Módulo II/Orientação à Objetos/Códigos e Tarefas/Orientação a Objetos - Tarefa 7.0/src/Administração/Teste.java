package Administração;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Produtos.Armario;
import Produtos.Cama;
import Produtos.Estante;
import Produtos.GuardaRoupas;
import Produtos.Mesa;

public class Teste {

	public static void main(String[] args) {

		ArrayList<Movel> lista = new ArrayList<Movel>();
		int op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));

		do  {
			String d = JOptionPane.showInputDialog("Digite a Descrição: ");
			int op1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o Material? \n" + "1 - Madeira\n" + "2 - Metal\n" + "3 - Plástico\n" + "Digite: \n"));

			if (op1 == 1) {
				int op2 = Integer.parseInt(JOptionPane.showInputDialog("É um Armario ou uma cama? \n" + "1 - Guarda Roupas\n" + "2 - Cama\n" + "Digite: \n"));
				if (op2 == 1) {
					float c = Float.parseFloat(JOptionPane.showInputDialog("Qual valor do custo? "));
					float p = Float.parseFloat(JOptionPane.showInputDialog("Qual preço de Venda? "));
					float l = p - c;
					GuardaRoupas a1 = new GuardaRoupas("Madeira", d, c, p, l, "mogno");
					a1.setAltura(2);
					a1.setLargura(2.5f);
					a1.setNumPortas(4);
					lista.add(a1);
					op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));

				}

				if (op2 == 2) {
					float c = Float.parseFloat(JOptionPane.showInputDialog("Qual valor do custo? "));
					float p = Float.parseFloat(JOptionPane.showInputDialog("Qual preço de Venda? "));
					float l = p - c;
					Cama c1 = new Cama("Madeira", d, c, p, l, "Angelim");
					c1.setCasal(true);
					lista.add(c1);
					op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));

				}
			}

				if (op1 == 2) {
					float c = Float.parseFloat(JOptionPane.showInputDialog("Qual valor do custo? "));
					float p = Float.parseFloat(JOptionPane.showInputDialog("Qual preço de Venda? "));
					float l = p - c;
					Estante e1 = new Estante("Metal \\m/", d, c, p, l);
					e1.setAltura(2.5f);
					e1.setLargura(1.5f);
					lista.add(e1);
					op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));

				}
				if (op1 == 3) {
					int op3 = Integer.parseInt(JOptionPane.showInputDialog("É uma Mesa ou um Armário de Banheiro? \n"
							+ "1 - Mesa\n" + "2 - Armario de Banheiro\n" + "Digite: \n"));

					if (op3 == 1) {
						float c = Float.parseFloat(JOptionPane.showInputDialog("Qual valor do custo? "));
						float p = Float.parseFloat(JOptionPane.showInputDialog("Qual preço de Venda? "));
						float l = p - c;
						Mesa m1 = new Mesa("Plástico", d, c, p, l);
						m1.setCor("Palha");
						m1.setQuantCadeiras(8);
						lista.add(m1);
						op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));

					}
					if (op3 == 2) {
						float c = Float.parseFloat(JOptionPane.showInputDialog("Qual valor do custo? "));
						float p = Float.parseFloat(JOptionPane.showInputDialog("Qual preço de Venda? "));
						float l = p - c;
						Armario a1 = new Armario("Plástico", d, c, p, l);
						a1.setComVidro(false);
						lista.add(a1);
						op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir\n2 - Listar\n0 - Sair\nDigite a opção: "));

					}

				}
			} while (op == 1); 
		
			if (op == 2) {
				System.out.println(lista);
				
			}

		}

	}

