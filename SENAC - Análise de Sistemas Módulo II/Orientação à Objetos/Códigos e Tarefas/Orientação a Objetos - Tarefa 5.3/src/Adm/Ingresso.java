package Adm;

public class Ingresso {
	
	protected float valor;
	
	public Ingresso() {
		
	}
	public Ingresso (float v) {
		valor = v;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void imprimeValor() {
		System.out.println("====== Imprimindo ====== \n");
	}
	@Override
	public String toString () {
		return "\n==================\nValor: " + valor;
	}
}
