package br.edu.pucgoias.sistemaestoque.controle;

import java.util.List;

import br.edu.pucgoias.linhasdeonibus.dao.UsuarioDao;
import br.edu.pucgoias.sistemaestoque.modelo.Usuario;

/**
 * Classe responsavel unicamente por buscar o método getTodos() da classe UsuarioDao e
 * retornar uma lista de usuarios para o servlet correspondente.
 * 
 * @author Bruno
 * @data 03/12/2020
 */

public class UsuarioControle {

	private UsuarioDao ud = new UsuarioDao();

	public List<Usuario> getUsuario() {
		List<Usuario> usuario = ud.getTodos();
		return usuario;
	}
}
