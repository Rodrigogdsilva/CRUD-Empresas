package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Empresa;

@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 7522383252272894166L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = Banco.of();

		Empresa empresa = banco.buscaEmpresa(Integer.valueOf(request.getParameter("id")));

		request.setAttribute("empresa", empresa);

		request.getRequestDispatcher("/formAlteraEmpresa.jsp").forward(request, response);

	}

}
