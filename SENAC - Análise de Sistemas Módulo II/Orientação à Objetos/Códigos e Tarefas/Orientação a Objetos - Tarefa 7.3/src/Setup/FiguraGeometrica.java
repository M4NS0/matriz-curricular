package Setup;


public class FiguraGeometrica implements ICalculavel {
	private float ponto;


	public float getPonto() {
		return ponto;
	}

	public void setPonto(float ponto) {
		this.ponto = ponto;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica \nponto=" + ponto + "\n";
	}

	@Override
	public void area() {
	}
	
	@Override
	public void perimetro() {
		
	}

}
