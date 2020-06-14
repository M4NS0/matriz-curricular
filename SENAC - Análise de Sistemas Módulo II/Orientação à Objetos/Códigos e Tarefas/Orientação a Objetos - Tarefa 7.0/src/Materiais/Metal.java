package Materiais;

import Administração.Movel;

public abstract class Metal extends Movel {
	float espessura;
	String cor;
	public Metal(String m, String d, float c, float p, float l) {
		super(m, d, c, p, l);
		
	}
	public float getEspessura() {
		return espessura;
	}
	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public abstract String pintarDemaos();
	
	
}
