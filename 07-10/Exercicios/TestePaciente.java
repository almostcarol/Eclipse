package Exercicios;

public class TestePaciente {

	public static void main(String[] args) {

		Paciente P1 = new Paciente ();
		
		P1.setNome("Nome: Paulo Passivo");
		System.out.println(P1.getNome());
		
		P1.setIdade("Idade: 21");
		System.out.println(P1.getIdade());
		
		P1.setSintomas("Sintomas: Febre e Tosse");
		System.out.println(P1.getSintomas());
		
	}

}
