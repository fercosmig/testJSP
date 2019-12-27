package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecebeDados
 */
@WebServlet("/RecebeDados")
public class RecebeDadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecebeDadosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nome = request.getParameter("reqtxtnome");
		String email = request.getParameter("reqtxtemail");
		String dataNascimento = request.getParameter("reqtxtdatanascimento");
	
		String dt[] = dataNascimento.split("-");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, Integer.parseInt(dt[0]));
		c.set(Calendar.MONTH, Integer.parseInt(dt[1]));
		c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dt[2]));
		
		String pattern = "EEE, MMM dd, YYYY";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		dataNascimento = sdf.format(c.getTime());
		
		request.setAttribute("nome", nome);
		request.setAttribute("email", email);
		request.setAttribute("dataNascimento", dataNascimento);
		request.getRequestDispatcher("formServletTratamento.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
