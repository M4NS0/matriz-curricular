package Escola;

public class Curso {
	int codigo;
	String nome;
	String preRequisito;
	int cargaHora;
	double valor;
	
	public Curso() {
		
	}
	
	/*
	public Curso(int codigoCurso, String nomeCurso, String preRequCurso, int cargaHorariaCurso, double valorCurso ) {
		this.codigo = codigoCurso;
		this.nome = nomeCurso;
		this.preRequisito = preRequCurso;
		this.cargaHora = cargaHorariaCurso;
	}
	*/
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreRequisito() {
		return preRequisito;
	}
	public void setPreRequisito(String preRequisito) {
		this.preRequisito = preRequisito;
	}
	public int getCargaHora() {
		return cargaHora;
	}
	public void setCargaHora(int cargaHora) {
		this.cargaHora = cargaHora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		
		return "\tDados do Curso:\n" 				+
		    "\n\t================="  				+
		    "\n\t        Código: " + codigo 		+
		    "\n\t          Nome: " + nome 			+
 		    "\n\tPré Requisitos: " + preRequisito 	+
		    "\n\t    Carga-Hora: " + cargaHora 		+
		    "\n\t         Valor: " + valor;
	}
	

	
	
}