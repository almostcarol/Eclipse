package Exercicios;

public class TesteAviao {

	public static void main(String[] args) {

		aviao a1 = new aviao ();
		
		a1.setModelo("Boeing 767");
		System.out.println(a1.getModelo());
		
		a1.setCompanhia("LATAM");
		System.out.println(a1.getCompanhia());
		
		a1.setCor("Branco");
		System.out.println(a1.getCor());
		
	}

}
