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
 * Classe servlet responsavel por receber um código de uma linha vindo do front-end
 * e encaminhar para exclusão.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servletexcluirporidlinha")
public class ServletExcluirPorIDLinha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletExcluirPorIDLinha() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		Linha linha = new Linha();

		int id = 0;
		String idlinha = request.getParameter("codigo");
		id = Integer.parseInt(idlinha);

		if ((idlinha == null || idlinha.length() == 0) || idlinha.isEmpty() && id == 0) {
			linha.setMensagem("Informação Inválida");
		} else {
			LinhaControle lc = new LinhaControle();
			linha = lc.excluirMsg(id);
		}
		String retornoJsonString = this.gson.toJson(linha);
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