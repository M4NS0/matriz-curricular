
package adequado;

public class Transporte {

	private String marca;
	protected String modelo;
	private String cor;
	protected int anoFab;
	protected String nomeProprietario;
	protected int capacidadeMaxima;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	@Override
	public String toString() {
		return "Transporte [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoFab=" + anoFab
				+ ", nomeProprietario=" + nomeProprietario + ", capacidadeMaxima=" + capacidadeMaxima + "]";
	}

	public void imprimirTeste() {
		System.out.println("Imprimindo ...");
	}
	
}
