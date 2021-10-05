package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int num = 0, cont = 0, soma=0;
		double media;
		
		do {
		System.out.println("Digite um número inteiro: \n(Para sair digite 0)");
		num = leia.nextInt();
	
		if (num % 3 == 0) {
			cont++;
			soma = soma + num;

		}
		
		}
		
		while(num != 0);
		
		media = soma/cont;
		
		System.out.println(media);
		
	}
	

}
