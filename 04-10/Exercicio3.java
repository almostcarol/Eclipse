package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a, b, c, idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("Categoria Infantil");
		}
		
		else if (idade >= 15 && idade <=17) {
			System.out.println("Categoria Juvenil");
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulto");
		}
		
		else {
			System.out.println("Idade inválida, tente novamente...");
		}
	}

}
