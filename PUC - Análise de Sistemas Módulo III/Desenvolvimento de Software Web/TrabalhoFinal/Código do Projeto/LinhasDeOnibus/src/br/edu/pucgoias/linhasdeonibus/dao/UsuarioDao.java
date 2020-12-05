package br.edu.pucgoias.linhasdeonibus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.modelo.Usuario;

/**
 * UsuariDao � uma classe que tem somente dois m�todos, um deles ir� retornar uma lista
 * de usu�rios vindas do banco(getTodos()) e o outro ir� somente criar o usu�rio(criaUsuario()) e 
 * armazenar em objetos do tipo Usu�rio.
 * 
 * @author Bruno
 * @03/12/2020
 */
public class UsuarioDao extends BaseDao {

	public List<Usuario> getTodos() {

		List<Usuario> lista = new ArrayList<>();
		Usuario usuario = new Usuario();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.usuario;";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				usuario = criaUsuario(rs);
				lista.add(usuario);
			}

		} catch (SQLException e) {
			return lista;
		}
		return lista;
	}

	public Usuario criaUsuario(ResultSet rs) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setNomeUsuario(rs.getString("nomeUsuario"));
		usuario.setSenha(rs.getString("senha"));
		usuario.setTipo(rs.getString("tipo"));
		return usuario;
	}
}