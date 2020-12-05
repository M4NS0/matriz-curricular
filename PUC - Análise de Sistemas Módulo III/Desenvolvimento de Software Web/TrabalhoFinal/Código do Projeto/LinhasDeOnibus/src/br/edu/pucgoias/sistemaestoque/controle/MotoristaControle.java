package br.edu.pucgoias.sistemaestoque.controle;

import java.util.List;

import br.edu.pucgoias.linhasdeonibus.dao.MotoristaDao;
import br.edu.pucgoias.sistemaestoque.modelo.Motorista;

/**
 * Classe responsavél por ser um intermediário entre os servlets e a classe MotoristaDao.
 * As regras de negócio do sistema poderiam facilmente serem estabelecidas aqui nesta classe.
 * A classe possue métodos que buscam dados na classe MotoristaDao e os repassam para os servlets
 * correspondetes. 
 * 
 * @author Bruno
 * @data 30/11/2020
 */

public class MotoristaControle {

	private MotoristaDao md = new MotoristaDao();

	public List<Motorista> getMotorista() {
		List<Motorista> Motorista = md.getTodos();
		return Motorista;
	}

	public Motorista getMotoristaPorId(int id) {
		return md.getMotoristaViaId(id);
	}

	public Motorista excluirMsg(int id) {
		return md.excluirMsg(id);
	}

	public Motorista salvarComMsg(Motorista Motorista) {
		return md.salvarMotoristaMsg(Motorista);
	}

	public List<Motorista> buscaMotoristaPorNome(String nome) {
		return md.getMotoristaViaNome(nome);
	}
}