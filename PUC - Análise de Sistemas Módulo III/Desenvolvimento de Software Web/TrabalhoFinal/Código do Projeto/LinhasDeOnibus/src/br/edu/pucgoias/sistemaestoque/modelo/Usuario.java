package br.edu.pucgoias.sistemaestoque.modelo;

/**
 * Classe que reperesenta motoristas. Os motoristas possuem um nome de usuario, uma senha,
 * um cpf, e m�todos para manipula�ao de cada um desses atributos.
 * O objetivo desta classe � conter todas as caracter�sticas e a��es que o usu�rio possui.
 * 
 * @author Bruno
 * @data 03/12/2020
 */

public class Usuario {

	private String nomeUsuario;
	private String senha;
	private String tipo;

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", senha=" + senha + ", tipo=" + tipo + "]";
	}
}