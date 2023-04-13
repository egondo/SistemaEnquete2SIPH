package br.com.fiap.enquete.model;

import java.time.LocalDate;

public class Enquete {
	
	private long id;
	
	private String titulo;
	
	private LocalDate criacao;
	
	private Pergunta[] perguntas;
	
	private int topo;
	
	public Enquete() {
		this.perguntas = new Pergunta[20];
		this.topo = 0;
	}

	public void addPergunta(Pergunta p) {
		this.perguntas[topo] = p;
		topo++;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getCriacao() {
		return criacao;
	}

	public void setCriacao(LocalDate criacao) {
		this.criacao = criacao;
	}

	public Pergunta[] getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(Pergunta[] perguntas) {
		this.perguntas = perguntas;
	}

	
}
