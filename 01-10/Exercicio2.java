package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.println("Digite quantos dias já viveu: ");
		totalDias = leia.nextInt();
		
		anos = totalDias / 365;
		
		meses= (totalDias%365) / 30;
		
		dias = (totalDias%365)%30;
		
		System.out.println("Você já viveu: " + anos +" anos");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		System.out.close();
		
				
	
		
	}

}
