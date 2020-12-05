package br.edu.pucgoias.sistemaestoque.modelo;

/**
 * Classe que reperesenta motoristas. Os motoristas possuem um identificador unico, um nome, 
 * um cpf, um atributo mensagem para armazenar mensagens vindas das classe MotiristaDao, um n�mero 
 * de controle para determinar se a op��o desejada � uma inclusao, altera��o ou exclus�o e m�todos
 * para manipula�ao de cada um desses atributos.
 * O objetivo desta classe � conter todas as caracter�sticas e a��es que o motorista possui.
 * 
 * @author Bruno
 * @data 02/12/2020
 */

public class Motorista {

	private int idMotorista;
	private String nome;
	private String cpf;

	private String mensagem;
	private int controle;

	public int getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getControle() {
		return controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}

	@Override
	public String toString() {
		return "Motorista [idMotorista=" + idMotorista + ", nome=" + nome + ", dataNascimento=" + cpf + ", mensagem="
				+ mensagem + ", controle=" + controle + "]";
	}
}