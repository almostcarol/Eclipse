package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		int peso1, peso2, peso3;
		double nota1, nota2, nota3, media,pesos;
		
		System.out.println("Digite a primieira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextInt();
		
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		
		pesos = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
		media = pesos/(peso1+ peso2 + peso3);
		
		System.out.println("Média é de: " + media);
		
		leia.close();
		
	}
	

}
