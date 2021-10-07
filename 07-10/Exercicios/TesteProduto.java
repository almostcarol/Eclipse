package Exercicios;

public class TesteProduto {

	public static void main(String[] args) {

		ProdutoEletronico P1 = new ProdutoEletronico ();
		
		P1.setVoltagem("Voltagem: Bivolt");
		System.out.println(P1.getVoltagem());
		
		P1.setConsumoo("Consumo: 60 kWh");
		System.out.println(P1.getConsumoo());
		
		P1.setOrigem("Made in: China");
		System.out.println(P1.getOrigem());
		
		P1.setCor("Cor: Preto");
		System.out.println(P1.getCor());
	}

}
