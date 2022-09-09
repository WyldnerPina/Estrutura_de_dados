package view;

import javax.swing.JOptionPane;

import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		PilhaString pilha = new PilhaString();
		String a = JOptionPane.showInputDialog("insira algo na pilha");
		pilha.push(a);
//===============================================================================================		
		try {
			String top = pilha.top();
			System.out.println("topo: " + top);
		} catch (Exception e) {			
			e.printStackTrace();
		}
//===============================================================================================		
	    try {
			String pop = pilha.pop();
			System.out.println("pop: " + pop);
		} catch (Exception e) {		
			e.printStackTrace();
		}
//===============================================================================================
	    boolean vazia = pilha.isEmpty();
		System.out.println(vazia);
	}

}
