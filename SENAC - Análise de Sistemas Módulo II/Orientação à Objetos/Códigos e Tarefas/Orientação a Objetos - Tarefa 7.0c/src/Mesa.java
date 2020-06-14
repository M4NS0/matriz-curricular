public class Mesa extends Plastico {

	private int qtdeCadeiras;
	private String cor;
	
	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda() * (1 + percentual/100));
	}
	@Override
	public String toString() {
		return "Mesa [N� de Cadeiras=" + qtdeCadeiras + ", Cor=" + cor + ", Qualidade=" + getQualidade()
				+ ", Lucro R$=" + retornarLucro() + ", Material=" + getMaterial() + ", Descri��o="
				+ getDescricao() + ", Custo R$=" + getCusto() + ", Pre�o de Venda R$=" + getPrecoVenda() + "]";
	}

	public int getQtdeCadeiras() {
		return qtdeCadeiras;
	}
	public void setQtdeCadeiras(int qtdeCadeiras) {
		this.qtdeCadeiras = qtdeCadeiras;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
