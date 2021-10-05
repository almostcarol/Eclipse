package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		
		Scanner  leia = new Scanner (System.in);
		
		int idade, menor = 0, maior = 0;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		
		while (idade != -99) {
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
	
			if (idade <= 21) {
				menor++;			
			}
			
			if (idade >= 50) {
				maior++;
			}
		}
			System.out.println("A quantia de pessoas com 21 anos ou menos é de: " + menor + "\n" + "A quantia de pessoas com 50 anos ou mais é de: " + maior);
	}

}
