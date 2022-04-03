package br.com.gerenciador.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;

@WebServlet("/editaEmpresa")
public class EditaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = -6306437968876644662L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = Banco.of();

		banco.editaEmpresa(request.getParameter("nome"), LocalDate.parse(request.getParameter("dataAbertura")),
				Integer.parseInt(request.getParameter("id")));

		response.sendRedirect("listaEmpresas");

	}

}
