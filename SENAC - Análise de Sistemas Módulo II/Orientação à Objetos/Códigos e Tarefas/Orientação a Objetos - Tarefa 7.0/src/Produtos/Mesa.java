package Produtos;

import Materiais.Plastico;

public class Mesa extends Plastico{
	int quantCadeiras;
	String cor;
	
	public Mesa(String m, String d, float c, float p, float l) {
		super(m, d, c, p, l);
	
	}

	public int getQuantCadeiras() {
		return quantCadeiras;
	}

	public void setQuantCadeiras(int quantCadeiras) {
		this.quantCadeiras = quantCadeiras;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "\nMesa" +
				"\n- Material: " + material +
				"\n- Descrição: " + descricao +
				"\n- Custo: " + custo +
				"\n- Preço de Venda: " + preçoVenda +
				"\n- Lucro: " + lucro +
				"\n- Quantidade de Cadeiras: " + quantCadeiras  +
				"\n- Cor: " + cor + "\n";
	}
	
	

	
	
}
