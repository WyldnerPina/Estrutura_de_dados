package wyldnerPina_ListaObject;

public interface iLista {
	public void addFirst(Object valor);
	public void addLast(Object valor) throws Exception;
	public void add(Object valor, int posicao) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int posicao) throws Exception;
	public int size();
	public boolean isEmpty();
	public Object get(int posicao) throws Exception;

}