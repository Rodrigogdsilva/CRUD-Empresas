package br.com.gerenciador.acoes;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;

public class EditaEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco banco = Banco.of();

		banco.editaEmpresa(request.getParameter("nome"), LocalDate.parse(request.getParameter("dataAbertura")),
				Integer.parseInt(request.getParameter("id")));

		return "redirect:entrada?acao=ListaEmpresas";

	}

	public static EditaEmpresa of() {
		return new EditaEmpresa();
	}

}
