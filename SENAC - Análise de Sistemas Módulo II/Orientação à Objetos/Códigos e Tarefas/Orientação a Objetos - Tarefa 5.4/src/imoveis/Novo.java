package imoveis;
import Adm.*;
public class Novo extends Imovel {
	
	private String tipo;
	private float adicional;
	
	public Novo (float v) {
		super(v);
		
	}
	public float getAdicional () {
		return adicional;
	}
	public void setAdicional (float adicional) {
		this.adicional = adicional;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "\nTipo: " + tipo + "\nValor: " + valor + "\nTotal: " + (valor + valor*(adicional/100) + " \n*com " + adicional + "% de acrécimo\n") ;
	}

}
