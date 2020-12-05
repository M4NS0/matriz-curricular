package br.edu.pucgoias.linhasdeonibus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.modelo.Onibus;

/**
 * OnibusDao é a classe de crud de onibus, nela contém todos os métodos para excutar
 * uma exclusão, alteração, salvamento ou busca de um novo onibus, além de métodos auxiliares
 * como getGeneratedId().
 * 
 * @author João Victor
 * @data 30/11/2020
 */
public class OnibusDao extends BaseDao {

	public Onibus getOnibusViaId(int id) {

		Onibus onibus = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from public.onibus where idonibus = ?;");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				onibus = criaOnibus(rs);
			}

		} catch (SQLException e) {
			onibus = null;
		}
		return onibus;
	}

	public Onibus criaOnibus(ResultSet rs) throws SQLException {

		Onibus onibus = new Onibus();
		onibus.setIdOnibus(rs.getInt("idonibus"));
		onibus.setNumeroDoOnibus(rs.getInt("numerodoonibus"));
		onibus.setModelo(rs.getString("modelo"));
		onibus.setChassi(rs.getString("chassi"));

		Integer linha = rs.getInt("idlinhafk");
		Integer motorista = rs.getInt("idmotoristafk");

		LinhaDao linhaDao = new LinhaDao();
		onibus.setLinha(linhaDao.getLInhaViaId(linha));
		MotoristaDao motoristaDao = new MotoristaDao();
		onibus.setMotorista(motoristaDao.getMotoristaViaId(motorista));

		return onibus;
	}

	public List<Onibus> getOnibusViaModelo(String modelo) {

		String modeloMinusculo = modelo.toLowerCase();
		List<Onibus> lista = new ArrayList<>();
		Onibus onibus = new Onibus();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.onibus where lower(modelo) like ? order by modelo;";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + modeloMinusculo + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				onibus = criaOnibus(rs);
				lista.add(onibus);
			}
		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}

	public Onibus salvarOnibusMsg(Onibus onibus) {
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			if (onibus.getIdOnibus() == 0) {
				// é interessante fazer uma consulta para ver se já existe item com essa
				// descrição
				sql = "insert into public.onibus (numerodoonibus, modelo, chassi, idlinhafk, idmotoristafk) ";
				sql += " values (?, ?, ?, ?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				onibus.setControle(1);
			} else {
				sql = "update public.onibus set numerodoonibus=?, modelo=?, chassi=?, idlinhafk=?, idmotoristafk=? where idonibus = ?";
				pstm = conn.prepareStatement(sql);
				onibus.setControle(2);
			}
			pstm.setInt(1, onibus.getNumeroDoOnibus());
			pstm.setString(2, onibus.getModelo());
			pstm.setString(3, onibus.getChassi());
			pstm.setInt(4, onibus.getLinha().getIdLinha());
			pstm.setInt(5, onibus.getMotorista().getIdMotorista());

			if (onibus.getIdOnibus() != 0) {
				pstm.setInt(6, onibus.getIdOnibus());
			}

			int idAux = pstm.executeUpdate();

			if (idAux == 0) {
				if (onibus.getControle() == 1)
					onibus.setMensagem("Inclusão não foi realizada");
				if (onibus.getControle() == 2)
					onibus.setMensagem("Alteração não foi realizada");
			} else {
				if (onibus.getIdOnibus() == 0) {
					int idInserir = getGeneratedId(pstm);
					onibus.setIdOnibus(idInserir);
				}
				if (onibus.getControle() == 1)
					onibus.setMensagem("Inclusão realizada com sucesso!!");
				if (onibus.getControle() == 2)
					onibus.setMensagem("Alteração realizada com sucesso!!");
			}
		} catch (SQLException e) {
			onibus.setMensagem("Erro de atualização");
		}
		return onibus;
	}

	public int getGeneratedId(PreparedStatement stm) throws SQLException {
		ResultSet rs = stm.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			return id;
		}
		return 0;
	}

	public Onibus excluirMsg(int id) {
		Onibus onibus = new Onibus();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from public.onibus where idonibus = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			if (conta > 0) {
				onibus.setControle(3);
				onibus.setMensagem("Exclusão efetuada com sucesso");
			}
		} catch (SQLException e) {
			onibus.setMensagem("Erro de exclusão");
		}
		return onibus;
	}

	public List<Onibus> getTodos() {

		List<Onibus> lista = new ArrayList<>();
		Onibus onibus = new Onibus();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.onibus order by idonibus";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				onibus = criaOnibus(rs);
				lista.add(onibus);
			}
		} catch (SQLException e) {
			return lista;
		}
		return lista;
	}
}