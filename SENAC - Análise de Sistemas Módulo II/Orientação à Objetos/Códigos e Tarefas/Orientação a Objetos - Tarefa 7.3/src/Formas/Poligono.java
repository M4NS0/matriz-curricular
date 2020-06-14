package Formas;

import Setup.FiguraGeometrica;

public class Poligono extends FiguraGeometrica{
	private int lados;

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	@Override
	public String toString() {
		return "Poligono: \nlados=" + lados + "\n";
	}
	
}
