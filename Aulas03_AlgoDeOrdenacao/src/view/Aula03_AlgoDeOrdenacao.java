package view;

import controller.AlgoController;

public class Aula03_AlgoDeOrdenacao {

	public static void main(String[] args) {
		AlgoController algo = new AlgoController();
		
		int vet[] = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		
// ================================== BUBLE SORT ======================================
// ====================================================================================			
		vet = algo.bubleSort(vet);
		System.out.println("Bubble sort: ");
		for(int cada : vet) {
			System.out.print(cada + ", ");
		}
		System.out.println("\n===========================================================");

// ================================== MERGE SORT ======================================
// ====================================================================================
		int vet2[] = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		vet2 = algo.mergeSortBasic(vet2);
		System.out.println("Merge sort: ");
		for(int cada : vet2) {
			System.out.print(cada + ", ");
		}
		System.out.println("\n===========================================================");


// ================================== QUICK SORT ======================================
// ====================================================================================	
//		vet = algo.quickSort(vet);
//		System.out.println("O resultado eh: ");
//		for(int cada : vet) {
//			System.out.print(cada + ", ");
//		}
//		System.out.println("\n===========================================================");
	}

}
