package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adicionaEmailCookie")
public class AdicionaEmailServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6833737828824008899L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		
		resp.addCookie(new Cookie("email", email));
		req.setAttribute("email", email);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/sistema");
		dispatcher.forward(req, resp);
	}
	
	
	
}
