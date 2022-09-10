package view;

import javax.swing.JOptionPane;

import controller.NPRController;

public class Main {

	public static void main(String[] args) {		
		NPRController nprc = new NPRController();
		boolean ctrl = true;
//=========================================================================================================
		while(ctrl) {
			String digitado = JOptionPane.showInputDialog("insira um número");
			if(digitado.contains("+") || digitado.contains("-") || digitado.contains("*") || digitado.contains("/")){
				nprc.npr(digitado, 10, 2);
				ctrl = false;
			}else {
				nprc.insereValor(Integer.parseInt(digitado));				
			}						
		}
//=========================================================================================================
	}

}
