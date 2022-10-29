package Atividade;

public class Shampoo extends Produto{
	private Integer irritabilidade;

	
	public Shampoo(String nome, Double preço, String dataValidade, Integer irritabilidade) {
		super(nome, preço, dataValidade);
		this.irritabilidade = irritabilidade;
	}


	public Integer getIrritabilidade() {
		return irritabilidade;
	}


	public void setIrritabilidade(Integer irritabilidade) {
		this.irritabilidade = irritabilidade;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto : Shampoo, Preço :"+getPreço()+"Data de Validade : "+getDataValidade()+", Irritabilidade: "+irritabilidade;
	}
		
	
}
