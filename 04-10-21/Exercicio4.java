package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println( "O numéro é par e sua raiz quadrada é igual a: " + Math.sqrt(numero));			
		}
		
		else {
			System.out.println("Esse é um número ímpar e elevado ao quadrado é igual a: " + (numero * numero));
		}
		
	}

}
