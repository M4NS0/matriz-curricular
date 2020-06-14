package Itens;

public class Item {
	protected String nome;
	
		
	public Item(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void lavar() {
		
	}
	public void aspirar() {
		
	}
	
	public void encerar() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "Itens \nNome: " + nome;
	}
	
}
