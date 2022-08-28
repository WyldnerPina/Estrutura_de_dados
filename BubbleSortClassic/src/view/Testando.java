package view;

import controller.BubbleSortClassic;

public class Testando {

	public static void main(String[] args) {
		BubbleSortClassic teste = new BubbleSortClassic();
		int vet[] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		vet = teste.bubbleSort(vet);
		
		for(int cada : vet) {
			System.out.print(cada + ", ");
		}
	}

}
