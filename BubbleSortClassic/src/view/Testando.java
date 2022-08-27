package view;

import controller.BubbleSortClassic;

public class Testando {

	public static void main(String[] args) {
		BubbleSortClassic teste = new BubbleSortClassic();
		int vet[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		vet = teste.bubbleSort(vet);
		
		for(int cada : vet) {
			System.out.print(cada + ", ");
		}
	}

}
