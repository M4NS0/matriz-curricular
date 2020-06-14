package adequado;

public class Carro extends Rodoviario {

	private int numPortas;
	private boolean tetoSolar;
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	/* Inadequado
	@Override
	public String toString() {
		return "Transporte [marca=" + getMarca() + ", modelo=" + modelo + ", cor=" + getCor() + ", anoFab=" + anoFab
				+ ", nomeProprietario=" + nomeProprietario + ", capacidadeMaxima=" + capacidadeMaxima 
				+ ", numPortas=" + numPortas + ", tetoSolar=" + tetoSolar + "]";
	}
	*/

	@Override
	public String toString() {
		return super.toString() 
				+ ", numPortas=" + numPortas + ", tetoSolar=" + tetoSolar + "]";
	}	
}
