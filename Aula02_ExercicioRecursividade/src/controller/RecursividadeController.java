package controller;

public class RecursividadeController {
	public RecursividadeController() {
		super();
	}

// ================================= EXERCÍCIO 1 ======================================
// ====================================================================================
	public int Exerc01Somatorio(int num) {
		// pega o número menos seu anterior, vai "descendo" até ser igual a 0,
		// onde retorna os valores e soma com seu sucessor, até q a função possa
		// retornar o valor para a principal. Ex: recebe 4
		// giro 1 → 4 + f(4 - 1), retorna para principal = 4 + 6 = 10
		// giro 2 → 3 + f(3 - 1), retorna = 3 + 3 = 6
		// giro 3 → 2 + f(2 - 1), retorna = 2 + 1 = 3
		// giro 4 → 1 + f(1 - 1), retorna = 1 + 0 = 1
		// giro 5 → 0, retorna = 0
		// a condição de parada é zero para pegar todos os números até o digitado
		// e pra zero e números negativos o retorno é zero
		if (num <= 0) {
			return 0;
		} else {
			num = num + Exerc01Somatorio(num - 1);
			return num;
		}
	}

// ================================= EXERCÍCIO 2 ======================================
// ====================================================================================
	public int Exerc02Binario(int num) {
		if (num == 0) {// ser igual a zero pq vai somar com o resto do último número
			// se retornar um valor diferente ele sobe uma casa decimal à toa.
			return num;

		} else {
			num = (num % 2) + (10 * Exerc02Binario(num / 2));
			// tenho q somar o resto q é o número zero ou um
			// com o outro binário anterior, mas como preciso ajustar a casa decimal eu
			// multiplico dez
			// assim o retorno anterior passa a vir na decimal da frente e vou ajustando a
			// conversão
			return num;
			// Ex: recebe 7
			// giro 1 → (7%2=1) + (10*f(7/2=3)), retorna para principal = 1 + 110 = 111
			// giro 1 → (3%2=1) + (10*f(3/2=1)), retorna = 1 + 10 = 11
			// giro 2 → (1%2=1) + (10*f(1/2=0,5)), retorna = 1 + 0 = 1 obs→ como se trata só
			// de int o 0,5 = 0, msma coisa no 1%2 o resto =1
			// giro 3 → 0, retorna = 0
		}
	}

// ================================= EXERCÍCIO 3 ======================================
// ====================================================================================
	public double Exerc03SomatorioMenor(double num) {
		if (num <= 0) {// condição igual do exercício 1. retorna zero, pois é necessário
			return 0;// ir subindo a contagem dos números. (e daria div por zero)
		} else {
			num = Exerc03SomatorioMenor(num - 1) + (1 / num);
			return num;
			// Ex: recebe 4
			// giro 1 → f(3) + 1/4, retorna para principal = 1,83... + 0,25 = 2,083...
			// giro 2 → f(2) + 1/3, retorna = 1,5 + 1/3 = 1,83...
			// giro 3 → f(1) + 1/2, retorna = 1 + 1/2 = 1,5
			// giro 4 → f(0) + 1/1, retorna = 0 + 1 = 1
			// giro 5 → 0, retorna = 0
		}
	}
	
	public int Exerc04ContaNum(int num, int igual, int[] soma) {
		if(num < 10) {
			return 10;
		}		
		num = num%10 + 0*Exerc04ContaNum(num/10, igual, soma);
		if(num == igual ) {
			soma[0] = soma[0] + 1;
		}		
		return num;
	}
	
	public int Exerc05Fibonacci(int num) {
		if (num == 0 || num == 1 ) {
			return num;
		}		     
		    return Exerc05Fibonacci(num - 1) + Exerc05Fibonacci(num - 2);
	}
	
	public double Exerc06SomaDivFat(double num) {
		if (num <= 0) {
			return 0;
		} else {
			num = Exerc03SomatorioMenor(num - 1) + (1 / Fatorial(num));
			return num;			
		}
	}
	
	public double Fatorial(double num){
		if (num <= 1) {
			return 1;
		} 			
		return num * Fatorial(num - 1);		
	}
}
