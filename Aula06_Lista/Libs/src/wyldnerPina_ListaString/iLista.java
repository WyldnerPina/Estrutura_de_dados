package wyldnerPina_ListaString;

public interface iLista {
	public void addFirst(String valor);
	public void addLast(String valor) throws Exception;
	public void add(String valor, int posicao) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int posicao) throws Exception;
	public int size();
	public boolean isEmpty();
	public String get(int posicao) throws Exception;
}
