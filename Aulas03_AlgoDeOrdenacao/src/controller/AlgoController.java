package controller;

import wyldner.BubbleSortClassic;
import wyldner.MergeSortBasic;



public class AlgoController {
	public AlgoController() {
		super();
	}

// ================================== BUBLE SORT ======================================
// ====================================================================================	
	public int[] bubleSort(int[] vet) {
		BubbleSortClassic bs = new BubbleSortClassic();
		bs.bubbleSortClassic(vet);
		return vet;
	}

// ================================== MERGE SORT ======================================
// ====================================================================================	
	public int[] mergeSortBasic(int[] vet) {
		MergeSortBasic ms = new MergeSortBasic();
		int tam = vet.length;
		ms.mergeSort(vet, 0, tam);
		return vet;
	}

// ================================== QUICK SORT ======================================
// ====================================================================================	
//	public int[] quickSort(int[] vet) {
//
//		return vet;
//	}
}
