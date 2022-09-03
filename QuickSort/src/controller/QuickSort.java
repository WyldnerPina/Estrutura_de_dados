package controller;

public class QuickSort {
	public QuickSort() {
		super();
	}
	
// =======================================================================================================
// =======================================================================================================
	public int[] quickSort(int[] vet, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoFixa = dividir(vet, inicio, fim);
			quickSort(vet, inicio, posicaoFixa - 1);
			quickSort(vet, posicaoFixa + 1, fim);
		}
		return vet;
	}
	
// =======================================================================================================
// =======================================================================================================
	private int dividir(int[] vet, int inicio, int fim) {
		int pivo = vet[inicio];
		int ponteiroDir = fim;
		int ponteiroEsq = inicio + 1;

		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && vet[ponteiroEsq] <= pivo) {
				ponteiroEsq++;
			}
			while (ponteiroDir >= ponteiroEsq && vet[ponteiroDir] > pivo) {
				ponteiroDir--;
			}
			if (ponteiroEsq < ponteiroDir) {
				trocar(vet, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}						
		}
		trocar(vet, inicio, ponteiroDir);
		return ponteiroDir;
	}
	
// =======================================================================================================
// =======================================================================================================
	private void trocar(int vet[], int i, int j) {
		int aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}
}
