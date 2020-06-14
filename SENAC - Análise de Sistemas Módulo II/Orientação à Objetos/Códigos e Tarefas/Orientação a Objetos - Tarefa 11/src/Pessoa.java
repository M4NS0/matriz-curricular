
public class Pessoa {

	private String nome;
	private String telefone;
	private int matricula;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private int cep;

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Pessoa(String n, String t, int m, String e, String d, String b, String c, String u, int p) {
		this.nome = n;
		this.telefone = t;
		this.matricula = m;
		this.email = e;
		this.endereco = d;
		this.bairro = b;
		this.cidade = c;
		this.uf = u;
		this.cep = p;
	}

}
