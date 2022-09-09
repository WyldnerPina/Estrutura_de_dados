package model;

public class PilhaString {
	Node topo;

	public PilhaString() {
		topo = null;
	}

	// ====================================================================================================
	// ====================================================================================================
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}

// ====================================================================================================
// ====================================================================================================
	public void push(String e) {
		Node elemento = new Node();
		elemento.dado = e;
		
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}

// ====================================================================================================
// ====================================================================================================
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("não há elementos para desempilhar");
		}

		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

// ====================================================================================================
// ====================================================================================================
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("não há elementos na pilha");
		}
		String valor = topo.dado;
		return valor;
	}

// ====================================================================================================
// ====================================================================================================
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			Node auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}

}
