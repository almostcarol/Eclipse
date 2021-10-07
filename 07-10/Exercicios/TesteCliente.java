package Exercicios;

public class TesteCliente {

	public static void main(String[] args) {

		cliente c1 = new cliente ();
		
		c1.setcpf ("CPF: xxx.xxx.xxx.xx");
		System.out.println(c1.getcpf());
	
		c1.setContato("Contato: 4002-8922");
		System.out.println(c1.getContato());
		
		c1.setEmail("Email: fulano@gmail.com");
		System.out.println(c1.getEmail());
	}

}
