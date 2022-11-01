package controller;

import wylPina.QuickSortBasic;
import wyldnerPina_ListaInt.Lista;

public class Exerc02Controller {
	public Exerc02Controller() {
		super();
	}
	
	public void ordena(Lista lista) throws Exception {
		QuickSortBasic qs = new QuickSortBasic();
		int tam = lista.size();
		System.out.println("tamanho" + tam);
		int[]aux = new int[tam];		
		
		//------------------------------------------------------------------------
		for(int i = 0; i < tam; i++) {			
			aux[i] = lista.get(i);			
		}		
		aux = qs.quickSort(aux, 0, aux.length - 1);
		
		//------------------------------------------------------------------------
		Lista lista2 = new Lista();
		for(int i = 0; i < tam; i++) {
			if(i == 0) {
				lista2.addFirst(aux[i]);				
			}else {
				lista2.addLast(aux[i]);
			}			
		}
		
		//------------------------------------------------------------------------
		for(int i = 0; i < tam; i++) {
			System.out.println(lista2.get(i));
		}		
	}
}