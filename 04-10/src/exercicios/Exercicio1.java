package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3, maiorNum = 0;
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número:");
		num2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		num3 = leia.nextDouble();
		
		
		if (num1 > maiorNum) {
			maiorNum = num1;		
		}
		
		if (num2 > maiorNum) {
			maiorNum = num2;		
		}
		
		if (num3 > maiorNum){
			maiorNum = num3;
		}
		
	
		System.out.println("O maior número é igual a: " + maiorNum);

	}

}
