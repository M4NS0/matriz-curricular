package testes;

import java.util.Scanner;

import classes.Aluno;

public class TesteAluno2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int op = -1; 
		Aluno a = new Aluno();
		
		do {
			System.out.println("1 - Inserir");
			System.out.println("2 - Imprimir");
			System.out.println("0 - Sair");
			System.out.print("Digite a opção: ");
			op = s.nextInt();
			
			if (op == 1) {
				a.setMatricula(1);
				System.out.println("Digite o nome do Aluno: ");
				a.setNome(s.next());
				System.out.println("Digite o sexo do Aluno: ");
				a.setSexo(s.next().charAt(0));
				System.out.println("Digite o telefone do Aluno: ");
				a.setFone(s.next());
				System.out.println("Digite a altura do Aluno: ");
				a.setAltura(s.nextFloat());
			}
			else if (op == 2) {
				System.out.println("Nome: " + a.getNome() 
						+ " Matrícula: " + a.getMatricula()
						+ " Cidade: " + a.getCidade() 
						+ " Sexo: " + a.getSexo()
						+ " Fone: " + a.getFone()
						+ " Altura: " + a.getAltura()
						);
				System.out.println(a.toString());
			}
			
		} while (op != 0);
		System.out.println("Fim do Programa");
	}
	
}
