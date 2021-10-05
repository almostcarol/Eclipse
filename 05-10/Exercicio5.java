package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int num = 1, soma = 0;
		
		do {
		System.out.println("Digite um número inteiro de 0 a 9: ");
		num = leia.nextInt();
		
		soma = soma + num;
		
		}
		
		while (num != 0);
		
		System.out.println("A soma dos números inseridos é igual: " + soma);
		
	}

}
