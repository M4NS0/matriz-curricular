public class GuardaRoupa extends Madeira{
	
	private int numPortas;
	private float largura;
	private float altura;
	
	@Override
	public String toString() {
		return "GuardaRoupa [N� de Portas=" + numPortas + ", Largura=" + largura + ", Altura=" + altura
				+ ", Tipo de Madeira=" + getTipoMadeira() + ", Lucro R$=" + retornarLucro()
				+ ", Material=" + getMaterial() + ", Descri��o=" + getDescricao() + ", Custo R$="
				+ getCusto() + ", Pre�o de Venda R$=" + getPrecoVenda() + "]";
	}
	
	@Override
	public void aumentarPreco(float percentual) {
		this.setPrecoVenda(this.getPrecoVenda() * (1 + percentual/100));
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
}
