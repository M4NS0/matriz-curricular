package br.edu.pucgoias.linhasdeonibus.servlet.onibus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.pucgoias.sistemaestoque.controle.LinhaControle;
import br.edu.pucgoias.sistemaestoque.controle.MotoristaControle;
import br.edu.pucgoias.sistemaestoque.controle.OnibusControle;
import br.edu.pucgoias.sistemaestoque.modelo.Linha;
import br.edu.pucgoias.sistemaestoque.modelo.Motorista;
import br.edu.pucgoias.sistemaestoque.modelo.Onibus;

/**
 * Classe servlet responsavel por receber dados do front-end e fazer a alteração
 * de um motorista especificado pelo código.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servleteditarporidonibus")
public class ServletEditarPorIDOnibus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletEditarPorIDOnibus() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		Onibus onibus = null;

		String idonibus = request.getParameter("codigo");
		String numerodoonibus = request.getParameter("numerodoonibus");
		String modelo = request.getParameter("modelo");
		String chassi = request.getParameter("chassi");
		String idLinha = request.getParameter("idLinha");
		String idMotorista = request.getParameter("idMotorista");

		int id = Integer.parseInt(idonibus);
		int numO = Integer.parseInt(numerodoonibus);
		int idL = Integer.parseInt(idLinha);
		int idM = Integer.parseInt(idMotorista);

		if ((modelo == null || modelo.length() == 0) && id == 0) {
			onibus = new Onibus();
			onibus.setIdOnibus(0);
			onibus.setMensagem("Modelo inválido");
		} else {
			onibus = new Onibus();
			Linha linha = new Linha();
			LinhaControle lc = new LinhaControle();
			linha = lc.getLinhaPorId(idL);

			MotoristaControle mc = new MotoristaControle();
			Motorista motorista = new Motorista();
			motorista = mc.getMotoristaPorId(idM);

			onibus.setIdOnibus(id);
			onibus.setNumeroDoOnibus(numO);
			onibus.setModelo(modelo);
			onibus.setChassi(chassi);
			onibus.setLinha(linha);
			onibus.setMotorista(motorista);

			OnibusControle oc = new OnibusControle();
			onibus = oc.salvarComMsg(onibus);
		}

		String retornoJsonString = this.gson.toJson(onibus);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(retornoJsonString);
		out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}