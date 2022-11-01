package view;

import javax.swing.JOptionPane;

import controller.Exerc02Controller;
import wyldnerPina_ListaInt.Lista;

public class Main {
	public static void main(String[] args) {		
		Exerc02Controller exerc = new Exerc02Controller();
		int cont = 0;
		
		Lista lista = new Lista();
		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
			
			try {
				if(lista.size() == 0 || pos - 1 == 0) {// ninguém usa posição 0
					lista.addFirst(num);
					System.out.println("primeiro");
				}else if(lista.size() <= pos){
					lista.addLast(num);
					System.out.println("ultimo");
				}else {
					lista.add(num, pos-1);
				}				
			} catch (Exception e) {				
				e.printStackTrace();
			}

			do {
				cont = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar\n 1-Sim 2-Não"));
			} while (cont < 1 || cont > 2);
		} while (cont != 2);
		
		//-----------------------------------------------------------------------------------------------
		try {
			exerc.ordena(lista);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}