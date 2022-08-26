package view;

import controller.MergeSortBasic;

public class Teste {

	public static void main(String[] args) {
		MergeSortBasic teste = new MergeSortBasic();

		int vet[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		vet = teste.mergeSort(vet, 0, vet.length - 1);

		for (int cada : vet) {
			System.out.print(cada + ", ");
		}
	}

}
