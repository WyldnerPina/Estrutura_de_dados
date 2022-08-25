package controller;


public class Nivel1 {
	public Nivel1() {
		super();
	}
//=============================== MAIN N1 =================================
//=========================================================================	
	public void mainNivel1() {
		int n;

		// 4 = 1111
		String um = "1";
		n = 4;
		um = f0(n, um);
		System.out.println("Concatena: " + um);

		// 4 = 1234
		int cont = 0;
		n = 4;
		cont = f1(n, cont);
		System.out.println("Contando: " + cont);

		// n+(n-1)+...0
		n = 4;
		n = f2(n);
		System.out.println("Somatório de n: " + n);

		// 4 * 3
		n = 4;
		int m = 3;
		n = f3(n, m);
		System.out.println("multiplicacao: " + n);

		// 4^3
		n = 4;
		int p = 3;
		n = f4(n, p);
		System.out.println("potenciacao: " + n);

		// 4!
		n = 4;
		n = f5(n);
		System.out.println("Fatorial: " + n);	
		
	}

//============================== CONCATENA ================================
//=========================================================================
	public static String f0(int n, String um) {
		if (n <= 1) {
			return "1";
		}
		return um + f0(n - 1, um);
	}
////////////////////////////////////////////////////////////////////////////	

// ================================ CONTA ==================================
// =========================================================================
	public static int f1(int n, int c) {
		if (n <= 0) {
			return 0;
		}
		return f1(n - 1, c) +  1;
	}

//============================== SOMATÓRIO ================================
//=========================================================================
	public static int f2(int n) {
		if (n <= 0) {
			return 0;
		}
		return n + f2(n - 1);
	}

//============================ MULTIPLICAÇÃO ==============================
//=========================================================================
	public static int f3(int n, int m) {
		if (m <= 1) {
			return n;
		}
		return n + f3(n, m - 1);
	}

//============================= POTENCIAÇÃO ===============================
//=========================================================================
	public static int f4(int n, int p) {
		if (p <= 0) {
			return 1;
		}
		return n * f4(n, p - 1);
	}

// ============================== FATORIAL =================================
// =========================================================================
	public static int f5(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * f5(n - 1);
	}
}

