package br.com.gerenciador.acoes;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Empresa;

public class NovaEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		System.out.println("Cadastrando nova empresa");

		Empresa empresa = Empresa.of();

		empresa.setNome(request.getParameter("nome"));

		empresa.setDataAbertura(LocalDate.parse(request.getParameter("dataAbertura")));

		Banco banco = Banco.of();

		banco.adiciona(empresa);
		
		return "redirect:ListaEmpresas";

	}

	public static NovaEmpresa of() {
		return new NovaEmpresa();
	}

}
