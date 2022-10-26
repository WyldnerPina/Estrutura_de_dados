package model;

public class SetLista implements iSetLista {
	No primeiro;

	public SetLista() {
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
	public void addFirst(int valor) {
		if (isEqual(valor)) {
			System.out.println("valor já se encontra na lista");// tbm quis só colocar um aviso se já tem, mas poderia ser direto com !isEqual
		} else {												// só deixei assim para ser mais fácil de enteder 
			No elemento = new No();
			elemento.dado = valor;
			elemento.proximo = primeiro;
			primeiro = elemento;
		}
	}

//===================================================================================	
	public void addLast(int valor) throws Exception {
		if (isEmpty()) {// poderia chamar o último no, mas é conceitual o erro por isso aqui
			throw new Exception("Lista Vazia");
		}
		// --------------------------------------------------
		if (isEqual(valor)) {
			System.out.println("valor já se encontra na lista");
		} else {
			int tamanho = size();

			No elemento = new No();
			elemento.dado = valor;
			elemento.proximo = null;

			No ultimo = getNo(tamanho - 1);
			ultimo.proximo = elemento;
		}
	}

//===================================================================================
	public void add(int valor, int posicao) throws Exception {
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		// --------------------------------------------------
		if (isEqual(valor)) {
			System.out.println("valor já se encontra na lista");
		} else {
			No elemento = new No();
			elemento.dado = valor;

			if (posicao == 0) {
				addFirst(valor);// se a posição de inserir for a primeira
			} else if (posicao == tamanho - 1) {
				addLast(valor);// se for a última
			} else {// se em qq lugar
				No anterior = getNo(posicao - 1);
				elemento.proximo = anterior.proximo;
				anterior.proximo = elemento;
			}
		}
	}

//===================================================================================
	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		// --------------------------------------------------
		primeiro = primeiro.proximo;
	}

//===================================================================================	
	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		// --------------------------------------------------
		int tamanho = size();
		No penultimo = getNo(tamanho - 2);
		penultimo.proximo = null;
	}

//===================================================================================	
	public void remove(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		// --------------------------------------------------
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
	public int get(int posicao) throws Exception {// retorna o valor do dado q posição digitada. não tira elemento pra
													// acessar valor
		if (isEmpty()) { // não é destrutiva
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		// --------------------------------------------------
		No auxiliar = primeiro;
		int cont = 0;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar.dado;
	}

//===================================================================================
	private No getNo(int posicao) throws Exception {// é um método auxiliar, por isso private; é só pra ajudar outros
													// méts
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		// --------------------------------------------------
		No auxiliar = primeiro;
		int cont = 0;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}

// ===================================================================================
	public boolean isEqual(int valor) {// não lancei exceção pq eu queria q o código continuasse. 
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = primeiro;
			while (auxiliar != null) {
				if (auxiliar.dado == valor) {
					cont++;
				}
				auxiliar = auxiliar.proximo;
			}
		}
		// --------------------------------------------------
		if (cont > 0) {
			return true;
		} else {
			return false;
		}
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
