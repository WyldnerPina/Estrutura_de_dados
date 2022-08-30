package view;

import Wyldner.BubbleSortTrigger;

public class Testando {

	public static void main(String[] args) {
		BubbleSortTrigger teste = new BubbleSortTrigger();
		int vet[] = {99, 98, 97, 96, 95, 94, 93, 92, 91};
		
		vet = teste.bubbleSort(vet);
		
		for(int cada : vet) {
			System.out.print(cada + ", ");
		}

	}

}
