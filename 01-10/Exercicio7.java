package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio7{
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, d, e, f, x, y;
		
		System.out.println("Digite um valor para a: ");
		a = leia.nextInt();
		
		System.out.println("Digite um valor para b: ");
		b = leia.nextInt();
		
		System.out.println("Digite um valor para c: ");
		c = leia.nextInt();
		
		System.out.println("Digite um valor para d: ");
		d = leia.nextInt();
		
		System.out.println("Digite um valor para e: ");
		e = leia.nextInt();
		
		System.out.println("Digite um valor para f: ");
		f = leia.nextInt();

		x = (c*e)-(b*f)/(a*e)-(b*d);
		y= (a*f) - (c*d)/ (a*e) - (b*d);
		
		System.out.println("O valor de x é igual a: " + x + "\nO valor de y é igual a: " + y);
		
		leia.close();

	}
}
	
