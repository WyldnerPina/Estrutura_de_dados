package model;

public interface iSetLista {// tá original sem o isEqual, já q acrescentei depois. Ele poderia estar aqui
	public void addFirst(int valor);
	public void addLast(int valor) throws Exception;
	public void add(int valor, int posicao) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int posicao) throws Exception;
	public int size();
	public boolean isEmpty();
	public int get(int posicao) throws Exception;

}
