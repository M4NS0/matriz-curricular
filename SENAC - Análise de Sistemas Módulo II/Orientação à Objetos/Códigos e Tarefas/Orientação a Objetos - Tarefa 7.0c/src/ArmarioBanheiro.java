public class ArmarioBanheiro extends Plastico{
	
	private boolean comVidro;
	
	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda() * (1 + percentual/100));
	}

	@Override
	public String toString() {
		return "ArmarioBanheiro [Com Vidro=" + comVidro + ", Qualidade=" + getQualidade() + ", Lucro R$="
				+ retornarLucro() + ", Material=" + getMaterial() + ", Descri��o=" + getDescricao()
				+ ", Custo R$=" + getCusto() + ", Pre�o de Venda R$=" + getPrecoVenda() + "]";
	}
	
	public boolean isComVidro() {
		return comVidro;
	}
	public void setComVidro(boolean comVidro) {
		this.comVidro = comVidro;
	}
}
