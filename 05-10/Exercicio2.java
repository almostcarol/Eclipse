package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int numero = 0, impar= 0, par = 0, contagem = 1;
		
		for(contagem = 1; contagem <=10; contagem++) {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			if(numero%2==0) {
				par++;
			}
			else {
				impar++;
			}
			
		}
		
		System.out.println("Voc� digitou " + impar + " n�meros �mpares e " + par + " n�meros pares.");

	}

}
