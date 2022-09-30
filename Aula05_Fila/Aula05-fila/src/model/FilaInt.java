package model;

public class FilaInt {
	No inicio;
	No fim;

//======================================================================================
	public FilaInt() {
		inicio = null;
		fim = null;
	}

//======================================================================================
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

//======================================================================================
	public void insert(int valor) {// (Object valor) -- para receber objeto
		No elemento = new No();
		elemento.dado = valor;

		if (inicio == null) {// teste de 1º dado
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else {
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
			} else {// a partir do 3º dado
				fim.proximo = elemento;
				elemento.proximo = null;// redundantemente didático
				fim = elemento;
			}
		}
	}

//======================================================================================
	public int remove() throws Exception {// int pq é de inteiros // para objeto public Object
		if (isEmpty()) {
			throw new Exception("Fila vazia!!");
		}

		No auxiliar = inicio;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		return auxiliar.dado;// aqui gera um problema e precisa tratar
	}

//======================================================================================
	public void list() throws Exception {// list e size não mudam para objetos
		if (isEmpty()) {
			throw new Exception("Fila vazia!!");
		}
		No auxiliar = inicio;
		while (auxiliar != null) {
			System.out.println(auxiliar);
			auxiliar = auxiliar.proximo;
		} // alt shift A = varias linhas escrevendo juntas
	}

//======================================================================================
	public int size() {
		int cont = 0;

		if (!isEmpty()) {
			No auxiliar = inicio;

			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

//======================================================================================
}
