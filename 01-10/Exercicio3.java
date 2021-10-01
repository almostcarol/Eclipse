package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {

		public static void main (String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int segundos, minutos, horas;
			
			System.out.println("Digite a duração do evento em segundos: ");
			segundos = leia.nextInt();
			
			
			horas = segundos / 3600;
			minutos = (segundos%3600) / 60;
			segundos = (segundos%3600) % 60;
			
			System.out.println("O evento durou " + horas + " hora(s), "  + minutos + " minutos e " + segundos + " segundos.");
			
			System.out.close();


			
				
	
			
		}
}
