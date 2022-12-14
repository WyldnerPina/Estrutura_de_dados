package model;

public class Arvore implements IArvore{
	No raiz;

	public Arvore() {
		raiz = null;
	}
	
//============================================= INSERINDO ====================================================
//============================================================================================================
	public void insertLeaf(int valor) {// folhas não tem valor nem a esq nem a dir, só vai inserindo
		No no = new No();
		no.dado = valor;
		no.esquerda = null;
		no.direita = null;
		insert(no, raiz);	
	}
	//--------------------------------------------------------------------------------------------------------
	private void insert(No no, No raizSubArvore) {
		if(raiz == null){
			raiz = no;
		}else {
			if(no.dado < raizSubArvore.dado) {// esquerda
				if(raizSubArvore.esquerda == null) {
					raizSubArvore.esquerda = no;
				}else {
					insert(no, raizSubArvore.esquerda);// parte recursiva
				}
			}
			if(no.dado >= raizSubArvore.dado) {// direita IGUALDADE PARA DIREITA				
				if(raizSubArvore.direita == null) {
					raizSubArvore.direita = no;
				}else {
					insert(no, raizSubArvore.direita);// funciona recursivamente, repassando os parâmetros caso a posição já tenha alguém
			
				}
			}
		}		
	}
	
//============================================= PROCURAR =====================================================
//============================================================================================================
	public void search(int valor) throws Exception {
		try {
			No no = searchNode(raiz, valor);
			int nivel = nodelLevel(raiz, valor);
			System.out.println("Dado " + no.dado + " no nível " + nivel);
		} catch (Exception e) {			
			System.err.println("Dado inexistente");
		}	
	}
	//--------------------------------------------------------------------------------------------------------
	private int nodelLevel(No raizSubArvore, int valor)throws Exception {
		if(raiz == null){
			throw new Exception ("Arvore vazia");
		}else if(valor < raizSubArvore.dado) {
			return 1 + nodelLevel(raizSubArvore.esquerda, valor);
		}else if(valor > raizSubArvore.dado) {
			return 1 + nodelLevel(raizSubArvore.direita, valor);
		}else {
			return 0;
		}
	}
	//--------------------------------------------------------------------------------------------------------
	private No searchNode(No raizSubArvore, int valor) throws Exception {
		if(raiz == null){
			throw new Exception ("Arvore vazia");
		}else if(valor < raizSubArvore.dado) {
			return searchNode(raizSubArvore.esquerda, valor);
		}else if(valor > raizSubArvore.dado) {
			return searchNode(raizSubArvore.direita, valor);
		}else {
			return raizSubArvore;
		}
	}

//============================================= REMOVER ======================================================
//============================================================================================================
	public void removeChild(int valor) throws Exception {
		remove(raiz,valor);
		
	}
	//--------------------------------------------------------------------------------------------------------
	private No remove(No raizSubArvore, int valor)throws Exception {
		if(raiz == null){
			throw new Exception ("Arvore vazia");
		}else if (valor < raizSubArvore.dado) {
			raizSubArvore.esquerda = remove(raizSubArvore.esquerda, valor);
		}else if (valor > raizSubArvore.dado) {
			raizSubArvore.direita = remove(raizSubArvore.direita, valor);
		}else {
			if(raizSubArvore.esquerda == null && raizSubArvore.direita == null) {
				raizSubArvore = null;
			}else if(raizSubArvore.esquerda == null){
				raizSubArvore = raizSubArvore.direita;
			}else if(raizSubArvore.direita == null){
				raizSubArvore = raizSubArvore.esquerda;
			}else {// dois filhos
				No no = raizSubArvore.esquerda;
				while(no.direita != null){
					no = no.direita;
				}
				raizSubArvore.dado = no.dado;
				no.dado = valor;
				raizSubArvore.esquerda = remove(raizSubArvore.esquerda, valor);
			}		
		}
		return raizSubArvore;
	}

//============================================================================================================
//============================================================================================================
	public void prefixSearch() throws Exception {
		prefix(raiz);		
	}
	//--------------------------------------------------------------------------------------------------------
	public void prefix(No raizSubArvore)throws Exception{
		if(raiz == null){
			throw new Exception ("Arvore vazia");
		}else {
			System.out.print(raizSubArvore.dado);
			System.out.print("   ");
			if(raizSubArvore.esquerda != null) {
				prefix(raizSubArvore.esquerda);
			}
			if(raizSubArvore.direita != null) {
				prefix(raizSubArvore.direita);
			}
		}
	}

//============================================================================================================
//============================================================================================================
	public void infixSearch() throws Exception {
				infix(raiz);
	}
	//--------------------------------------------------------------------------------------------------------
	private void infix(No raizSubArvore)throws Exception {
		if(raiz == null){
			throw new Exception ("Arvore vazia");
		}else {			
			if(raizSubArvore.esquerda != null) {
				prefix(raizSubArvore.esquerda);
			}
			System.out.print(raizSubArvore.dado);
			System.out.print("   ");
			if(raizSubArvore.direita != null) {
				prefix(raizSubArvore.direita);
			}
		}
		
	}

//============================================================================================================
//============================================================================================================
	public void posfixSearch() throws Exception {
		posfix(raiz);	
	}
	//--------------------------------------------------------------------------------------------------------
	private void posfix(No raizSubArvore)throws Exception{
		if(raiz == null){
			throw new Exception ("Arvore vazia");
		}else {			
			if(raizSubArvore.esquerda != null) {
				prefix(raizSubArvore.esquerda);
			}			
			if(raizSubArvore.direita != null) {
				prefix(raizSubArvore.direita);
			}
			System.out.print(raizSubArvore.dado);
			System.out.print("   ");
		}		
	}
}
