package br.edu.senaisp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cad")
public class Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String nome = req.getParameter("nome");
			String descricao = req.getParameter("descricao");
			int preco = Integer.parseInt(req.getParameter("preco"));
			
			resp.getWriter().append("<html><h1> Cadastro realizado! <br>Pizza: " + nome + ".<br> Descrição: " + descricao + ".<br> Preço: R$ " + preco + "." + "</h1></html>");
		} catch (Exception e) {
			resp.getWriter().append("<html><h1>ERRO: " + e + "</h1></html>");
		}
	}
	

}
