package Escola;

public class Aluno {
	String cpf;
	String rg;
	String nome;
	String fone;
	String end;
	
	public Aluno () {
		
	}
	
	/*
	public Aluno (String nomeAluno, String carteiraPessoaFisica, String registroGeral, String telefone, String endereço){
		this.nome = nomeAluno;
		this.cpf = carteiraPessoaFisica;
		this.rg = registroGeral;
		this.fone = telefone;
		this.end = endereço;
	}
	*/
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "\tDados do Aluno:\n" 			+
			    "\n\t================="  		+
			    "\n\t          Nome: " + nome 	+
			    "\n\t           CPF: " + cpf 	+
	 		    "\n\t            RG: " + rg 	+
			    "\n\t          Fone: " + fone 	+
			    "\n\t      Endereço: " + end;
	}
	
}
