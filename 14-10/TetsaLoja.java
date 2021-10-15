package Exercicio;

import java.util.ArrayList;

public class TetsaLoja {

	public static void main(String[] args) {

		Loja l1 = new Loja (50, "Branca");
		Loja l2 = new Loja (20, "Preta");
		Loja l3 = new Loja (70, "Vermelha");
		Loja l4 = new Loja (15, "Cinza");
		
		ArrayList <Loja> lojas = new ArrayList<>();
		
		lojas.add(l1);
		lojas.add(l2);
		lojas.add(l3);
		lojas.add(l4);
		
		lojas.remove(2);
		
		for(Loja i : lojas) {
			System.out.println(i);
		}
	}

}
