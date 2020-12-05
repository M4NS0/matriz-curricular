package br.edu.pucgoias.sistemaestoque.modelo;

/**
 * Classe que reperesenta motoristas. Os motoristas possuem um identificador unico, um numero do onibus, 
 * um modelo, um chassi, um atributo mensagem para armazenar mensagens vindas das classe OnibusDao, um número 
 * de controle para determinar se a opção desejada é uma inclusao, alteração ou exclusão e métodos
 * para manipulaçao de cada um desses atributos.
 * O objetivo desta classe é conter todas as características e ações que o onibus possui.
 * 
 * @author Bruno
 * @data 02/12/2020
 */

public class Onibus {

	private int idOnibus;
	private int numeroDoOnibus;
	private String modelo;
	private String chassi;

	private String mensagem;
	private int controle;

	private Linha linha;
	private Motorista motorista;

	public int getIdOnibus() {
		return idOnibus;
	}

	public void setIdOnibus(int idOnibus) {
		this.idOnibus = idOnibus;
	}

	public int getNumeroDoOnibus() {
		return numeroDoOnibus;
	}

	public void setNumeroDoOnibus(int numeroDoOnibus) {
		this.numeroDoOnibus = numeroDoOnibus;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
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

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	@Override
	public String toString() {
		return "Onibus [idOnibus=" + idOnibus + ", numeroDoOnibus=" + numeroDoOnibus + ", modelo=" + modelo
				+ ", chassi=" + chassi + ", mensagem=" + mensagem + ", controle=" + controle + ", linha=" + linha
				+ ", motorista=" + motorista + "]";
	}
}