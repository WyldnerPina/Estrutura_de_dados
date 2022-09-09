package model;

public class PilhaInt {
	No topo; // parte mais importante da pilha

	public PilhaInt() {
		topo = null; // sempre q inicio pilha o topo é nulo
	}

//====================================================================================================
//====================================================================================================
	public boolean isEmpty() {// tudo o q é bool a gente usa "is" é padrão
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}

//====================================================================================================
//====================================================================================================
	public void push(int e) {// pra colocar em cima da pilha, inserir valor ao topo
		No elemento = new No();
		elemento.dado = e;
		// if(isEmpty() == true) {// não é elegante fazer dessa forma
		if (isEmpty()) {// em java assim já é testado se é vdd. para false !isEmpty() com exclamação no
						// começo negando
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}

//====================================================================================================
//====================================================================================================
	// throws exception siginifica q a função pode lançar uma excessão q eu criei 
	public int pop() throws Exception {// retorna o valor do No do topo
		if (isEmpty()) {
			throw new Exception("não há elementos para desempilhar");// tô criando uma excessão caso dê o vdd pra não
																		// ter nada
			// se entrar na excessão que criei o processamento acaba aqui!!
		}

		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

//====================================================================================================
//====================================================================================================
	public int top() throws Exception {// igual um pop, só não faço o reapontamento do topo, eu retorno ele
		if (isEmpty()) {
			throw new Exception("não há elementos na pilha");
		}
		int valor = topo.dado;
		return valor;// poderia return topo.dado;
	}

//====================================================================================================
//====================================================================================================	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {// se tem algo na pilha entro aqui
			No auxiliar = topo; // gero outra pilha
			cont = 1;
			while (auxiliar.proximo != null) {// vou verificando e contando até ser nulo
				auxiliar = auxiliar.proximo;// fazendo um "pop"
				cont++;
			}
		}
		return cont; // se pilha estiver vazia já retorno 0, do contrário o valor gerado no if
	}

}
