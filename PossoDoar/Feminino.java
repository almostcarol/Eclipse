package PossoDoar;

import javax.swing.JOptionPane;

public class Feminino extends Doador{
	
	public void funcFem(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Doou sangue nos ultimos 90 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� doou sangue nos ultimos 90 dias.Ent�o n�o esta apto a doar ainda ...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcGravida();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}		
	}
	
	public void funcGravida(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� est� gr�vida?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� est� gr�vida.N�o esta apto a doar ainda...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcParto();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	public void funcParto(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� realizou parto normal nos �ltimos 90 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� realizou parto normal nos �ltimos 90 dias.Ent�o n�o esta apto a doar ainda...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcCesariana();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}		
	}
	
	public void funcCesariana(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� realizou parto por cesariana nos �ltimos 180 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� realizou parto por cesariana nos �ltimos 180 dias.Ent�o n�o esta apto a doar...Tente doar ap�s os 180 dias", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcAmamentar();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcAmamentar(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� est� ou esteve amamentando no �ltimo ano?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� est� ou esteve amamentando no �ltimo ano.Ent�o esta apto a doar...Tente doar ap�s 1 ano do fim da amamenta��o", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			func50();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}		
}