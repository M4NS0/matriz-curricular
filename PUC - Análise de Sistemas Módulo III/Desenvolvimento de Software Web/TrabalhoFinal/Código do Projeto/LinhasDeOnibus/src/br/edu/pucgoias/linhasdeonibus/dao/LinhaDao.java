package br.edu.pucgoias.linhasdeonibus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.modelo.Linha;

/**
 * LinhaDao � a classe de crud da linha, nela cont�m todos os m�todos para excutar
 * uma exclus�o, altera��o, salvamento ou busca de uma nova linha, al�m de m�todos auxiliares
 * como getGeneratedId() e verificarComposicao().
 * 
 * @author Jo�o Victor
 * @data 30/11/2020
 */
public class LinhaDao extends BaseDao {

	public Linha getLInhaViaId(int id) {

		Linha linha = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from public.linha where idlinha=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				linha = criaLinha(rs);
			}

		} catch (SQLException e) {
			linha = null;
		}
		return linha;
	}

	public Linha criaLinha(ResultSet rs) throws SQLException {
		Linha linha = new Linha();
		linha.setDescricao(rs.getString("descricao"));
		linha.setIdLinha(rs.getInt("idLinha"));
		linha.setNumeroLinha(rs.getInt("numeroLinha"));
		return linha;
	}

	public List<Linha> getLinhaViaDescricao(String descricao) {

		String nomeMinusculo = descricao.toLowerCase();
		List<Linha> lista = new ArrayList<>();
		Linha linha = new Linha();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.linha where lower(descricao) like ? order by descricao;";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nomeMinusculo + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				linha = criaLinha(rs);
				lista.add(linha);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}

	public Linha salvarLinhaMsg(Linha linha) {
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			if (linha.getIdLinha() == 0) {
				// � interessante fazer uma consulta para ver se j� existe item com essa
				// descri��o
				sql = "insert into public.linha (descricao, numeroLinha) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				linha.setControle(1);
			} else {
				sql = "update public.linha set descricao=?, numeroLinha=?";
				sql += " where idLinha = ?";
				pstm = conn.prepareStatement(sql);
				linha.setControle(2);
			}
			pstm.setString(1, linha.getDescricao());
			pstm.setInt(2, linha.getNumeroLinha());

			if (linha.getIdLinha() != 0) {
				pstm.setInt(3, linha.getIdLinha());
			}

			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (linha.getControle() == 1)
					linha.setMensagem("Inclus�o n�o foi realizada");
				if (linha.getControle() == 2)
					linha.setMensagem("Altera��o n�o foi realizada");
			} else {
				if (linha.getIdLinha() == 0) {
					int idInserir = getGeneratedId(pstm);
					linha.setIdLinha(idInserir);
				}
				if (linha.getControle() == 1)
					linha.setMensagem("Inclus�o realizada com sucesso!!");
				if (linha.getControle() == 2)
					linha.setMensagem("Altera��o realizada com sucesso!!");
			}
		} catch (SQLException e) {
			linha.setMensagem("Erro de atualiza��o");
		}
		return linha;
	}

	public int getGeneratedId(PreparedStatement stm) throws SQLException {
		ResultSet rs = stm.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			return id;
		}
		return 0;
	}

	/**
	 * M�todo usado para verificar se alguma linha est� presente em algum onibus cadastrado.
	 * Desta forma mant�m-se a integridade do banco de dados, pois n�o estar� permitindo
	 * excluir uma linha se ela estiver sendo usada em algum onibus cadastrado.
	 * 
	 * @autor Jo�o Victor
	 * @data 02/12/2020
	 */
	private boolean verificarComposicao(int id) {

		PreparedStatement pstm = null;
		Connection conn = null;
		ResultSet rs;

		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select idonibus from public.onibus where idlinhafk = ?");
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			return true;
		}
		return false;
	}

	public Linha excluirMsg(int id) {

		Linha linha = new Linha();
		PreparedStatement pstm = null;
		Connection conn = null;

		try {
			if (verificarComposicao(id)) {
				throw new Exception();
			}
			conn = this.getConnection();
			String sql = "delete from public.linha where idlinha = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			if (conta > 0) {
				linha.setControle(3);
				linha.setMensagem("Exclus�o efetuada com sucesso");
			}

		} catch (SQLException e) {
			linha.setMensagem("Erro inesperado de exclus�o");
		} catch (Exception e) {
			linha.setMensagem("Erro de exclus�o, linha pode estar composta em algum onibus cadastrado");
		}
		return linha;
	}

	public List<Linha> getTodos() {

		List<Linha> lista = new ArrayList<>();
		Linha linha = new Linha();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.linha order by descricao;";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				linha = criaLinha(rs);
				lista.add(linha);
			}

		} catch (SQLException e) {
			return lista;
		}
		return lista;

	}
}