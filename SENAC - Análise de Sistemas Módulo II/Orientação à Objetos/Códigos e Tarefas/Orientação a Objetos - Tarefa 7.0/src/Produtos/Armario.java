package Produtos;

import Materiais.Plastico;

public  class Armario extends Plastico{
	
	boolean comVidro;
	
	public Armario(String m, String d, float c, float p, float l) {
		super(m, d, c, p, l);
		
	}


	public boolean isComVidro() {
		return comVidro;
	}

	public void setComVidro(boolean comVidro) {
		this.comVidro = comVidro;
	}

	@Override
	public String toString() {
		return "\nArmario \n- Com Vidro: " + comVidro +
				"\n- Material: " + material +
				"\n- Descrição: " + descricao +
				"\n- Custo: " + custo +
				"\n- Preço de Venda: " + preçoVenda +
				"\n- Lucro: " + lucro + "\n";
	}
	
	
}
