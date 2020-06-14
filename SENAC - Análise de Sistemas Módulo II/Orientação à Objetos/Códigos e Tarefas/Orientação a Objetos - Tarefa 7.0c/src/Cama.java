public class Cama extends Madeira{

	private boolean casal;

	@Override
	public void aumentarPreco(float percentual){
		this.setPrecoVenda(this.getPrecoVenda() * (1 + percentual/100));
	}

	@Override
	public String toString() {
		return "Cama [Tipo de Madeira =" + getTipoMadeira() + ", Lucro R$="
				+ retornarLucro() + ", Material =" + getMaterial() + ",  Descri��o =" + getDescricao()
				+ ", Custo R$=" + getCusto() + ", Preco de Venda R$=" + getPrecoVenda() + ", casal =" + getCasal() + "]";
	}

	public boolean getCasal() {
		return casal;
	}
	public void setCasal(boolean casal) {
		this.casal = casal;
	}
}