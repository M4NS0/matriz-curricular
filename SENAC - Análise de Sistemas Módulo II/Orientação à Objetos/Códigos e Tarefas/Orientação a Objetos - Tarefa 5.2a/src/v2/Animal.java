package v2;

public class Animal {
	protected String nome;
	protected String raça;

	public Animal() {
	}
	public Animal (String n, String r) {
		nome = n;
		raça = r;
	}
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça (String raça) {
		this.raça = raça;
	}
	
	@Override
	public String toString() {
		return 		"================="
				+ 	"\nNome: " + nome
				+ 	"\nRaça: " + raça;
	}
}