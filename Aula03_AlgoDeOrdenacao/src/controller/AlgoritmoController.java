package controller;

import wylPina.QuickSortBasic;
import wyldner.BubbleSortClassic;
import wyldnerPina.MergeSortBasic;

public class AlgoritmoController {
	public AlgoritmoController() {
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
		int tam = vet.length - 1;
		ms.mergeSortBasic(vet, 0, tam);
		return vet;
	}

// ================================== QUICK SORT ======================================
// ====================================================================================	
	public int[] quickSort(int[] vet) {
		QuickSortBasic qs = new QuickSortBasic();
		int tam = vet.length - 1;
		qs.quickSort(vet, 0, tam);
		return vet;
	}

}
