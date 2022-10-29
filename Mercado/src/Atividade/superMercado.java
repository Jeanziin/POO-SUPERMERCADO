package Atividade;

import java.util.ArrayList;
import java.util.List;

public class superMercado {
	public static void main(String[] args) {
		Calcular cal = new Calcular();
		List<Shampoo> shampoo = new ArrayList<>();
		shampoo.add(new Shampoo("Dove", 15.0, "02/02/2022", 5));
		shampoo.add(new Shampoo("Jhonsons", 20.0, "11/09/2021", 3));
		shampoo.add(new Shampoo("CLEAR", 25.0, "10/10/2021", 4));
		shampoo.add(new Shampoo("Brilho", 10.0, "03/04/2022", 5 ));
		shampoo.add(new Shampoo("Fortaleza", 15.0, "15/04/2022", 7 ));
		System.out.println("----Shampoo----");
		System.out.println("Média: "+cal.media(shampoo));
		System.out.println("Mais Caro: "+cal.maisCaro(shampoo));
		System.out.println("Mais Barato: "+cal.maisBarato(shampoo));
		System.out.println("--------");
		
		
		List<Biscoito>  biscoito = new ArrayList<>();
		biscoito.add(new Biscoito("Oreo", 10.0, "05/04/2024", 7));
		biscoito.add(new Biscoito("Toddy", 15.0, "02/04/2024", 8));
		biscoito.add(new Biscoito("Nescau", 20.0, "09/04/2024", 5));
		biscoito.add(new Biscoito("PassaTempo", 25.0, "08/04/2024", 3));
		biscoito.add(new Biscoito("Negresco", 30.0, "06/04/2024", 9));
		biscoito.add(new Biscoito("Coringão", 35.0, "07/04/2024", 2));
		System.out.println("----Biscoito----");
		System.out.println("Média: "+cal.media(biscoito));
		System.out.println("Mais Caro: "+cal.maisCaro(biscoito));
		System.out.println("Mais Barato: "+cal.maisBarato(biscoito));
		System.out.println("--------")
		;
		List<Leite> Leite = new ArrayList<>();
		Leite.add(new Leite("Mimosa", 8.0, "10/11/2021", 1));
		Leite.add(new Leite("Itambé", 9.0, "10/12/2021", 10));
		Leite.add(new Leite("Piracanjuba", 10.0, "10/9/2021", 3));
		Leite.add(new Leite("Campos do Jordão", 11.0, "10/07/2021", 4));
		Leite.add(new Leite("Elegé", 13.0, "10/05/2021", 6));
		System.out.println("----Leite----");
		System.out.println("Média: "+cal.media(Leite));
		System.out.println("Mais Caro: "+cal.maisCaro(Leite));
		System.out.println("Mais Barato: "+cal.maisBarato(Leite));
		System.out.println("---------");
		
	}
}
