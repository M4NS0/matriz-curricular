package Materiais;

import Administração.Movel;

public abstract class Madeira extends Movel {
	protected String tipo;


	public Madeira(String m, String d, float c, float p, float l, String t) {
		super(m, d, c, p, l);
		this.tipo = t;
		
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Madeira [tipo=" + tipo + "]";
	}
	
	public abstract String envernizar();
	
}
