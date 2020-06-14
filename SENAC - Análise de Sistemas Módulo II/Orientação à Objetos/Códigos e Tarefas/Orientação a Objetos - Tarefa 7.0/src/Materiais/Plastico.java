package Materiais;

import Administração.Movel;

public abstract class Plastico extends Movel{
	int qualidade;
	
	public Plastico(String m, String d, float c, float p, float l) {
		super(m, d, c, p, l);
	
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}
	
	
}
