package ExerciciosVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double media = 0, soma = 0;
		int [] numero = new int [10];
		int  maiorNumero = 0, quantasVezes = 0;
		
		for(int cont = 0; cont < numero.length; cont++) {
			System.out.println("Insira o " + (cont + 1) + "� lan�amento: ");
			numero[cont] = leia.nextInt();
			
			while(numero[cont] < 1  || numero [cont] > 6) {
				System.out.println("N�mero inv�lido!");
				numero[cont] = leia.nextInt();
			}
			
			if(numero[cont] > maiorNumero) {
				maiorNumero = numero[cont];
				quantasVezes=1;		
			}
			
			else if(numero[cont] == maiorNumero) {
				quantasVezes++;
			}
			
			soma = soma + numero[cont];
			media = soma/10;
		}
		
		System.out.println("A m�dia dos valores lan�ados � igual a: " + media);
		System.out.println("\nO maior n�mero lan�ado foi: " + maiorNumero + " e esse n�mero apareceu " + quantasVezes +" vezes.");

	}

}
