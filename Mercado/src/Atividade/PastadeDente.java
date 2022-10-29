package Atividade;

public class PastadeDente extends Produto{
	private Integer brilho;

	public PastadeDente(String nome, Double preço, String dataValidade, Integer brilho) {
		super(nome, preço, dataValidade);
		this.brilho = brilho;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto : Pasta de Dente, Preço :"+getPreço()+"Data de Validade : "+getDataValidade()+", Brilho: "+brilho;
	}

	public Integer getBrilho() {
		return brilho;
	}

	public void setBrilho(Integer brilho) {
		this.brilho = brilho;
	}
	
	

}
