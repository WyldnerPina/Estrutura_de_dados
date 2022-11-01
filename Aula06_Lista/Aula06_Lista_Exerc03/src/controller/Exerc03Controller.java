package controller;

import wylPina.QuickSortBasic;
import wyldnerPina_ListaInt.Lista;

public class Exerc03Controller {

	public Exerc03Controller() {
		super();
	}

	public void ordena(Lista lista, Lista lista2) throws Exception {
		QuickSortBasic qs = new QuickSortBasic();
		int tam = lista.size() + lista2.size();		
		int[] aux = new int[tam];

		// ------------------------------------------------------------------------
		for (int i = 0; i < tam; i++) {
			if (i < lista.size()) {
				aux[i] = lista.get(i);
			}else {
				aux[i] = lista2.get(i - lista.size());
			}			
		}
		
		aux = qs.quickSort(aux, 0, aux.length - 1);

		// ------------------------------------------------------------------------
		Lista listaAux = new Lista();
		for (int i = 0; i < tam; i++) {
			if (i == 0) {
				listaAux.addFirst(aux[i]);
			} else {
				listaAux.addLast(aux[i]);
			}
		}

		// ------------------------------------------------------------------------
		for (int i = 0; i < tam; i++) {
			System.out.println(listaAux.get(i));
		}

	}
}