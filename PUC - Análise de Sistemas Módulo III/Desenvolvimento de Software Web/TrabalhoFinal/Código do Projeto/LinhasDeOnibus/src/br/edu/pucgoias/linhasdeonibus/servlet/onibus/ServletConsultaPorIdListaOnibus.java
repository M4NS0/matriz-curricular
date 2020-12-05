package br.edu.pucgoias.linhasdeonibus.servlet.onibus;

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

import br.edu.pucgoias.sistemaestoque.controle.OnibusControle;
import br.edu.pucgoias.sistemaestoque.modelo.Onibus;

/**
 * Classe servlet responsavel por retornar para a pagina html uma lista de todos os
 * onibus cadastrados no banco de dados que tenham o codigo informado no front-end.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servletconsultaporidlistaonibus")
public class ServletConsultaPorIdListaOnibus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletConsultaPorIdListaOnibus() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pesquisar = request.getParameter("pesquisar");
		int id = Integer.parseInt(pesquisar);
		gson = new GsonBuilder().setPrettyPrinting().create();
		List<Onibus> lista = new ArrayList<>();

		OnibusControle oc = new OnibusControle();
		Onibus onibus = new Onibus();
		onibus = oc.getOnibusPorId(id);

		if (onibus != null) {
			lista.add(onibus);
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