package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args)throws Exception {
		FatController fat = new FatController();
		long num = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 20"));
		}while(num>20 || num<0);
		
		num = fat.fatorial(num);
		System.out.println("O fatorial do número é: " + num);
	}

}
