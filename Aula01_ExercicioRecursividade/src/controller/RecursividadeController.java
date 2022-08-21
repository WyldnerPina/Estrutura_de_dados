package controller;

public class RecursividadeController {
	public RecursividadeController() {
		super();
	}

// ============================= EXERCÍCIO FATORIAL ===================================
// ====================================================================================
	public int RecursividadeFatorial(int num) {
		int fat = 1;

		if (num <= 1) {
			return 1;
		} else {
			fat = num * RecursividadeFatorial(num - 1);
			return fat; // poderia ter retornado num se num fosse resultado.
			// tiratia a var EX: num = num * RecursividadeFatorial(num - 1);
		}
	}
}
