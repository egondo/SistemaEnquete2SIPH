package br.com.fiap.enquete.app;

import java.time.LocalDate;

import br.com.fiap.enquete.model.Enquete;
import br.com.fiap.enquete.model.ItemResposta;
import br.com.fiap.enquete.model.Pergunta;

public class Aplicacao {

	public static void main(String[] args) {
		
		Enquete e = new Enquete();
		e.setTitulo("Mobilidade Urbana");
		e.setCriacao(LocalDate.now());
		
		Pergunta um = new Pergunta("Email:", "ABERTA");
		Pergunta dois = new Pergunta("Idade:", "ABERTA");
		Pergunta tres = new Pergunta("Gênero:", "UNICA");
		tres.addItemResposta(new ItemResposta("Masculino", 1));
		tres.addItemResposta(new ItemResposta("Feminino", 2));
		
		String q = "Quanto tempo em média você passa no transporte?";
		Pergunta quatro = new Pergunta(q, "ABERTA");
		
		q = "Qual o meio de transporte mais utilizado durante a semana?";
		Pergunta cinco = new Pergunta(q, "MULTIPLA");
		cinco.addItemResposta(new ItemResposta("Metrô/trem", 1));
		cinco.addItemResposta(new ItemResposta("Ônibus", 2));
		cinco.addItemResposta(new ItemResposta("Carro", 3));
		cinco.addItemResposta(new ItemResposta("Bike", 4));
		cinco.addItemResposta(new ItemResposta("Outros", 5));
		
		q = "Qual o meio de transporte mais utilizado no fim de semana?";
		Pergunta seis = new Pergunta(q, "MULTIPLA");
		seis.addItemResposta(new ItemResposta("Metrô/trem", 1));
		seis.addItemResposta(new ItemResposta("Ônibus", 2));
		seis.addItemResposta(new ItemResposta("Carro", 3));
		seis.addItemResposta(new ItemResposta("Bike", 4));
		seis.addItemResposta(new ItemResposta("Outros", 5));

		e.addPergunta(um);
		e.addPergunta(dois);
		e.addPergunta(tres);
		e.addPergunta(quatro);
		e.addPergunta(cinco);
		e.addPergunta(seis);
	}

}
