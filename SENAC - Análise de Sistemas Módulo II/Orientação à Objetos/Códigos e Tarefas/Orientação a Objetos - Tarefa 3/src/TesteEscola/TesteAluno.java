package TesteEscola;

import Escola.Aluno;

public class TesteAluno {
	public static void main(String[] args) {


		Aluno aluno1 = new Aluno(); // public Aluno () {
		aluno1.setNome("Bruno");
		aluno1.setCpf("66666666666");
		aluno1.setRg("66666");
		aluno1.setEnd("Rua 66 com rua 69");
		aluno1.setFone("666 um pata na oreia");
		
		System.out.println(	"\nNome: " + aluno1.getNome() +
							"\n  RG: " + aluno1.getRg() +
							"\n CPF: " + aluno1.getCpf() + 
							"\n End: " + aluno1.getEnd() +
							"\nFone: " + aluno1.getFone());
		
		}
	}
