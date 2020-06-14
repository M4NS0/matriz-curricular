package v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int escolha = 0;
		int ifun = 0;
		int iass = 0;
		ArrayList<Funcionario> listaFun = new ArrayList<Funcionario>();
		ArrayList<Assistente> listaAss = new ArrayList<Assistente>();
		
	
		do {

			System.out.println("========== Menu 1 ==========" 
					+ "\n 0.  Sair"
					+ "\n 1.  Inserir" 
					+ "\n 2.  Listar" 
					+ "\n========================" 
					+ "\n Digite a Opção desejada:");
			
			escolha = leia.nextInt();
			
			
			if (escolha == 1) {
				int escolha1 = 0;
				do {
					System.out.println("========== Menu 2 ==========" 
							+ "\n 0.  Voltar" 
							+ "\n 1.  Para inserir Funcionario"
							+ "\n 2.  Para inserir Assistente" 
							+ "\n========================"
							+ "\n Digite a Opção desejada:");
					
					escolha1 = leia.nextInt();
				
					while (escolha1 == 1) { 
						
						String nome;
						String dep;
						int mat;
						
						Funcionario f1= new Funcionario();
						System.out.println("Digite o nome do Funcionário:");
						nome = leia.next();
						f1.setNome(nome);
						
						System.out.println("Digite o departamento do Funcionário:");
						dep = leia.next();
						f1.setDepartamento(dep);
						
						System.out.println("Digite a matricula do Funcionário:");
						mat = leia.nextInt();
						f1.setMatricula(mat);
						
						listaFun.add(f1);
						
						ifun++;
						System.out.println("Deseja incluir novo funcionario?\n1 - Sim\n0 - Não");
						escolha1 = leia.nextInt();
					}
					
					if (escolha1 == 2) {

						String nome;
						String dep;
						int mat;
						Assistente a1 = new Assistente();
						
						System.out.println("Digite o nome do Assistente:");
						nome = leia.next();
						a1.setNome(nome);

						System.out.println("Digite o departamento do Assistente:");
						dep = leia.next();
						a1.setDepartamento(dep);

						System.out.println("Digite a matricula do Assistente:");
						mat = leia.nextInt();
						a1.setMatricula(mat);

						listaAss.add(a1);
						iass++;
						System.out.println("Deseja incluir novo assistente?\n2 - Sim\n0 - Não");
						escolha1 = leia.nextInt();
					}
					
					
				} while (escolha1 != 0);
			}
			if (escolha == 2) { 
				System.out.println("============Imprimindo============");
				System.out.println("\n   Numero de Funcionarios: " + ifun + "\n" + listaFun + "\n\n   Numero de Assistentes: " + iass + "\n" + listaAss + "\n");
			}
		} while (escolha != 0);
		System.out.println("Encerrando...");
		// ArrayList<Funcionario> listaFun = new ArrayList<Funcionario>();

		// Funcionario f1 = new Funcionario();
		//f1.setNome("Olsen");
		//f1.setDepartamento("Tesouraria");
		//f1.setMatricula(235345);
		//listaFun.add(f1);
		// System.out.println(f1);

		//System.out.println("\n");
		//Gerente g1 = new Gerente();
		//g1.setNome("Deborah");
		//g1.setDepartamento("Projetos");
		//g1.setMatricula(472309);
		//listaFun.add(g1);
		// System.out.println(g1);

		// ArrayList<Assistente> listaAss = new ArrayList<Assistente>();
		// System.out.println("\n");
		// Assistente a1 = new Assistente();
		// listaAss.add(a1);
		// System.out.println(a1);

		//Tecnico t1 = new Tecnico();
		//t1.setBonus(100);
		//listaAss.add(t1);
		// System.out.println(t1);

		//Administrativo ad1 = new Administrativo(342421, "Georgia", "Mídia");
		//ad1.setAdicional(250);
		//ad1.setTurno("Noturno");
		//listaAss.add(ad1);
		// System.out.println(ad1);

		

	}
}
