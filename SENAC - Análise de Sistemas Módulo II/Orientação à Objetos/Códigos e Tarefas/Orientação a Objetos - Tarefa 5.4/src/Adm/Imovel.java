package Adm;

public class Imovel {
	
	protected float valor;
	
	public Imovel () {
		
	}
	public Imovel (float v) {
		valor = v;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "\n===================\nValor: " + valor + "\n";
	}
}
