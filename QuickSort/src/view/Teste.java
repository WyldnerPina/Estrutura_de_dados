package view;

import controller.QuickSort;

public class Teste {

	public static void main(String[] args) {
		int[] vet = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		QuickSort qs = new QuickSort();
		vet = qs.quickSort(vet, 0, vet.length - 1);
		
		for(int v : vet) {
			System.out.print(v + ", ");
		}
		

	}

}
