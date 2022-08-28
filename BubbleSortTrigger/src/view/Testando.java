package view;

import Wyldner.BubbleSortTrigger;

public class Testando {

	public static void main(String[] args) {
		BubbleSortTrigger teste = new BubbleSortTrigger();
		int vet[] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		vet = teste.bubbleSort(vet);
		
		for(int cada : vet) {
			System.out.print(cada + ", ");
		}

	}

}
