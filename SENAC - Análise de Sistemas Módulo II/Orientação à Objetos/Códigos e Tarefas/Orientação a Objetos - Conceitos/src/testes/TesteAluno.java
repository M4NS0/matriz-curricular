package testes;

import classes.Aluno;

public class TesteAluno {

	public static void main(String[] args) {

		// Variáveis do tipo primitivo (int, float, double, char, boolean)
		int cont;
		
		// Variável a = variavel do tipo objeto
		Aluno a = new Aluno();
		a.setMatricula(1);
		a.setNome("Joao");
		a.setSexo('M');
		a.setAltura(1.80f);
		a.setCidade("Goiania");
		a.setFone("(62)598989");
		
		System.out.println("Nome: " + a.getNome());
		System.out.println("Cidade: " + a.getCidade());
		System.out.println("Nome: " + a.getNome() + " Cidade: " 
				+ a.getCidade() + " Sexo: "
				+ a.getSexo());
		
		Aluno b = new Aluno(200, "Marcio");
		System.out.println(b.toString());
	}

}
