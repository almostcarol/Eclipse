package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica, custoFinal, imposto, distribuidor;
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = leia.nextInt();
		
		custoFinal = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		
		System.out.println("O valor do carro para o consumidor será de R$" + custoFinal);
		
		leia.close();

	}
}
