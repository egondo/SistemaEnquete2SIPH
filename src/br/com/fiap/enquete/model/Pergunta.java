package br.com.fiap.enquete.model;

public class Pergunta {
	
	private long id;
	private String questao;
	private String tipo;
	private String dica;

	private ItemResposta[] itens;

	public Pergunta(String questao, String tipo) {
		this.questao = questao;
		this.tipo = tipo;
		if (!tipo.equals("ABERTA"))
			this.itens = new ItemResposta[5];			
	}
	
	public void addItemResposta(ItemResposta ir) {
		int i = 0;
		while (i < itens.length && itens[i] != null) {
			i++;
		}
		
		if (i == itens.length) {
			System.out.println("Overflow! Não tem espaco");
		}
		else {
			itens[i] = ir;
		}
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ItemResposta[] getItens() {
		return itens;
	}

	public void setItens(ItemResposta[] itens) {
		this.itens = itens;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	
	

}
