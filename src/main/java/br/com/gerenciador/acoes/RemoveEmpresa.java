package br.com.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;

public class RemoveEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		Banco banco = Banco.of();

		banco.removeEmpresa(Integer.valueOf(request.getParameter("id")));
		
		return "redirect:ListaEmpresas";

	}

	public static RemoveEmpresa of() {
		return new RemoveEmpresa();
	}

}
