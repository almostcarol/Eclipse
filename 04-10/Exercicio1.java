package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3, maiorNum = 0;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo n�mero:");
		num2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro n�mero:");
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
		
	
		System.out.println("O maior n�mero � igual a: " + maiorNum);

	}

}
