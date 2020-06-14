
public class Professores {
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
	@Override
	public String toString() {
		
		return 	"\n" + nome + "," + disciplina + "," + formacao + "," + periodo + " Periodo\n";
	}
	
	
}
