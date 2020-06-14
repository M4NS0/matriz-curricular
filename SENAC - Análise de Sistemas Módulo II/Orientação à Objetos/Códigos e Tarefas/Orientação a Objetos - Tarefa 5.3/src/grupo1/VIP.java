package grupo1;
import Adm.Ingresso;

public class VIP extends Ingresso {
	private String tipo;
	private float adicional;
	
	public VIP (float v) { 
		super(v);
	}
	public String getTipo () {
		return tipo;
	}
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	public float getAdicional() {
		return adicional;
	}
	public void setAdicional(float adicional) { 
		this.adicional = adicional;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + tipo + "\nAdicional: " + adicional + "\nTotal: " + (valor+adicional) + "\n";
	}
}
