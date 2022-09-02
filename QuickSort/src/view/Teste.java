package view;

import controller.QuickSort;

public class Teste {

	public static void main(String[] args) {
		int[] vet = {9, 5, 2, 3, 0, 4, 7, 8, 1, 6};
		QuickSort qs = new QuickSort();
		vet = qs.quickSort(vet, 0, vet.length - 1);
		
		for(int v : vet) {
			System.out.print(v + " ");
		}
		

	}

}
