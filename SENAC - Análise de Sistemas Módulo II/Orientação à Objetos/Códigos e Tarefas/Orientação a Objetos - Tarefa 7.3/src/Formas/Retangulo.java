package Formas;

import Setup.FiguraGeometrica;

public class Retangulo extends FiguraGeometrica {
	private float base;
	private float altura;
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Retangulo: \nbase=" + base + "\naltura=" + altura + "\n";
	}
	
}
