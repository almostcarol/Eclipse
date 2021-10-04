package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		num2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		num3 = leia.nextDouble();
		
		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			}
			
			else if (num1 < num3) {
					System.out.println(num1 + "\n" + num3 + "\n" + num2);
			} else {
					System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}
				
		}

		else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			} else {
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			}	
			
		} else {
				System.out.println(num3 + "\n" + num2 + "\n" + num1);
			}
			
		}
	}


