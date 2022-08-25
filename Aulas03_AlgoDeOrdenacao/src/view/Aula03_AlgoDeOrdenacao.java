package view;

import controller.AlgoController;

public class Aula03_AlgoDeOrdenacao {

	public static void main(String[] args) {
		AlgoController algo = new AlgoController();
		int num[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
// ================================== BUBLE SORT ======================================
// ====================================================================================			
		num = algo.bubleSort(num);
		System.out.println("O resultado eh: " + num);
		System.out.println("===========================================================");

// ================================== MERGE SORT ======================================
// ====================================================================================			
		num = algo.mergeSort(num);
		System.out.println("O resultado eh: " + num);
		System.out.println("===========================================================");


// ================================== QUICK SORT ======================================
// ====================================================================================			
		num = algo.quickSort(num);
		System.out.println("O resultado eh: " + num);
		System.out.println("===========================================================");
	}

}
