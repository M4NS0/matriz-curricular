package Produtos;

import Materiais.Madeira;

public class GuardaRoupas extends Madeira  {
	int numPortas;
	float largura;
	float altura;
	

	public GuardaRoupas(String m, String d, float c, float p, float l, String t) {
		super(m, d, c, p, l, t);
		this.tipo = t;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
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
	public String envernizar() {
		
		return "- Guarda-Roupa precisa de verniz";
	}

	@Override
	public String toString() {
		return  "\nGuarda-Roupas" +
				"\n- Material: " + material +
				"\n- Tipo de Madeira: " + tipo +
				"\n- Descrição: " + descricao +
				"\n- Custo: " + custo +
				"\n- Preço de Venda: " + preçoVenda +
				"\n- Lucro: " + lucro +
				"\n- Número de Portas: " + numPortas + 
				"\n- Largura: " + largura + 
				"\n- Altura: " + altura + "\n";
				
	}
	

}
