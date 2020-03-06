//package br.com.impacta.projetojavaweb.servlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import br.com.impacta.projetojavaweb.models.Usuario;
//
//@WebServlet("/sistema")
//public class SistemaLoginServlet extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -9011049886430688012L;
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doPost(req, resp);
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		
//		Cookie[] cookies = req.getCookies();
//		String  email = null;
//		if(cookies != null){
//			for(Cookie cookie : cookies){
//				if(cookie.getName().equals("email")){
//					email= cookie.getValue();
//					break;
//				}
//			}
//		}
//		
//		if (email == null){
//			RequestDispatcher dispatcher = req.getRequestDispatcher("/coletaEmail");
//			dispatcher.forward(req, resp);
//			else{
//				Usuario usuario = (Usuario) req.getSession().getAttribute("usuario");
//				usuario.setEmail(email);
//				resp.setCharacterEncoding("ISO-8859-1");
//				resp.setContentType("text/html");
//				PrintWriter out = resp.getWriter();
//				out.println("<html>");
//				out.println("<head>");
//				out.println("<title>Sistema</title>");
//				out.println("</head>");
//				out.println("<body>");
//				out.println("<h1>Esta é página principal do sistema</h1>");
//				out.println("<h1>Bem vindo - "+ usuario.getLogin() + "</h1>");
//				out.println("<h1>Seu email é: "+ email +"</h1>");
//				out.println("<h3>Login:</h3>" + req.getParameter("login"));
//				out.println("<h4>Senha:</h4>" + req.getParameter("senha"));
//				out.println("</body>");
//				out.println("</html>");
//			}
//		}
//	}
//}
