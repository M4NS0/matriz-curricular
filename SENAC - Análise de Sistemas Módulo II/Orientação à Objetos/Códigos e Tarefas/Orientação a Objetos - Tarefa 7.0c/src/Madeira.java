
public abstract class Madeira extends Movel {
	
	private String tipoMadeira;

	public String getTipoMadeira() {
		return tipoMadeira;
	}

	public void setTipoMadeira(String tipoMadeira) {
		this.tipoMadeira = tipoMadeira;
	}
	
	public void vernizar() {
		System.out.println("vernizado!");
	}
}
