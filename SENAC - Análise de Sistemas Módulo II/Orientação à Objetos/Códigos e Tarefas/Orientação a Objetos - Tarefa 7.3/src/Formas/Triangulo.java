package Formas;

import Setup.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica{
	private float ladoA;
	private float ladoB;
	private float ladoC;
	
	public float getLadoA() {
		return ladoA;
	}
	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}
	public float getLadoB() {
		return ladoB;
	}
	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}
	public float getLadoC() {
		return ladoC;
	}
	public void setLadoC(float ladoC) {
		this.ladoC = ladoC;
	}
	@Override
	public String toString() {
		return "Triangulo: \n\nladoA=" + ladoA + "\nladoB=" + ladoB + "\nladoC=" + ladoC + "\n";
	}
	
}
