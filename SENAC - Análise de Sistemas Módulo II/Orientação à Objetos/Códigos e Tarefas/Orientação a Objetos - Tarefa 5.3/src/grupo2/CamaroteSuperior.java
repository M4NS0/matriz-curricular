package grupo2;

import Adm.*;
public class CamaroteSuperior extends Ingresso {
	
	private String tipo;
	private float adicional;
	
	public CamaroteSuperior (float v) {
		super(v);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getAdicional() {
		return adicional;
	}
	public void setAdicional (float adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + tipo + "\nAdicional: " + adicional + "\nTotal: " + (valor+adicional) + "\n";
	}
}
