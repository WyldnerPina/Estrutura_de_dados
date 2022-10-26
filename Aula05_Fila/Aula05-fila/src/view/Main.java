package view;

import model.FilaInt;

public class Main {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		
		fila.insert(1);
		fila.insert(2);
		fila.insert(3);
		fila.insert(4);
		fila.insert(5);
		fila.insert(6);
		
		
		fila.size();
		
		
		try {
			int dado = fila.remove();
			System.out.println(dado + " ==> removido");
			
			fila.list();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		int tamano = fila.size();
		System.out.println(tamano + " ==> Tamanho");
		
		System.out.println(fila.toString());

	}

}
