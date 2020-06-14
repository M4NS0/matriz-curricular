package v2;

public class Funcionario {
	protected int matricula;
	protected String nome;
	protected String departamento;
	
	public Funcionario () {
		
	}
	public Funcionario (int matricula, String nome, String departamento) {
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		
		return 	"\n======================"
			+	"\nMatricula: " + matricula 
			+	"\nNome: " + nome
			+	"\nDepartamento: " + departamento;
	}
	public void imprimir() {
		System.out.println("Imprimindo....");
	}


	
	
}
