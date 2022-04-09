package br.com.gerenciador.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Empresa;

public class ListaEmpresas implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		Banco banco = Banco.of();

		List<Empresa> lista = banco.getEmpresas();

		request.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";

	}

	public static ListaEmpresas of() {
		return new ListaEmpresas();
	}

}
