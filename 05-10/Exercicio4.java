package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int idade, ha = 0, oc = 0, vn = 0, jc = 0, contagem = 0;
		int genero = 0, humor = 0, calmo = 0, mn = 0;
		
		while (contagem < 6) {
			
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Informe seu g�nero: [1] Maculino [2] Feminino [3] Outros");
		genero = leia.nextInt();

		
		System.out.println("Voc� se considera uma pessoa: [1] Calma [2] Nervosa [3] Agressiva");
		humor = leia.nextInt();

		if ( humor == 1) {
			calmo++;
		}
		
		if ( genero == 2 && humor == 2) {
			mn++;
		}
		
		if (genero == 1 && humor == 3) {
			ha++;
		}
		
		if (genero == 3 && humor == 1) {
			oc++;
		}
		
		if (humor == 2 && idade > 40) {
			vn++;
		}
		
		if (humor == 1 && idade < 18) {
			jc++;
		}
		contagem++;

		}

		System.out.println("O n�mero de pessoas camlmas � igual a: " + calmo);
		System.out.println("O n�mero de mulheres nervosas � igual a: " + mn);
		System.out.println("O n�mero de homens agressivos � igual a: " + ha);
		System.out.println("O n�mero de outros calmos � igual a: " + oc);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � igual a: " + vn);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos � igual a: " + calmo);



	
		
	}

}
