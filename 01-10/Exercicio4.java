package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4{
		
		public static void main (String[] args) {
					
			Scanner leia = new Scanner (System.in);
			
			int a, b,c;
			double r, s, d;
			
			System.out.println("Digite o valor de A: ");
			a = leia.nextInt();
			
			System.out.println("Digite o valor de B: ");
			b = leia.nextInt();
			
			System.out.println("Digite o valor de C: ");
			c = leia.nextInt();
			
			r = (a+b) * (a+b);
			System.out.println("O valor de R é: " + r);

			s = (b+c) * (b+c);
			System.out.println("\nO valor de S é: " + s);

			d = (r + s) / 2;
			System.out.println("\nValor de D é: " + d);

			leia.close();
		}

	}