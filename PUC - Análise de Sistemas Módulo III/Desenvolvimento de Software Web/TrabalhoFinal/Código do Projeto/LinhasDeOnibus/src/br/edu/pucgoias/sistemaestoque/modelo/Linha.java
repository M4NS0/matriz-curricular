package br.edu.pucgoias.sistemaestoque.modelo;

/**
 * Classe que reperesenta as linhas de onibus. As linhas possuem um identificador unico, uma descrição, 
 * um numero da linha, um atributo mensagem para armazenar mensagens vindas das classe LinhaDao, um número 
 * de controle para determinar se a opção desejada é uma inclusao, alteração ou exclusão e métodos
 * para manipulaçao de cada um desses atributos.
 * O objetivo desta classe é conter todas as características e ações que a linha possui.
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