package br.edu.pucgoias.sistemaestoque.modelo;

/**
 * Classe que reperesenta as linhas de onibus. As linhas possuem um identificador unico, uma descri��o, 
 * um numero da linha, um atributo mensagem para armazenar mensagens vindas das classe LinhaDao, um n�mero 
 * de controle para determinar se a op��o desejada � uma inclusao, altera��o ou exclus�o e m�todos
 * para manipula�ao de cada um desses atributos.
 * O objetivo desta classe � conter todas as caracter�sticas e a��es que a linha possui.
 * 
 * @author Bruno
 * @data 02/12/2020
 */
public class Linha {

	private int idLinha;
	private String descricao;
	private int numeroLinha;
	
	private String mensagem;
	private int controle;

	public int getIdLinha() {
		return idLinha;
	}

	public void setIdLinha(int idLinha) {
		this.idLinha = idLinha;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeroLinha() {
		return numeroLinha;
	}

	public void setNumeroLinha(int numeroLinha) {
		this.numeroLinha = numeroLinha;
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
		return "Linha [idLinha=" + idLinha + ", descricao=" + descricao + ", numeroLinha=" + numeroLinha + ", mensagem="
				+ mensagem + ", controle=" + controle + "]";
	}
}