package br.com.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Empresa;

public class MostraEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = Banco.of();

		Empresa empresa = banco.buscaEmpresa(Integer.valueOf(request.getParameter("id")));

		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";

	}

	public static MostraEmpresa of() {
		return new MostraEmpresa();
	}

}
