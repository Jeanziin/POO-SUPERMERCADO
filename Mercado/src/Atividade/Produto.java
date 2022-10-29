package Atividade;

public abstract class Produto {
	
	private String nome;
	private Double preço;
	private String dataValidade;
	
	public Produto(String nome, Double preço, String dataValidade) {
		this.nome = nome;
		this.preço = preço;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public  abstract String toString();
	

}
