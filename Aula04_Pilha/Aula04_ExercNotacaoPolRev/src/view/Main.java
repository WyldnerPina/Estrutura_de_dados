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
				if(nprc.tam() < 2) {
					System.err.println("TAMANHO INSUFICIENTE ");
				} else {
					try {
						nprc.npr(digitado);
						ctrl = false;
					}catch (NumberFormatException e) {
						e.printStackTrace();
					}					
				}				
			}else {
				nprc.insereValor(Integer.parseInt(digitado));				
			}						
		}
		
//=========================================================================================================		
		System.out.println("vazio: " + nprc.isVazio());		
		System.out.println("tamanho: " + nprc.tam());		
		try {
			System.out.println("topoo: " + nprc.topo());			
		} catch (Exception e) {			
			e.printStackTrace();
		}
//=========================================================================================================
	}
}
