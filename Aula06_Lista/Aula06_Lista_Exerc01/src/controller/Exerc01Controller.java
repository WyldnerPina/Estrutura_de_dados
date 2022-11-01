package controller;

import wyldnerPina_ListaObject.Lista;

public class Exerc01Controller {

	public Exerc01Controller() {
		super();
	}	
	
	public void percorrer(Lista lista) throws Exception {
		int cont = 0;
		int teste = lista.size();
		while (cont < teste) {
			Object aux = lista.get(cont);		
			System.out.println(aux);			
			cont++;
		}
	}

}
