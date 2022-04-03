package br.com.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Empresa;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

	private static final long serialVersionUID = -8555573686751010168L;

	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		Banco banco = Banco.of();

		List<Empresa> lista = banco.getEmpresas();

		req.setAttribute("empresas", lista);

		req.getRequestDispatcher("/listaEmpresas.jsp").forward(req, rep);

	}

}
