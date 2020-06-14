

public abstract class Profissional {
	private String nome;
	private String escolaridade;
	
	public Profissional() {}
	
	public Profissional(String n,String e) {
		this.setNome(n);
		this.setEscolaridade(e);
	}
	
	@Override
	public String toString() {
		return " [nome=" + nome + ", escolaridade=" + escolaridade + "]";
	}

	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
