package Exercicio;

public class Loja {

	private int camisas;
	private String cor;
	
	
	
	public Loja(int camisas, String cor) {
		super();
		this.camisas = camisas;
		this.cor = cor;
	}



	public int getCamisas() {
		return camisas;
	}



	public void setCamisas(int camisas) {
		this.camisas = camisas;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}


	public String toString () {
		return "Camisas: " + this.camisas + " na cor " + this.cor;
	}
	
}