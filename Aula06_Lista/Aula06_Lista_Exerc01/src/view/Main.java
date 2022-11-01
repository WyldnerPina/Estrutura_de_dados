package view;

import javax.swing.JOptionPane;

import controller.Exerc01Controller;
import model.Pessoas;
import wyldnerPina_ListaObject.Lista;

public class Main {

	public static void main(String[] args) {
		Exerc01Controller exerc = new Exerc01Controller();
		Lista lista = new Lista();		
		int cont = 0;
		
		//---------------------------------------------------------------------------------------
		do {
			Pessoas p = new Pessoas();
			p.nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
			p.email = JOptionPane.showInputDialog("Digite seu email");
			p.telefone = JOptionPane.showInputDialog("Digite seu telefone");
			
			try {
				if(cont == 0) {
					lista.addFirst(p);
					cont++;
				}else {
					lista.addLast(p);	
				}							
			} catch (Exception e) {				
				e.printStackTrace();
			}
			do {
				cont = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar\n 1-Sim 2-Não"));
			}while(cont < 1 || cont > 2);						
		}while(cont != 2);
		
		//---------------------------------------------------------------------------------------
		try {
			exerc.percorrer(lista);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
