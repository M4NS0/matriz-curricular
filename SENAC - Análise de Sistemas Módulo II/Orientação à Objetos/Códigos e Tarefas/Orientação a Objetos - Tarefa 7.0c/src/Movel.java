public abstract class Movel {
	
	private String material;
	private String descricao;
	private float custo;
	private float precoVenda;
	
	public abstract String toString();
	public abstract void aumentarPreco(float percentual);
	
	public float retornarLucro() {
		return precoVenda - custo;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		this.custo = custo;
	}
	public float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	} 
}
