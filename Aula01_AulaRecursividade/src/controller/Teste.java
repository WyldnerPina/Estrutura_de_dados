package controller;

public class Teste {
	public Teste() {
		super();
	}
	
//	Scanner ler = new Scanner(System.in);
//	int opc; 
//	opc = ler.nextInt();
////	ler.next(); ou ler.nextLine();
//	ler.close();
//	
//	Console lendo = System.console();
//	String teste = "a";
//	
//	teste = lendo.readLine();
//	if (!teste.equals("a")) {// aqui é diferente para igual só tirar o "!"
//		
//	}
//	
//	System.out.printf("Igua no C %d", opc);
//	System.out.printf("Igua no C %.2f", opc);
//	System.out.printf("Igua no C %s", teste);

//================================= EXERCÍCIO 2 ======================================
//====================================================================================
//public int Exerc02Binario01(int num) {
//	int bin = 0;
//	String result;
//	
//	if(num == 1) {
//		result = Integer.toString(1);
//		System.out.print(result);
//		return 1;
//	}
//	else if(num == 0){			
//		result = Integer.toString(0);
//		System.out.print(result);
//		return 0;
//	}
//	else {
//		bin = Exerc02Binario01(num / 2);
//		result = Integer.toString(num % 2);
//		System.out.print(result);
//		return bin;
//	}		
//}


//
//================================= EXERCÍCIO 2 ======================================
//====================================================================================
//public int Exerc02Binario02(int num, int bin[], int tam, int cont) {
//	if (num < 2) {			
//		bin [tam -1] = num;
//		tam--;
//		System.out.print("....... " + bin [tam - cont]);
//		tam--;
//		return num;
//	} else {
//		cont ++;
//		num = (num % 2) + (2 * Exerc02Binario02(num/2, bin, tam, cont));
//		bin [tam - cont] = num % 2;
//		System.out.print(bin [tam - cont]);
//		return num;
//	}
//}
//



//================================= EXERCÍCIO 2 ======================================
//====================================================================================
//public int Exerc02Binario03(int num, int c, int tam) {
//	double result;
//
//	if (num < 2) {
//		c++;
//		System.out.print(num);			
//		return num;
//	} else {
//		c++;
//		num = (num % 2) + (2 * Exerc02Binario03(num/2, c, tam));
//		result = num % 2;
//		System.out.print(result);
//		return num;
//	}
//}
	





//public int [] Veto(int n, int v [], int taman) {
//	for(int j = 0; j < taman; j++) {
//		if(n>0) {
//			v[j] = Resto(n, 2);
//			System.out.print(v[j]);
//			n = n - 2;
//		}else {
//			v[j] = 0;
//			System.out.print(v[j]);
//		}
//	}
//	System.out.println("\n========================================");
//	return v;
//}
//
//	
//
//public int Resto(int n, int x) {
//	int r;
//	if(n < x) {
//		r = n;
//		return r;
//	}else {
//		r = Resto(x, n - x);
//		return r;
//	}
//



//public int Resto(int n, int c) {
//int c;
//	if(n <= 0) {	
//		return n;
//	} else {	
//	num = Math.pow(10, c)*(num % 2) + (binario(num/2, c);
//	c++;	
//	return num;
//	}
//
//}	 

//import java.io.Console.readLine();
//import java.io.Console;

//=====================================================================================================
//=====================================================================================================
//	public static boolean continuar(boolean r) {
//		String opc;
//		Console teclado = System.console();
//		do {
//			System.out.println("Deseja continuar? [y/n]");	
//			retorno = teclado.readLine();				
//			retorno = ler.next();
//		} while (retorno != "y" || retorno != "n");
//		return true;
//	}


//System.out.printf("retorno: %s", retorno);// string = C
//System.out.printf("entrou aqui %.1f\n");// declaração igual C
}
