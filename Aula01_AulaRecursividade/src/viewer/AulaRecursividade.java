package viewer;

import java.util.Scanner;

import controller.RecursividadeController;

public class AulaRecursividade {

	public static void main(String[] args) {
		RecursividadeController rec = new RecursividadeController();
		Scanner ler = new Scanner(System.in);
		int opc; 
		int retorno = 1;

		do {			
			System.out.println(""
					+ "+-------------------------------------------+\n"
					+ "|        AULA 1 - RECURSIVIDADE             |\n"
					+ "|   Escolha uma opção para mostrar códigos  |\n"
					+ "|   1 - Exemplos Divisao                    |\n"
					+ "|   2 - Exercicio Potencia                  |\n"
					+ "|   3 - Exercicios Soma Vetor               |\n"
					+ "|   9 - Sair                                |\n"
					+ "+-------------------------------------------+\n");
			opc = ler.nextInt();		
			
			switch (opc) {
			case 1: // EXEMPLO 1
				int divisao;
				divisao = rec.divisao(27, 3);
				System.out.println("O resultado eh: " + divisao);
				System.out.println("===========================================================");				
				System.exit(0);
				break;
				
//=====================================================================================================
//=====================================================================================================
			case 2: // EXEMPLO 2
				int potencia;
				potencia = rec.potencia(2, 3);
				System.out.println("O resultado eh: " + potencia);
				System.out.println("===========================================================");
				System.exit(0);
				break;
				
//=====================================================================================================
//=====================================================================================================
			case 3: // TAREFA 01 - exercicios 1 e 3
				// EXEMPLO 3
				int TAM = 10, somaTotal;
				int somaVet[] = new int[TAM];
				somaTotal = rec.soma(somaVet, TAM);
				System.out.println("O resultado eh: " + somaTotal);
				System.out.println("===========================================================");
				retorno = continuar(retorno);
//				opc = continuar(apoio);
//				System.exit(0);
				break;				
//=====================================================================================================
//=====================================================================================================
			case 9:
				System.out.println("Thanks!!");
				break;
				
//=====================================================================================================
//=====================================================================================================
			default:
				System.out.println("Pfv, só os numeros indicados");
			}
		} while (opc != 9 || retorno != 2);
		ler.close();
	}

	private static int continuar(int retorno) {
		Scanner l = new Scanner(System.in);
		do {
			System.out.println("Deseja continuar? \ny = 1\nn = 2");
			retorno = l.nextInt();

		}while(retorno < 1  || retorno > 2);
		
//		while(!retorno.equals("y") || !retorno.equals("n")
		
		l.close();
		return retorno;		
	}

}
