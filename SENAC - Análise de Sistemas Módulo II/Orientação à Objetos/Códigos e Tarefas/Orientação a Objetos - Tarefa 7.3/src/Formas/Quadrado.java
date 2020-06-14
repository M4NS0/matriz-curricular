package Formas;

import Setup.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica {
	public float lado;

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado: \nlado=" + lado + "\n";
	}
	
}
