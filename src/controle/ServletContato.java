package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Contato;

@WebServlet({ "/cadastrar", "/excluir", "/buscar" })
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<Contato> listaContatos = new ArrayList<Contato>();
	
	public ServletContato() {
		super();
	}

	// Requisi��es via "M�todo GET", ser�o tratadas pelo m�todo doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getServletPath().equals("/buscar")) {
			buscar(request, response);
		} else if (request.getServletPath().equals("/excluir")) {
			excluir(request, response);
		} else {
			response.sendRedirect("404.jsp");
		}
	}

	// Requisi��es via "M�todo POST", ser�o tratadas pelo m�todo doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// cria��o da instancia
		Contato contato = new Contato();

		// atribui��o dos valores ao objeto
		contato.setId(new Long(new Random().nextInt(100)));
		contato.setNome(request.getParameter("nome"));
		contato.setEmail(request.getParameter("email"));
		contato.setTelefone(request.getParameter("telefone"));

		// tratei a requisi��o adicionando o objeto
		request.setAttribute("contato", contato);

		// vamos encaminhar a requisi��o a quem de direito (contatos.jsp)
		request.getRequestDispatcher("contato.jsp").forward(request, response);
	}
	
	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		listaContatos.add(new Contato());
		listaContatos.get(0).setId(new Long(new Random().nextInt(100)));
		listaContatos.get(0).setNome("Luis");
		listaContatos.get(0).setEmail("prof.lpjunior@gmail.com");
		listaContatos.get(0).setTelefone("(21) 99927-5383");

		listaContatos.add(new Contato());
		listaContatos.get(1).setId(new Long(new Random().nextInt(100)));
		listaContatos.get(1).setNome("Paulo");
		listaContatos.get(1).setEmail("paulo@gmail.com");
		listaContatos.get(1).setTelefone("(21) 98745-6321");

		listaContatos.add(new Contato());
		listaContatos.get(2).setId(new Long(new Random().nextInt(100)));
		listaContatos.get(2).setNome("Jo�o");
		listaContatos.get(2).setEmail("joao@gmail.com");
		listaContatos.get(2).setTelefone("(21) 2633-1485");

		request.setAttribute("contatos", listaContatos);
		request.getRequestDispatcher("contatos.jsp").forward(request, response);
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		listaContatos.remove(id);

		request.setAttribute("contatos", listaContatos);
		request.getRequestDispatcher("contatos.jsp").forward(request, response);
	}
}
