public class Animais {
	
	private int id;
	private String nome;
	private String tipo;
	private String raca;
	private String cor;
	private float peso;
	private float altura;
	private String anoNascimento;
	
	public Animais() {
	}
	public Animais(int id, String nome, String tipo, String raca, String cor, Float peso, Float altura, String anoNascimento) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.cor = cor;
		this.peso = peso;
		this.altura = altura;
		this.anoNascimento = anoNascimento;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return tipo;
	}
	public void setTelefone(String tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return raca;
	}
	public void setMatricula(String raca) {
		this.raca = raca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
