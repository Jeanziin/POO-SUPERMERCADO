package Atividade;

public class Carne extends Produto{
	private Integer proteina;

	public Carne(String nome, Double preço, String dataValidade, Integer proteina) {
		super(nome, preço, dataValidade);
		this.proteina = proteina;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto : Carne, Preço :"+getPreço()+"Data de Validade : "+getDataValidade()+", Proteína : "+proteina;
	}

	public Integer getProteina() {
		return proteina;
	}

	public void setProteina(Integer proteina) {
		this.proteina = proteina;
	}
	
	
}
