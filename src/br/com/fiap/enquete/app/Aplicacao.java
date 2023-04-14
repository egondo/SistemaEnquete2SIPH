package br.com.fiap.enquete.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

import br.com.fiap.enquete.model.Enquete;
import br.com.fiap.enquete.model.ItemResposta;
import br.com.fiap.enquete.model.Pergunta;
import br.com.fiap.enquete.model.Resposta;

public class Aplicacao {
	
	public static void gravaRespostas(Resposta[] respostas, String path) 
			throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		for(int i = 0; i < respostas.length; i++) {
			Resposta r = respostas[i];
			if (r != null) {
				bw.write(r.getPergunta().getQuestao());
				bw.write(";");
				bw.write(r.getValor());
				bw.write(";");
				bw.write(r.getTempo().toString());
				bw.write("\n");				
			}			
		}
		bw.close();
	}

	public static void main(String[] args) {
		
		Enquete e = new Enquete();
		e.setTitulo("Mobilidade Urbana");
		e.setCriacao(LocalDate.now());
		
		Pergunta um = new Pergunta("Email:", "ABERTA");
		Pergunta dois = new Pergunta("Idade:", "ABERTA");
		Pergunta tres = new Pergunta("Genero:", "UNICA");
		tres.addItemResposta(new ItemResposta("Masculino", 1));
		tres.addItemResposta(new ItemResposta("Feminino", 2));
		tres.setDica("Informe M ou F");
		
		String q = "Quanto tempo em media voce passa no transporte?";
		Pergunta quatro = new Pergunta(q, "ABERTA");
		quatro.setDica("Por dia e em minutos");
		
		q = "Qual o meio de transporte mais utilizado durante a semana?";
		Pergunta cinco = new Pergunta(q, "MULTIPLA");
		cinco.addItemResposta(new ItemResposta("Metro/trem", 1));
		cinco.addItemResposta(new ItemResposta("Onibus", 2));
		cinco.addItemResposta(new ItemResposta("Carro", 3));
		cinco.addItemResposta(new ItemResposta("Bike", 4));
		cinco.addItemResposta(new ItemResposta("Outros", 5));
		cinco.setDica("Indique uma ou mais opcoes separadas por virgula");
		
		q = "Qual o meio de transporte mais utilizado no fim de semana?";
		Pergunta seis = new Pergunta(q, "MULTIPLA");
		seis.addItemResposta(new ItemResposta("Metro/trem", 1));
		seis.addItemResposta(new ItemResposta("Onibus", 2));
		seis.addItemResposta(new ItemResposta("Carro", 3));
		seis.addItemResposta(new ItemResposta("Bike", 4));
		seis.addItemResposta(new ItemResposta("Outros", 5));
		seis.setDica("Indique uma ou mais opcoes separadas por virgula");

		e.addPergunta(um);
		e.addPergunta(dois);
		e.addPergunta(tres);
		e.addPergunta(quatro);
		e.addPergunta(cinco);
		e.addPergunta(seis);
		
		
		//Imprimindo informações da enquente
		System.out.println("Enquete: " + e.getTitulo());
		Pergunta[] questions = e.getPerguntas();
		Resposta[] respostas = new Resposta[questions.length];
		
		Scanner tec = new Scanner(System.in);
		String resp = "";
		ItemResposta[] itens = null;
		String aux = "";
		
		int i = 0;
		Resposta answer = null;
		
		for(Pergunta p : questions) {
			if (p != null) {
				
				System.out.println(p.getQuestao());
				if (p.getDica() != null) {
					System.out.println(p.getDica());
				}
				//System.out.println(p.getDica() == null ? "" : p.getDica());
				
				switch (p.getTipo()) {
				case "ABERTA":
					resp = tec.nextLine();
					break;
				case "UNICA":
					itens = p.getItens();
					for(ItemResposta ir : itens) {
						if (ir != null) {
							aux = ir.getOrdem() + ") " + ir.getDescricao();
							System.out.println(aux);
						}
					}
					resp = tec.nextLine();
					break;
				case "MULTIPLA":
					itens = p.getItens();
					for(ItemResposta ir : itens) {
						if (ir != null) {
							aux = ir.getOrdem() + ") " + ir.getDescricao();
							System.out.println(aux);
						}
					}
					resp = tec.nextLine();
					break;
				default:
					break;
				}
				answer = new Resposta();
				answer.setValor(resp);
				answer.setPergunta(p);
				respostas[i] = answer;
				i++;
			}			
		}
		try {
			gravaRespostas(respostas, "D:\\resp.txt");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}














