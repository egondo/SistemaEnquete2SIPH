package br.com.fiap.enquete.model;

import java.time.LocalDateTime;

public class Resposta {
	
	private String valor;
	private Pergunta pergunta;
	private LocalDateTime tempo;
	
	public Resposta() {
		this.tempo = LocalDateTime.now();
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Pergunta getPergunta() {
		return pergunta;
	}
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public LocalDateTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}
	
	

}
