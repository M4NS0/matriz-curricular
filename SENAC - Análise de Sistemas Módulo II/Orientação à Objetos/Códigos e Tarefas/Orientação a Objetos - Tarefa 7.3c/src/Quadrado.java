public class Quadrado extends FiguraGeometrica{
	
	float lado;

	@Override
	public float area() {
		return (float) Math.pow(lado, 2);
	}

	@Override
	public float perimetro() {
		return lado * 4;
	}
}
