package imoveis;
import Adm.*;
public class Antigo extends Imovel{
	
	float desconto;
	String tipo;
	
	public Antigo (float v) {
		super(v);
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "\nTipo: " + tipo + "\nValor: " + valor + "\nTotal: " + (valor - valor*(desconto/100) + " \n*com " + desconto + "% de desconto\n") ;
	}
}
