package classes;

public class Aluno {

	private int matricula;
	private String nome;
	private char sexo;
	private float altura;
	private String cidade;
	private String fone;
	
	/* Não adequado, segundo as convenções*/
	/*public int retornaMatricula() {
		return this.matricula;
	}
	public void alteraMatricula(int matricula) {
		this.matricula = matricula;
	}*/

	// Construtor Padrão (default) 
	public Aluno() {
		
	}
	
	public Aluno(int mat, String n) {
		this.matricula = mat;
		this.nome = n;
	}
	

	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", altura=" + altura
				+ ", cidade=" + cidade + ", fone=" + fone + "]";
	}
	
	
}
