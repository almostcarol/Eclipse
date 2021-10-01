package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		double  x1 = 0, y1 = 0, x2 = 0, y2 = 0, d;
		
		System.out.println("Digite o valor de x no ponto 1: ");
		x1 = leia.nextInt();
		
		System.out.println("Digite o valor de y no ponto 1: ");
		y1 = leia.nextInt();
		
		System.out.println("Digite o valor de x no ponto 2: ");
		x2 = leia.nextInt();
		
		System.out.println("Digite o valor de y no ponto 2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("A distância entre o ponto 1 e 2 é de " + d);
		
		leia.close();
		
	}
 }