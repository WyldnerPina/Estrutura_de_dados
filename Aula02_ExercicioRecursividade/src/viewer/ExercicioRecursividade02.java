package viewer;

import controller.RecursividadeController;

public class ExercicioRecursividade02 {

	public static void main(String[] args) {
		RecursividadeController rec = new RecursividadeController();		
		int num = 4, result;
		double r;		
		

		result = rec.Exerc01Somatorio(num);
		System.out.println("O resultado da somatoria eh: " + result);
		System.out.println("===========================================================");
		
		result = rec.Exerc02Binario(num);
		System.out.println("O numero em binario fica: " + result);
		System.out.println("===========================================================");
		
		r = rec.Exerc03SomatorioMenor(num);
		System.out.println("O resultado da soma eh: " + r);
		System.out.println("===========================================================");

	}

}
