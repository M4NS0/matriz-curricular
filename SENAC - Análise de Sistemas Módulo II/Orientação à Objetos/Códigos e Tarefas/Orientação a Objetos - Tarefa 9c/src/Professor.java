
public class Professor {

	private String nome;
	private String disciplina;
	private String formacao;
	private int periodo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public Professor() {
		
	}
	
	public Professor(String nome, String disciplina, String formacao, int periodo) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
		this.formacao = formacao;
		this.periodo = periodo;
	}
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", disciplina=" + disciplina + ", formacao=" + formacao + ", periodo="
				+ periodo + "]";
	}
	
	public String retornaDadosCSV() {
		return nome + ";" + disciplina + ";" + formacao + ";" + periodo;
	}
	
	
}
