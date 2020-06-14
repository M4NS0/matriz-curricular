import java.util.Date;

public class Medicamento {
	
	private int id;
	private String nome;
	private String principioAtivo;
	private String und;
	private int qtdeEstoque;
	private Date dataValidade;
	
	public Medicamento() {
	}
	
	public Medicamento(String nome) {
		this.und = "Cx";
		this.dataValidade = new Date();
		this.nome = nome;
	}
	
	public Medicamento(int id, String nome, String principio, 
			String und, int qtde, Date data) {
		this.id = id;
		this.nome = nome;
		this.principioAtivo = principio;
		this.und = und;
		this.qtdeEstoque = qtde;
		this.dataValidade = data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	public String getUnd() {
		return und;
	}
	public void setUnd(String und) {
		this.und = und;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Medicamento [id=" + id + ", nome=" + nome + ", principioAtivo=" + principioAtivo + ", und=" + und
				+ ", qtdeEstoque=" + qtdeEstoque + ", dataValidade=" + dataValidade + "]";
	}


	
}
