package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWebServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6540148394931002077L;
	
	
	public HelloWebServlet(){
		
		super();
		
		
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		response.getWriter().append("mapeamento por XML");
	}

}
