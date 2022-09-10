package controller;

import wyldnerPina_PilhaInt.PilhaInt;

public class ConverteController {

	public ConverteController() {
		super();
	}

	public void decToBin(int decimal) {
		PilhaInt p = new PilhaInt();
//==============================================================================================		
		if (decimal == 0) {
			p.push(decimal);
		}

// ==============================================================================================
		while (decimal > 0) {
			p.push(decimal % 2);
			decimal = decimal / 2;
		}

// ==============================================================================================
		StringBuffer bufado = new StringBuffer();
		while (!p.isEmpty()) {
			try {
				bufado.append(Integer.toString(p.pop()));				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Seu em binário: " + bufado);
	}

}
