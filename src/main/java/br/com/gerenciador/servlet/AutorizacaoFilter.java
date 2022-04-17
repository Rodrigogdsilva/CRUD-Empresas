package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AutorizacaoFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = -4427312502781464482L;

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String parametroAcao = request.getParameter("acao");

		HttpSession session = request.getSession();

		boolean usuarioNaoAutenticado = (session.getAttribute("usuarioLogado") == null);
		boolean acaoProtegida = !(parametroAcao.equals("Login") || parametroAcao.equals("FormLogin"));

		if (usuarioNaoAutenticado && acaoProtegida) {
			response.sendRedirect("entrada?acao=FormLogin");
			return;
		}

		chain.doFilter(servletRequest, servletResponse);
	}

}
