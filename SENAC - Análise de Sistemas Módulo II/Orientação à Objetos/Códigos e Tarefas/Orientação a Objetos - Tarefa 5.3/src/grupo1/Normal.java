package grupo1;
import Adm.*;

public class Normal extends Ingresso {
	
	private String tipo;
	
	public Normal (float v) {
		super(v);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + tipo + "\n";
	}
}
