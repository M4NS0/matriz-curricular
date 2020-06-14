
import java.util.Date;

public class Medicamento {

	int id;
	String nome;
	String principioAtivo;
	String und;
	int quantidadeEstoque;
	Date dataValidade;
	
	public Medicamento () {			// metodo construtor
		
	}
	public Medicamento (int id, String nome, String und, int quantidadeEstoque, Date dataValidade, String principioAtivo) {
		this.id = id;
		this.nome = nome;
		this.und = und;
		this.quantidadeEstoque = quantidadeEstoque;
		this.principioAtivo = principioAtivo;
		this.dataValidade = dataValidade;
		
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

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
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
				+ ", quantidadeEstoque=" + quantidadeEstoque + ", dataValidade=" + dataValidade + "]";
	}
	
	
}
