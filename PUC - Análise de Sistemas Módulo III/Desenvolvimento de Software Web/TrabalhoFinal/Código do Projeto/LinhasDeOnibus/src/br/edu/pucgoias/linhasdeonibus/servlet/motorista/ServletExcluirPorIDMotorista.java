package br.edu.pucgoias.linhasdeonibus.servlet.motorista;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.pucgoias.sistemaestoque.controle.MotoristaControle;
import br.edu.pucgoias.sistemaestoque.modelo.Motorista;

/**
 * Classe servlet responsavel por receber um código de uma linha vindo do front-end
 * e encaminhar para exclusão.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servletexcluirporidmotorista")
public class ServletExcluirPorIDMotorista extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletExcluirPorIDMotorista() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		Motorista motorista = new Motorista();

		int id = 0;
		String idmotorista = request.getParameter("codigo");
		id = Integer.parseInt(idmotorista);

		if ((idmotorista == null || idmotorista.length() == 0) || idmotorista.isEmpty() && id == 0) {
			motorista.setMensagem("Informação Inválida");
		} else {
			MotoristaControle mc = new MotoristaControle();
			motorista = mc.excluirMsg(id);
		}
		String retornoJsonString = this.gson.toJson(motorista);
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