package controller;

public class MergeSortBasic {
	public MergeSortBasic() {
		super();		
	}
		
// ============================================================================================	
// ============================================================================================	
	public int[] mergeSort(int[] vet, int inicio, int fim) {		
		System.out.println("vetor da posição " +  inicio + " até " + fim);
		
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vet, inicio, meio); // dividindo do inicio ao meio
			mergeSort(vet, meio + 1, fim); // do meio ao fim
			
			intercala(vet, inicio, meio, fim);// vai para o intercala			
		}		
		return vet;
	}
	
// ============================================================================================	
// ============================================================================================	
	private void intercala(int[] vet, int inicio, int meio, int fim) {
		int[] vetAux = new int[vet.length]; // vetor aux para ajudar nas trocas de posições 
		// tamanho igual, mas vai mexer apenas nas posições q chegarem pra juntar
		
		// aqui garante q o auxiliar só tenha valores nas posições dos q chegaram pra juntar
		for(int i = inicio; inicio <= fim; i++) {
			vetAux[i] = vet[i];
		}
		
		// aqui são os controles ("ponteiros") q vão limitar o campo de atuação
		int esq = inicio; 
		int dir = meio + 1;
		
		// usa-se um contador, "c", pra passar as pocições do inicio ao fim
		// e verificar as condições
		for(int c = inicio; c <= fim; c++) {
			if(esq > meio) {
				vet[c] = vetAux[dir];
				dir++;
			} else if(dir > fim) {
				vet[c] = vetAux[esq];
				esq++;
			} else if(vetAux[esq] < vetAux[dir]) {
				vet[c] = vetAux[esq];
				esq++;				
			} else {
				vet[c] = vetAux[dir];
				dir++;
			}
		}		
	}
}
