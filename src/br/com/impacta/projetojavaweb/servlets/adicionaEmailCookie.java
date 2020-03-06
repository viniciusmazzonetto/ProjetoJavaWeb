//package br.com.impacta.projetojavaweb.servlets;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("adicionaEmailCookie")
//public class adicionaEmailCookie extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -8405189175778620901L;
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String email = req.getParameter("email");
//		resp.addCookie(new Cookie("email,"email) );
//		ResquestDispatcher dispatcher = req.getRequestDispatcher("login.html");
//		dispatcher.forward(req, resp);
//		
//	}
//	
//	
//
//}
