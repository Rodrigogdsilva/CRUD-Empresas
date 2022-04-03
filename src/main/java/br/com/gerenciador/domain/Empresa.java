package br.com.gerenciador.domain;

import java.time.LocalDate;

public class Empresa {

	@Override
	public String toString() {
		return nome;
	}

	private Integer id;
	private String nome;
	private LocalDate dataAbertura = LocalDate.now();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Empresa of() {
		return new Empresa();
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
