package PossoDoar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		 Declara��o de objetos

		Doador d = new Doador();
		Feminino fm = new Feminino();
		Masculino mc = new Masculino();
		Vacina vac = new Vacina();
		
		
//		 Chamada dos m�todos
		
		d.nome();
		d.sangue();
		d.idade();
		
//		Bifurca��o Idade
		
		if(d.getIdade() >= 16 && d.getIdade() <= 17) {
			d.idade16();
		}
		if(d.getIdade() >= 18 && d.getIdade() <=69) {
			d.sexo();
		}
		if(d.getIdade() < 16 || d.getIdade() > 69) {
			JOptionPane.showMessageDialog(null, "Que pena, voc� n�o pode doar =/", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}

		
//		Bifurca��o Sexo
	
		if(d.getSexo() == 1) {
			mc.funcMasc();
		}
		if(d.getSexo() == 2) {
			fm.funcFem();
		}
	
//		Bifurca��o Vacina
		
		d.funcVacina();
		
		if(d.getVacina() == 1) {
			vac.funcButantan();
		}
		if(d.getVacina() == 2) {
			d.funcTransfusao();
		}
		
//		Dados e encerramento do programa
			
			JOptionPane.showMessageDialog(null, "Nome: " + d.getNome() + 
	                "\nIdade: " + d.getIdade() +
	                "\nTipo de sangue: " + d.getSangue() +
	                "\n===========================================" +
	                "\n                         Voc� pode doar!!              " +
	                "\n       Encontre o posto de coleta mais pr�ximo!!      " +
	                "\n============================================" 
	                );

			
	}
}
