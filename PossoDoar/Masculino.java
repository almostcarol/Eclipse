package PossoDoar;

import javax.swing.JOptionPane;

public class Masculino extends Doador{
	
	public void funcMasc(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Doou sangue nos ultimos 60 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� doou sangue nos ultimos 60 dias.Ent�o n�o est� apto a doar.Tente doar ap�s os 60 dias", "AVISO", JOptionPane.INFORMATION_MESSAGE);
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
