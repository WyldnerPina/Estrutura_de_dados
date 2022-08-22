package controller;

public class RecursividadeController {
	public RecursividadeController() {
		super();
	}

// ============================= EXERCÍCIO FATORIAL ===================================
// ====================================================================================
	public int RecursividadeFatorial(int num) {
		if (num <= 1) {
			return 1;
		} else {
			num = num * RecursividadeFatorial(num - 1);
			return num; // poderia ter retornado num se num fosse resultado.
			// tiratia a var EX: num = num * RecursividadeFatorial(num - 1);
		}
	}
	
	public int vetorNegativo(int c, int[] v, int[] s) {
		if(c < v.length) {
			if(v[c]<0) {
				s[0] = s[0] + 1;
			}
			c++;
			vetorNegativo(c, v, s);
		}		
		return c;
	}
	
	public String inverteCaracter(String saco, int tam) {
		if(tam == 0) {
			return saco.charAt(0) + "";
		}
		char l = saco.charAt(tam);
		return l + inverteCaracter(saco, tam - 1);
	}	
}
