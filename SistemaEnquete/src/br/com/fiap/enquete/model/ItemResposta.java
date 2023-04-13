package br.com.fiap.enquete.model;

public class ItemResposta {
	
	private long id;
	private String descricao;
	private int ordem;

	public ItemResposta(String descricao, int ordem) {
		this.descricao = descricao;
		this.ordem = ordem;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getOrdem() {
		return ordem;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
}
