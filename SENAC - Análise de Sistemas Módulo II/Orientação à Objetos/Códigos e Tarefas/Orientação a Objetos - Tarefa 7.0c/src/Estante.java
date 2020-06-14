public class Estante extends Metal{

	private float altura;
	private float largura;
	
	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda() * (1 + percentual/100));
	}
 
	@Override
	public String toString() {
		return "Estante [Altura=" + altura + ", Largura=" + largura + ", Cor=" + getCor() + ", Espessura="
				+ getEspessura() + ", Lucro R$=" + retornarLucro() + ", Material=" + getMaterial()
				+ ", Descri��o=" + getDescricao() + ", Custo R$=" + getCusto() + ", Preco de Venda R$="
				+ getPrecoVenda() + "]";
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}
}
