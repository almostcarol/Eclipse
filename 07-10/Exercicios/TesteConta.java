package Exercicios;

public class TesteConta {
	
	public static void main(String[] args) {

	ContaBancaria c1 = new ContaBancaria();
	
	c1.setNumero("Número da conta: 50104637-9");
	System.out.println(c1.getNumero());
	
	c1.setBanco("Banco do Brasil");
	System.out.println(c1.getBanco());
	
	c1.setSaldo("Saldo: R$ 0,24");
	System.out.println(c1.getSaldo());
	
	
	}
	
}
