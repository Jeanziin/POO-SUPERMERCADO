package Atividade;


import java.util.List;

public class Calcular {

	public double media(List<? extends Produto>list) {
		
		double soma=0;
		for (int i = 0; i <list.size(); i++) {
			soma += list.get(i).getPreço();
		}
		return soma/list.size();
	}
	
	public double maisCaro(List<? extends Produto>list) {
		double maisCaro = list.get(0).getPreço();
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getPreço()>maisCaro) {
				maisCaro = list.get(i).getPreço();
			}
		}
		return maisCaro;
	}
	
	public double maisBarato(List<? extends Produto>list) {
		double maisBarato = list.get(0).getPreço();
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getPreço()<maisBarato) {
				maisBarato=list.get(i).getPreço();
			}
		}
		return maisBarato;
	}
}
