package viewer;

import controller.RecursividadeController;

public class ExercicioRecursividade {

	public static void main(String[] args) {
		RecursividadeController rec = new RecursividadeController();
		
		// EXERCÍCIO FATORIAL
		int fat;
		fat = 6;
		fat = rec.RecursividadeFatorial(fat);
		System.out.println("Fatorial: " + fat);
		System.out.println("===========================================================");
		
		int c = 0;
		int v[] = {0, -4, -3, 9, -5, 8, 1, 2, -7, -10};
		int s[] = new int[1];
		c = rec.vetorNegativo(c, v, s);
		System.out.println("Negativos: " + s[0]);
		System.out.println("===========================================================");
		
		String saco = "saquitu";
		saco = rec.inverteCaracter(saco, saco.length() - 1);
		System.out.println(saco);		
	}
}
