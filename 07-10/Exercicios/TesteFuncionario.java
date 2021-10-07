package Exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario ();
		
		f1.setFuncao("Cargo: Dev Júnior");
		System.out.println(f1.getFuncao());
		
		f1.setPeriodo("Período: Tarde");
		System.out.println(f1.getPeriodo());
		
		f1.setRegistro("Registro: 6969/9");
		System.out.println(f1.getRegistro());
		
		f1.setAno("Ano de contratação: 2021");
		System.out.println(f1.getAno());
		
	}

}
