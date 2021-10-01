package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner (System.in);
		
		int dias, meses,anos, idade;
		
		System.out.println("Digite sua idade, em anos: ");
		anos = leia.nextInt();
				
		System.out.println("Digite quantos meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = leia.nextInt();
	
		
		anos = anos * 365;
		meses = meses * 30;
		idade = anos + meses + dias;
		
		System.out.println("Sua idade em dias é igual a: " + idade + " dias");
		
		System.out.close();
				
		
	}

}
