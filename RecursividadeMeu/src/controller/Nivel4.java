package controller;

public class Nivel4 {
	public Nivel4() {
		super();
	}

//=============================== MAIN N2 =================================
//=========================================================================
	public void mainNivel4() {
		int n = 8;
		int v[] = new int [n];
		
		
		// VETOR NÃO PRECISA DAR RETORNO
		for (int c : v) {
			System.out.print(c + ", ");
		}
		System.out.println();
		
		n = f_0(n, v);		

		for (int c : v) {
			System.out.print(c + ", ");
		}
		
		System.out.println("\n**********");
		int cnt = 0;
		int vt[] = new int [n];		
		n = f_1(n, vt, cnt);
		for (int c : vt) {
			System.out.print(c + ", ");
		}
		
	}

//============================ ESCALANDO SOMA =============================
//=========================================================================
	public int f_0(int n, int[] v) {
		if (n <= 1) {
			v[n] = n;
			return 0;
		}
		n--;
		v[n] = n;
		v[n] = f_0(n, v) + v[n - 1];
		return n;
	}
	
//============================ ESCALANDO SOMA =============================
//=========================================================================
		public int f_1(int n, int[] vt, int cnt) {
			if (cnt <= 1) {
				vt[cnt] = cnt;
				cnt++;
				return 0;
			}			
			vt[cnt] = vt[cnt - 1] + vt[cnt - 2]; 
			cnt++;			
			return n;
		}

}
