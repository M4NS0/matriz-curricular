package Administração;

public abstract class Movel {
	
	protected String material;
	protected String descricao;
	protected float custo;
	protected float preçoVenda;
	protected float lucro;

	public Movel () {
		
	}
	
	public Movel (String m, String d, float c, float p, float l) {
		material = m;
		descricao = d;
		custo = c;
		preçoVenda = p;
		lucro = l;
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
	public float getPreçoVenda() {
		return preçoVenda;
	}
	public void setPreçoVenda(float preçoVenda) {
		this.preçoVenda = preçoVenda;
	}
	public float getLucro() {
		return lucro;
	}
	public void setLucro(float lucro) {
		this.lucro = preçoVenda - custo;
	}

	@Override
	public String toString() {
		return "Movel [material=" + material + ", descricao=" + descricao + ", custo=" + custo + ", preçoVenda="
				+ preçoVenda + ", lucro=" + lucro + "]";
	}
	
	
	
	
	
}