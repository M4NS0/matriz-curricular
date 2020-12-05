package br.edu.pucgoias.linhasdeonibus.servlet.motorista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

@WebServlet("/servletconsultaporidlistamotorista")
public class ServletConsultaPorIdListaMotorista extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletConsultaPorIdListaMotorista() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pesquisar = request.getParameter("pesquisar");
		int id = Integer.parseInt(pesquisar);
		gson = new GsonBuilder().setPrettyPrinting().create();
		List<Motorista> lista = new ArrayList<>();

		MotoristaControle mc = new MotoristaControle();
		Motorista motorista = new Motorista();
		motorista = mc.getMotoristaPorId(id);

		if (motorista != null) {
			lista.add(motorista);
		}

		String retornoJsonString = this.gson.toJson(lista);
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