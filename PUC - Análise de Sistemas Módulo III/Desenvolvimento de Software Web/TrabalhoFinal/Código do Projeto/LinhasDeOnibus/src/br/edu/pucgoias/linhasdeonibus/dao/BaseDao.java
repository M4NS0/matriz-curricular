package br.edu.pucgoias.linhasdeonibus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * BaseDao é a classe de conexão com o banco de dados, que no caso foi escolhido o postgresql.
 * A classe conta com um construtor indicando aonde está o driver de conexão e um método que
 * reune as informações salvas em atributos String e dá início a conexão;
 * 
 * @author João Victor
 * @data 30/11/2020
 */
public class BaseDao {

	static final String URL = "jdbc:postgresql://localhost:5433/Linhas_De_Onibus"; // Conferir se a porta é a mesma
	static final String USER = "postgres"; // Usuario João
	static final String PASS = "root"; // Senha João

	public BaseDao() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conecta = DriverManager.getConnection(URL, USER, PASS);
		if (conecta != null) {
			return conecta;
		}
		return null;
	}

	/**
	 * Método main usado para testes de conexão.
	 * 
	 * @autor João Victor
	 * @data 30/11/2020
	 */
	public static void main(String[] args) throws SQLException {
		BaseDao bd = new BaseDao();
		Connection conn = bd.getConnection();
		if (conn != null)
			System.out.println("Conectou !");
		else
			System.out.println("Não conectou");
	}
}