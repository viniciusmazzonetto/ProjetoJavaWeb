package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adicionaEmailCookie")
public class ColetaEmail extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 510549700309301511L;
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("ISO-8859-1");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sistema</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Bem vindo - "+ usuario.getLogin() +" informa seu email</h2><br/>");
		out.println("<form method =\"post\" action=\"adicionaEmailCookie\">" );
		out.println("Email: <br/> <input type=\"text\" name=\"email\" size=\"80\"><br/>");
		out.println("<p><input type=\"Submit\" value\"Enviar\"></p>");
		out.println("</body>");
		out.println("</html>");
		
	}
	

	
	
	
}
