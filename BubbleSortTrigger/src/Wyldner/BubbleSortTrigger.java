package Wyldner;

public class BubbleSortTrigger {
	public BubbleSortTrigger() {
		super();
	}
	
	public int[] bubbleSort(int[] vet) {
		int tamanho = vet.length, cont = 0, trigger = 1;
		
		while(cont < tamanho && trigger > 0) {
			trigger = 0;
			for(int i = 0; i < tamanho - 1; i++) {
				if(vet[i]>vet[i + 1]) {
					int aux = vet[i];
					vet[i] = vet[i + 1];
					vet[i + 1] = aux;
					trigger++;
				}
			}
			cont++;
		}
		return vet;
	}
}
