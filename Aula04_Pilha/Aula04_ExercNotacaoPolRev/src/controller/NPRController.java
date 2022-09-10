package controller;

import javax.swing.JOptionPane;

import wyldnerPina_PilhaInt.PilhaInt;

public class NPRController {
	PilhaInt p = new PilhaInt();
	
	public void insereValor(int valor) {		
		p.push(valor);
	}

	public int npr(String op, int n1, int n2) {
		int resultado = 0;
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
		return resultado;
	}
}
