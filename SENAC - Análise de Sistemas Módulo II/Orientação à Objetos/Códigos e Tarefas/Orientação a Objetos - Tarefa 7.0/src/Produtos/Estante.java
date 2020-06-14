package Produtos;

import Materiais.Metal;

public class Estante extends Metal{
	float largura;
	float altura;
	
	public Estante(String m, String d, float c, float p, float l) {
		super(m, d, c, p, l);
		
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String pintarDemaos() {
		
		return "- " + 5 + " demãos devem ser feitas.";
	}
	public String toString() {
		return 	"\nEstante" +
				"\n- Material: " + material +
				"\n- Descrição: " + descricao +
				"\n- Custo: " + custo +
				"\n- Preço de Venda: " + preçoVenda +
				"\n- Lucro: " + lucro +
				"\n- Altura: " + altura +
				"\n- Largura: " + largura + "\n";
		
	}
	
	
}
