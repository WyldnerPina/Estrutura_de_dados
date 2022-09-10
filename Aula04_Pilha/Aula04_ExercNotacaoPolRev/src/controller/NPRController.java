package controller;

import javax.swing.JOptionPane;

import wyldnerPina_PilhaInt.PilhaInt;

public class NPRController {
	PilhaInt p = new PilhaInt();
	
	public void insereValor(int valor) {		
		p.push(valor);
	}
	
//=====================================================================================
	public boolean isVazio() {
		if(p.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public int topo() throws Exception {
		int topo;
		topo = p.top();
		return topo;
	}
	
	public int tam() {
		int tam;
		tam = p.size();
		return tam;
	}
	
//=====================================================================================
	public void npr(String op) {
		int resultado = 0;
		int n1 = 0, n2 = 0;
		n2 = numPop(n2);
		System.out.println("n2 " + n2);
		n1 = numPop(n1);
		System.out.println("n1 " + n1);
		
		switch (op) {
		case "+":
			resultado = n1 + n2;
			break;
		case "-":
			resultado = n1 - n2;
			break;
		case "*":
			resultado = n1 * n2;
			break;
		case "/":
			resultado = n1 / n2;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operação inválida");
		}
		System.out.println(n1 + op + n2 + " = " + resultado);
		p.push(resultado);
	}
	
//=====================================================================================	
	public int numPop(int n) {
		try {
			n = p.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("pop de n " + n);
		return n;
	}
}
