package exercicios;

public class TestaTdodos {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro ();
		Cavalo c2 = new Cavalo();
		Preguica p1 = new Preguica();
		
		c1.setNome("Zoé");
		c1.setIdade(1);
		c1.setSom("Sim");
		c1.setCorre("Sim");
		
		c2.setNome("Blue Jeans");
		c2.setIdade(5);
		c2.setSom("Sim");
		c2.setCorre("Sim");
		
		p1.setNome("Geraldo");
		p1.setIdade(5);
		p1.setSom("Sim");
		p1.setSobe("Sim");
		
		System.out.println("*** Cachorro ***");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Emite som: " + c1.getSom());
		System.out.println("Corre: " + c1.getCorre());
		
		System.out.println();
		
		System.out.println("*** Cavalo ***");
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Idade: " + c2.getIdade());
		System.out.println("Emite som: " + c2.getSom());
		System.out.println("Corre: " + c2.getCorre());
		
		System.out.println();
		
		System.out.println("*** Preguiça ***");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Emite som: " + p1.getSom());
		System.out.println("Sobe em árvores: " + p1.getSobe());
		
		System.out.println();
		
	}

}
