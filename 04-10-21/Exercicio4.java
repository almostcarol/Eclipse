package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println( "O num�ro � par e sua raiz quadrada � igual a: " + Math.sqrt(numero));			
		}
		
		else {
			System.out.println("Esse � um n�mero �mpar e elevado ao quadrado � igual a: " + (numero * numero));
		}
		
	}

}
