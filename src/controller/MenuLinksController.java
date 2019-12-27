/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.List;

import model.MenuLinks;

/**
 * @author fercosmig
 *
 */
public class MenuLinksController {

	/** Methods */

	public List<MenuLinks> getMenuItens() {
		String[][] itens = { 
				{ "HOME", "home.jsp", "conteudo" }, 
				{ "Acesso MariaDB", "acessoMariaDB.jsp", "conteudo" },
				{ "Calculadora de tempo", "timeCalculator.jsp", "conteudo"},
				{ "Contato", "contatoEmail.jsp", "conteudo" }, 
				{ "Conversor", "conversor.jsp", "conteudo" },
				{ "Fibonacci", "fibonacci.jsp", "conteudo" },
				{ "Form Servlet", "formServlet.jsp", "conteudo" }, 
				{ "Formulário", "form.jsp", "conteudo" }, 
				{ "I. M. C.", "bodyMassIndex.jsp", "conteudo" }, 
				{ "Index", "index.jsp", "_top" },
				{ "MegaSena", "megasena.jsp", "conteudo" }, 
				{ "MegaSena Servlet", "MegaSenaServlet", "conteudo" }, 
				{ "Notes", "note.jsp", "conteudo" },
				{ "Números primos", "primeNumbers.jsp", "conteudo" }, 
				{ "Peso ideal", "idealWeight.jsp", "conteudo" },
				{ "Raíz quadrada", "squareRoot.jsp", "conteudo" }, 
				{ "Servlet", "Oi", "conteudo" }
			};

		List<MenuLinks> im = new ArrayList<MenuLinks>();
		MenuLinks m = null;
		for (int i = 0; i < itens.length; i++) {
			m = new MenuLinks();
			m.setName(itens[i][0]);
			m.setUrl(itens[i][1]);
			m.setTarget(itens[i][2]);
			im.add(m);
		}
		return im;
	}

	/** Constructors */

	public MenuLinksController() {
		// TODO Auto-generated constructor stub
	}

}
