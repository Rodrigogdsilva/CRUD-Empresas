package br.com.gerenciador.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 4525847512361505733L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Cadastrando nova empresa");

		Empresa empresa = Empresa.of();

		empresa.setNome(request.getParameter("nome"));

		empresa.setDataAbertura(LocalDate.parse(request.getParameter("dataAbertura")));

		Banco banco = Banco.of();

		banco.adiciona(empresa);

		response.sendRedirect("listaEmpresas");
	}

}
