package Administracao;

public abstract class Profissional{
	String nome;
	String escolaridade;
	
	public Profissional () {
	}
	
	public Profissional(String n, String e) {
		super();
		this.nome = n;
		this.escolaridade = e;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	@Override
	public String toString() {
		return "\nProfissional \nNome: " + nome 
				+ "\nEscolaridade: " + escolaridade 
				+ "\n"+  super.toString()+ "\n";
	}

}
