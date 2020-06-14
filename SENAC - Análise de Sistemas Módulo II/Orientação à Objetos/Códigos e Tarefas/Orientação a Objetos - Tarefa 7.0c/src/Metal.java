public abstract class Metal extends Movel {
	
	private float espessura;
	private String cor;
	
	public void pintar(int numMaos) {
		System.out.println("O m�vel foi pintado em " + numMaos + " camadas!");
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getEspessura() {
		return espessura;
	}
	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}
}
