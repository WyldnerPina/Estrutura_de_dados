package view;

import controller.MergeSortBasic;

public class Teste {

	public static void main(String[] args) {
		MergeSortBasic teste = new MergeSortBasic();

		int vet[] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};

		vet = teste.mergeSort(vet, 0, vet.length - 1);

		for (int cada : vet) {
			System.out.print(cada + ", ");
		}
	}

}
