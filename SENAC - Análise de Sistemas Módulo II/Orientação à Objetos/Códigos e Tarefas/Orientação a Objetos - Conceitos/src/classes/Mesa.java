package classes;

public class Mesa {

	// visibilidade dos atributos e métodos
	// private, protected, package, public
	
	private int numLugares;
	public int largura; // Nao recomendável *public em Atributos, seguindo os conceitos de Orientação a Objeto
	public int altura;
	float valor; // padrao de visibilidade = package
	
	// Método que altera o valor do atributo = setZZZZZ
	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}
	public int getNumLugares() {
		return this.numLugares;
	}
	
	
	public Mesa() {
		numLugares = 6;
	}
	
	public void movimentar() {
		System.out.println("Movimentando a mesa");
	}	
	
	
	
}
