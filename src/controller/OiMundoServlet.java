package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.mail.iap.Response;

/**
 * Servlet implementation class OiMundo
 */
@WebServlet({ "/OiMundo", "/Oi" })
public class OiMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OiMundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		PrintWriter writer = response.getWriter(); 
		writer.print("Oi Mundo!");
		
		response.setContentType("text/html");
		writer.print("<br /><br /><br />");
		writer.print("<ul>");
		writer.print("<li>Fernando Costa Migliorini</li>");
		writer.print("<li>Fernanda Oliveira Migliorini</li>");
		writer.print("<li>Simone Fernandes de Oliveira</li>");
		writer.print("</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
