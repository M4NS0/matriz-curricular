package br.edu.pucgoias.linhasdeonibus.servlet.linha;

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
import br.edu.pucgoias.sistemaestoque.modelo.Linha;

/**
 * Classe servlet responsavel por receber dados do front-end e fazer o salvamento
 * de uma linha.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servletsalvardadoslinha")
public class ServletSalvarDadosLinha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletSalvarDadosLinha() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();

		String idlinha = request.getParameter("idlinha");
		String numero = request.getParameter("numero");
		String descricao = request.getParameter("descricao");

		int id = Integer.parseInt(idlinha);
		int numO = Integer.parseInt(numero);

		if (idlinha == null || idlinha.length() == 0 || idlinha.isEmpty())
			id = 0;
		else
			id = Integer.parseInt(idlinha);

		Linha linha = new Linha();
		LinhaControle lc = new LinhaControle();
		linha.setIdLinha(id);
		linha.setDescricao(descricao);
		linha.setNumeroLinha(numO);
		linha = lc.salvarComMsg(linha);

		String retornoJsonString = "";
		retornoJsonString = this.gson.toJson(linha);
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