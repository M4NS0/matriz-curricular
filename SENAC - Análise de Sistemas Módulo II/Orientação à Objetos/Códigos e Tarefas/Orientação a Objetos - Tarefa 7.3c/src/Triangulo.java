
public class Triangulo extends FiguraGeometrica {
	
	private float ladoA;
	private float ladoB;
	private float ladoC;

	@Override
	public float area() {
		// Depende do Tri�ngulo. Existem algumas f�rmulas para calcular. N�o precisam se preocupar com esta quest�o.
		return 0;
	}

	@Override
	public float perimetro() {
		return ladoA + ladoB + ladoC;
	}

	public float getLadoB() {
		return ladoB;
	}

	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}

	public float getLadoA() {
		return ladoA;
	}

	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}

	public float getLadoC() {
		return ladoC;
	}

	public void setLadoC(float ladoC) {
		this.ladoC = ladoC;
	}

}
