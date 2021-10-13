package Exercicios;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaTodos t = new TestaTodos();
		
		t.AnimalFazSom(new Cavalo());
		t.AnimalFazSom(new Cachorro());
		t.AnimalFazSom(new Preguica());
	}

}
