package wyldnerPina_ListaObject;

public class Lista implements iLista {
	No primeiro;

	public Lista() {
		primeiro = null;
	}
//===================================================================================
	
	public boolean isEmpty() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

//===================================================================================
	public void addFirst(Object valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}
	
//===================================================================================	
	public void addLast(Object valor) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		//--------------------------------------------------
		int tamanho = size();

		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;

		No ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;
	}
	
//===================================================================================
	public void add(Object valor, int posicao) throws Exception {
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		//--------------------------------------------------
		No elemento = new No();
		elemento.dado = valor;
		
		if (posicao == 0) {
			addFirst(valor);
		} else if (posicao == tamanho - 1) {
			addLast(valor);
		} else {
			No anterior = getNo(posicao - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}
	
//===================================================================================
	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		//--------------------------------------------------
		primeiro = primeiro.proximo;
	}

//===================================================================================	
	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		//--------------------------------------------------
		int tamanho = size();
		No penultimo = getNo(tamanho - 2);
		penultimo.proximo = null;
	}

//===================================================================================	
	public void remove(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		//--------------------------------------------------
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posiçao invélida");
		}
		if (posicao == 0) {
			removeFirst();
		} else if (posicao == tamanho - 1) {
			removeLast();
		} else {
			No atual = getNo(posicao);
			No anterior = getNo(posicao - 1);
			anterior.proximo = atual.proximo;
		}
	}
	
//===================================================================================
	public Object get(int posicao) throws Exception {
		if (isEmpty()) {							
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		//--------------------------------------------------
		No auxiliar = primeiro;
		int cont = 0;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar.dado;
	}
	
//===================================================================================
	private No getNo(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		//--------------------------------------------------
		No auxiliar = primeiro;
		int cont = 0;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}
	
//===================================================================================	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = primeiro;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}
