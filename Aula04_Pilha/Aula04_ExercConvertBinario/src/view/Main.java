package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

//import wyldnerPina_PilhaInt.PilhaInt;

public class Main {

	public static void main(String[] args) {
//		PilhaInt p = new PilhaInt();
		
		ConverteController c = new ConverteController();
		
		int num = 0;
		
//==============================================================================================
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		}while(num<0 || num>1000);		
		c.decToBin(num);
	}


}
