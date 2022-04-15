package br.com.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.domain.Banco;
import br.com.gerenciador.domain.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Banco banco = Banco.of();

		Usuario user = banco.verificaUsuario(login, senha);

		if (user != null) {
			return "redirect:ListaEmpresas";
		} else {
			return "redirect:FormLogin";
		}

	}

	public static Login of() {
		return new Login();
	}

}
