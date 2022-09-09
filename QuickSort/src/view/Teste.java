package view;

import controller.QuickSort;

public class Teste {

	public static void main(String[] args) {
		int[] vet = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		QuickSort qs = new QuickSort();
		vet = qs.quickSort(vet, 0, vet.length - 1);
		
		for(int v : vet) {
			System.out.print(v + ", ");
		}
		

	}

}
