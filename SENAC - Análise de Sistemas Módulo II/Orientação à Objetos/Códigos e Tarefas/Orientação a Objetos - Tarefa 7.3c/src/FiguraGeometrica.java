public abstract class FiguraGeometrica implements ICalculavel{
	
	private Ponto ponto = new Ponto();

	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}
}
