package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;

@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = -8819866417132957535L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = Banco.of();

		banco.removeEmpresa(Integer.valueOf(request.getParameter("id")));

		response.sendRedirect("listaEmpresas");

	}
}
