package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.acoes.Acao;

public class ControllerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String parametroAcao = request.getParameter("acao");
		String form;
		
		try {
			Class classe = Class.forName("br.com.gerenciador.acoes." + parametroAcao);
			Acao acao = (Acao) classe.newInstance();
			form = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] tipo = form.split(":");

		if (tipo[0].equals("forward")) {
			request.getRequestDispatcher("WEB-INF/view/" + tipo[1]).forward(request, response);
		} else {
			response.sendRedirect("entrada?acao=" + tipo[1]);
		}
	}

}
