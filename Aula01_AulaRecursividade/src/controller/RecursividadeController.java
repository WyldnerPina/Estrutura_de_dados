package controller;

public class RecursividadeController {
	public RecursividadeController() {
		super();
	}

// ================================== EXEMPLO 1 =======================================
// ====================================================================================
	public int divisao(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return 0;// 0 ou 1
		} else {
			dividendo = dividendo - divisor;
			return 1 + divisao(dividendo, divisor);
		}
	}

// ================================== EXEMPLO 2 =======================================
// ====================================================================================
	public int potencia(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			return base * potencia(base, expoente - 1);
		}
	}
	
// ================================== EXEMPLO 3 =======================================
// ====================================================================================
	public int soma(int[] vetor, int tamanho) {
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			return valor + soma(vetor, ultimaPosicao);
		}
	}
}
