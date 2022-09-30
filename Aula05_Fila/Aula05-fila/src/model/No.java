package model;

public class No {
	// Object dado; // se eu quiser fazer com objeto;
	int dado;
	No proximo;

	// aparece o dado no outline, e no sistem out print de elemento
	public String toString() {
		return String.valueOf("Dado: " + dado);
	}
}
