package viewer;

import controller.RecursividadeController;

public class ExercicioRecursividade {

	public static void main(String[] args) {
		RecursividadeController rec = new RecursividadeController();
		
		// EXERCÍCIO FATORIAL
		int fat;
		System.out.println("Digite um numero");
		fat = 6;
		fat = rec.RecursividadeFatorial(fat);
		System.out.println("O resultado eh: " + fat);
		System.out.println("===========================================================");
	}

}
