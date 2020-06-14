package grupo2;

import Adm.*;

public class CamaroteInferior extends Ingresso {
	
	private String local;
	private String tipo;
	
	public CamaroteInferior (float v) { 
		super(v);
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + tipo + "\nRetirar em: Rua X, No 001, Centro.\n";
	}
	
}
