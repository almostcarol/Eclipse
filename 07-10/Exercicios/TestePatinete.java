package Exercicios;

public class TestePatinete {

	public static void main(String[] args) {

		Patinete P1 = new Patinete();
		
		P1.setValor("Valor do patinete: R$200");
		System.out.println(P1.getValor());
		
		P1.setEstado("Usado");
		System.out.println(P1.getEstado());
		
		P1.setCor("Vermelho");
		System.out.println(P1.getCor());
	}

}
