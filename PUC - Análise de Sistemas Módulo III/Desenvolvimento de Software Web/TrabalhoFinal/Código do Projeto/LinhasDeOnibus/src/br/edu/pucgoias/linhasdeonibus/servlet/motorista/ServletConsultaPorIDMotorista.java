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
 * Classe servlet responsavel por retornar para a pagina html uma lista de todos os
 * motoristas cadastrados no banco de dados que tenham o codigo informado no front-end.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servletconsultaporidmotorista")
public class ServletConsultaPorIDMotorista extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletConsultaPorIDMotorista() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		Motorista motorista = new Motorista();
		int id = 0;
		String strId = request.getParameter("codigo");
		id = Integer.parseInt(strId);

		if ((strId == null || strId.length() == 0) || strId.isEmpty() && id == 0)
			motorista.setMensagem("Informação inválida");
		else {
			MotoristaControle mc = new MotoristaControle();
			motorista = mc.getMotoristaPorId(id);
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