package br.edu.pucgoias.sistemaestoque.controle;

import java.util.List;

import br.edu.pucgoias.linhasdeonibus.dao.OnibusDao;
import br.edu.pucgoias.sistemaestoque.modelo.Onibus;

/**
 * Classe responsav�l por ser um intermedi�rio entre os servlets e a classe OnibusDao.
 * As regras de neg�cio do sistema poderiam facilmente serem estabelecidas aqui nesta classe.
 * A classe possue m�todos que buscam dados na classe OnibusDao e os repassam para os servlets
 * correspondetes. 
 * 
 * @author Bruno
 * @data 30/11/2020
 */

public class OnibusControle {

	private OnibusDao od = new OnibusDao();

	public List<Onibus> getOnibus() {
		List<Onibus> onibus = od.getTodos();
		return onibus;
	}

	public Onibus getOnibusPorId(int id) {
		return od.getOnibusViaId(id);
	}

	public Onibus excluirMsg(int id) {
		return od.excluirMsg(id);
	}

	public Onibus salvarComMsg(Onibus onibus) {
		return od.salvarOnibusMsg(onibus);
	}

	public List<Onibus> buscaOnibusPorModelo(String modelo) {
		return od.getOnibusViaModelo(modelo);
	}
}