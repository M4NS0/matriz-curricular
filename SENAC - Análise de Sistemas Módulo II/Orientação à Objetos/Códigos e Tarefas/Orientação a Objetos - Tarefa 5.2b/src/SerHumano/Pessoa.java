package SerHumano;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa() {
		
	}
	public Pessoa(String n, int i) {
		nome = n;
		idade = i;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "====================\nNome : " + nome + "\nIdade: " + idade;
	}
}
