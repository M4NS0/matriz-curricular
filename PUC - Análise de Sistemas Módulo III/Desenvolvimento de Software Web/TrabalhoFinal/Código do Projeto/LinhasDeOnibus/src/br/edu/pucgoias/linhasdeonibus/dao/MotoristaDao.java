package br.edu.pucgoias.linhasdeonibus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.modelo.Motorista;

/**
 * MotoristaDao é a classe de crud de motoristas, nela contém todos os métodos para excutar
 * uma exclusão, alteração, salvamento ou busca de um novo motorista, além de métodos auxiliares
 * como getGeneratedId(), verificarComposicao() e verificaExistenciaCpfBaseDados().
 * 
 * @author João Victor
 * @data 30/11/2020
 */
public class MotoristaDao extends BaseDao {

	public Motorista getMotoristaViaId(int id) {

		Motorista motorista = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from public.motorista where idmotorista=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				motorista = criaMotorista(rs);
			}

		} catch (SQLException e) {
			motorista = null;
		}
		return motorista;
	}

	public Motorista criaMotorista(ResultSet rs) throws SQLException {
		Motorista motorista = new Motorista();
		motorista.setIdMotorista(rs.getInt("idmotorista"));
		motorista.setNome(rs.getString("nome"));
		motorista.setCpf(rs.getString("cpf"));
		return motorista;
	}

	public List<Motorista> getMotoristaViaNome(String nome) {

		String nomeMinusculo = nome.toLowerCase();
		List<Motorista> lista = new ArrayList<>();
		Motorista motorista = new Motorista();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.motorista where lower(nome) like ? order by nome;";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nomeMinusculo + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				motorista = criaMotorista(rs);
				lista.add(motorista);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}

	/**
	 * Método usado para não permitir duplicidade de CPF no banco de dados.
	 * 
	 * @autor João Victor
	 * @data 03/12/2020
	 */
	public Boolean verificaExistenciaCpfBaseDados(Motorista motorista) {

		String cpf = motorista.getCpf();
		PreparedStatement pstm = null;
		Connection conn = null;
		ResultSet rs;

		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from public.motorista where cpf = ?;");
			pstm.setString(1, cpf);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			return true;
		}
		return false;
	}

	public Motorista salvarMotoristaMsg(Motorista motorista) {

		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {

			if (verificaExistenciaCpfBaseDados(motorista)) {
				throw new Exception();
			}

			conn = this.getConnection();
			if (motorista.getIdMotorista() == 0) {
				sql = "insert into public.motorista (nome, cpf) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				motorista.setControle(1);
			} else {
				sql = "update public.motorista set nome=?, cpf=?";
				sql += " where idmotorista = ?";
				pstm = conn.prepareStatement(sql);
				motorista.setControle(2);
			}
			pstm.setString(1, motorista.getNome());
			pstm.setString(2, motorista.getCpf());

			if (motorista.getIdMotorista() != 0) {
				pstm.setInt(3, motorista.getIdMotorista());
			}

			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (motorista.getControle() == 1)
					motorista.setMensagem("Inclusão não foi realizada");
				if (motorista.getControle() == 2)
					motorista.setMensagem("Alteração não foi realizada");
			} else {
				if (motorista.getIdMotorista() == 0) {
					int idInserir = getGeneratedId(pstm);
					motorista.setIdMotorista(idInserir);
				}
				if (motorista.getControle() == 1)
					motorista.setMensagem("Inclusão realizada com sucesso!!");
				if (motorista.getControle() == 2)
					motorista.setMensagem("Alteração realizada com sucesso!!");
			}
		} catch (SQLException e) {
			motorista.setMensagem("Erro de atualização");
		} catch (Exception e) {
			motorista.setMensagem("Erro de atualização, cpf já está contido na base de dados");
		}
		return motorista;
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
	 * Método usado para verificar se algum motorista está presente em algum onibus cadastrado.
	 * Desta forma mantém-se a integridade do banco de dados, pois não estará permitindo
	 * excluir um motorista se ele estiver sendo usado em algum onibus cadastrado.
	 * 
	 * @autor João Victor
	 * @data 02/12/2020
	 */
	private boolean verificarComposicao(int id) {
		PreparedStatement pstm = null;
		Connection conn = null;
		ResultSet rs;

		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select idonibus from public.onibus where idmotoristafk = ?");
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

	public Motorista excluirMsg(int id) {
		Motorista motorista = new Motorista();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			if (verificarComposicao(id)) {
				throw new Exception();
			}

			conn = this.getConnection();
			String sql = "delete from public.motorista where idmotorista = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			if (conta > 0) {
				motorista.setControle(3);
				motorista.setMensagem("Exclusão efetuada com sucesso");
			}
		} catch (SQLException e) {
			motorista.setMensagem("Erro de exclusão");
		} catch (Exception e) {
			motorista.setMensagem("Erro de exclusão, motorista pode estar composto em algum onibus cadastrado");
		}
		return motorista;
	}

	public List<Motorista> getTodos() {

		List<Motorista> lista = new ArrayList<>();
		Motorista motorista = new Motorista();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from public.motorista order by nome;";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				motorista = criaMotorista(rs);
				lista.add(motorista);
			}

		} catch (SQLException e) {
			return lista;
		}
		return lista;
	}
}