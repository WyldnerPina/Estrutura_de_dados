package view;

import javax.swing.JOptionPane;

import controller.Exerc03Controller;
import wyldnerPina_ListaInt.Lista;

public class Main {

	public static void main(String[] args) {
		Exerc03Controller exerc = new Exerc03Controller();
		int cont = 0;
		
		Lista lista = new Lista();
		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
			
			try {
				if(lista.size() == 0 || pos - 1 == 0) {
					lista.addFirst(num);
				}else if(lista.size() <= pos){
					lista.addLast(num);					
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
		
		Lista lista2 = new Lista();
		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
			
			try {
				if(lista2.size() == 0 || pos - 1 == 0) {
					lista2.addFirst(num);					
				}else if(lista2.size() <= pos){
					lista2.addLast(num);					
				}else {
					lista2.add(num, pos-1);
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
			exerc.ordena(lista, lista2);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}