package br.com.gerenciador.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		listaEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return listaEmpresas;
	}

	public static Banco of() {
		return new Banco();
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = listaEmpresas.iterator();

		while (it.hasNext()) {

			Empresa empresa = it.next();

			if (empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresa(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public void editaEmpresa(String nome, LocalDate dataAbertura, Integer id) {

		Empresa empresa = buscaEmpresa(id);

		empresa.setNome(nome);
		empresa.setDataAbertura(dataAbertura);

	}
}
