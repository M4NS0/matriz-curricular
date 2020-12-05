package br.edu.pucgoias.sistemaestoque.controle;

import java.util.List;

import br.edu.pucgoias.linhasdeonibus.dao.LinhaDao;
import br.edu.pucgoias.sistemaestoque.modelo.Linha;

/**
 * Classe responsavél por ser um intermediário entre os servlets e a classe LinhaDao.
 * As regras de negócio do sistema poderiam facilmente serem estabelecidas aqui nesta classe.
 * A classe possue métodos que buscam dados na classe LinhaDao e os repassam para os servlets
 * correspondetes. 
 * 
 * @author Bruno
 * @data 30/11/2020
 */

public class LinhaControle {

	private LinhaDao ld = new LinhaDao();

	public List<Linha> getLinha() {
		List<Linha> Linha = ld.getTodos();
		return Linha;
	}

	public Linha getLinhaPorId(int id) {
		return ld.getLInhaViaId(id);
	}

	public Linha excluirMsg(int id) {
		return ld.excluirMsg(id);
	}

	public Linha salvarComMsg(Linha Linha) {
		return ld.salvarLinhaMsg(Linha);
	}

	public List<Linha> buscaLinhaPorDescricao(String descricao) {
		return ld.getLinhaViaDescricao(descricao);
	}
}