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
 * Classe servlet responsavel por receber dados do front-end e fazer a alteração
 * de uma linha especificada pelo código.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servleteditarporidlinha")
public class ServletEditarPorIDLinha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletEditarPorIDLinha() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();

		Linha linha = null;

		String idlinha = request.getParameter("idlinha");
		String numero = request.getParameter("numero");
		String descricao = request.getParameter("descricao");

		int id = Integer.parseInt(idlinha);
		int numO = Integer.parseInt(numero);

		if ((descricao == null || descricao.length() == 0) && id == 0) {
			linha = new Linha();
			linha.setIdLinha(0);
			linha.setMensagem("Descricao inválida");
		} else {
			linha = new Linha();
			LinhaControle lc = new LinhaControle();
			linha.setIdLinha(id);
			linha.setDescricao(descricao);
			linha.setNumeroLinha(numO);
			linha = lc.salvarComMsg(linha);
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