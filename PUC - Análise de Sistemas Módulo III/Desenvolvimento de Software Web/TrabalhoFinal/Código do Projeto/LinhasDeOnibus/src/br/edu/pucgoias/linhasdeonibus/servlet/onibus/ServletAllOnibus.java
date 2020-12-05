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
 * onibus cadastrados no banco de dados.
 * 
 * @author João Victor
 * @data 01/12/2020
 */

@WebServlet("/servletallonibus")
public class ServletAllOnibus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;   
    public ServletAllOnibus() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		gson = new GsonBuilder().setPrettyPrinting().create();
        List<Onibus> lista = new ArrayList<>();
		OnibusControle ec = new OnibusControle();
		lista = ec.getOnibus();

		String retornoJsonString = this.gson.toJson(lista);
   	    PrintWriter out = response.getWriter();
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    out.print(retornoJsonString);
	    out.flush();  	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}