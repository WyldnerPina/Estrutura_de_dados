package controller;

public class BubbleSortClassic {
	public BubbleSortClassic() {
		super();
	}
	
	public int[] bubbleSort(int[] vet) {
		int tamanho = vet.length;
		
		for(int j = 0; j < tamanho; j++) {
			for(int i = 0; i < tamanho - 1; i++) {
				if(vet[i]>vet[i + 1]) {
					int aux = vet[i];
					vet[i] = vet[i + 1];
					vet[i + 1] = aux;
				}
			}
		}
		return vet;
	}
}
