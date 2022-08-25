package controller;

public class Nivel2 {
	public Nivel2() {
		super();
	}

//=============================== MAIN N2 =================================
//=========================================================================
	public void mainNivel2() {
		int n;

		// 4 até 10 = 6 números (incluso 4 e 10)
		n = 4;
		int n2 = 10;
		n = f_0(n, n2);
		System.out.println("Qntidade de nºs entre: " + n);

		// 4 + 5 + 6 + 7 + 8 + 9 + 10
		n = 4;
		int n_2 = 10;
		n = f_1(n, n_2);
		System.out.println("Soma intervalo: " + n);

		// 4 6 8 10 = 4
		n = 4;
		int n_3 = 10;
		n = f_2(n, n_3);
		System.out.println("Soma pares: " + n);

		// v[4]= 0 1 2 3
		n = 4;
		int v[] = new int[n];
		v = f_3(v, n);
		System.out.println("Vetor");
		for (int i = 0; i < n; i++) {
			System.out.print(v[i] + ", ");
		}
//		vetor do tipo FOREACH
		System.out.println("");
		for (int c : v) {
			System.out.print(c + ", ");
		}

		// v[4] = 3 2 1 0
		int ct = 0;
		v = f_4(v, n, ct);
		System.out.println("\nVetor inverso");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + ", ");
		}
//		vetor do tipo FOREACH
		System.out.println("");
		for (int c : v) {
			System.out.print(c + ", ");
		}
		
		System.out.println("");
	}

//=============================== INTERVALO ===============================
//=========================================================================
	public int f_0(int n, int n2) {
		if (n >= n2) {
			return 0;
		}
		return 1 + f_0(n + 1, n2);
	}

// ============================ SOMA INTERVALO =============================
// =========================================================================
	public int f_1(int n, int n_2) {
		if (n >= n_2) {
			return n;
		}
		return n + f_1(n + 1, n_2);
	}

// ============================ QNTOS NºS PARES ============================
// =========================================================================
	public int f_2(int n, int n2) {
		if (n >= n2) {
			return 1;
		} else {
			if (n % 2 == 0) {
				return 1 + f_2(n + 1, n2);
			} else {
				return 0 + f_2(n + 1, n2);
			}
		}
	}

// ================================ VETOR ==================================
// =========================================================================
	public int[] f_3(int v[], int n) {
		if (n == 0) {
			v[n] = 0;
			return v;
		}
		n--;
		v[n] = n;
		return f_3(v, n);
	}

// ============================= VETOR INVERSO =============================
// =========================================================================
	public int[] f_4(int v[], int n, int ct) {
		if (ct == v.length) {
			v[n] = ct - 1;// = 3 2 1 0 // ct = 4 3 2 1
			return v;
		}
		n--;
		// ct++; //4 3 2 1
		v[n] = ct;
		ct++; // 3 2 1 0
		return f_4(v, n, ct);
	}
}