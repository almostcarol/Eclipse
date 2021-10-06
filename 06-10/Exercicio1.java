package ExerciciosVetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int [] notas = new int [5];
		int i, maiorNota = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua nota: ");
		
		for(i = 0; i < notas.length; i++) {
			notas [i] = leia.nextInt();

			if(notas[i] > maiorNota) {
				maiorNota= notas[i];
			}
		}
		
		System.out.println("A maior nota é igual a: " + maiorNota);
	}

}
