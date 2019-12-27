package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.MegaSena;
import repository.MegaSenaRepository;

/**
 * Servlet implementation class MegaSenaServlet
 */
@WebServlet("/MegaSenaServlet")
public class MegaSenaServlet extends HttpServlet {
	private static final Logger LOGGER = LogManager.getLogger(MegaSenaServlet.class.getName());
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MegaSenaServlet() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String strConcurso = request.getParameter("reqConcurso");
		if (strConcurso != null && strConcurso != "") {

			try {
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);

				int concurso = Integer.parseInt(strConcurso);
				Date dataSorteio;
				dataSorteio = sdf.parse(request.getParameter("reqDataSorteio"));

				int d1 = Integer.parseInt(request.getParameter("reqD1"));
				int d2 = Integer.parseInt(request.getParameter("reqD2"));
				int d3 = Integer.parseInt(request.getParameter("reqD3"));
				int d4 = Integer.parseInt(request.getParameter("reqD4"));
				int d5 = Integer.parseInt(request.getParameter("reqD5"));
				int d6 = Integer.parseInt(request.getParameter("reqD6"));

				MegaSena m = new MegaSena();
				m.setConcurso(concurso);
				m.setDataSorteio((Date) dataSorteio);
				m.setDezena1(d1);
				m.setDezena2(d2);
				m.setDezena3(d3);
				m.setDezena4(d4);
				m.setDezena5(d5);
				m.setDezena6(d6);

				MegaSenaRepository msc = new MegaSenaRepository();

				msc.create(m);
			} catch (ParseException e) {
				LOGGER.error(e);
			} catch (Exception e1) {
				LOGGER.error(e1);
			}
		}

		try {
			List<MegaSena> todos = new ArrayList<MegaSena>();
			MegaSenaRepository mc = new MegaSenaRepository();
			todos = mc.retrieveList();
			request.setAttribute("todosSorteios", todos);
			request.getRequestDispatcher("megasenaServlet.jsp").forward(request, response);

		} catch (Exception e2) {
			LOGGER.error(e2);
		}

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
