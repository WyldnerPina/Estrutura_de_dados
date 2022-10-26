package view;

import model.SetLista;

public class Main {

	public static void main(String[] args) {
		SetLista l = new SetLista();
		
		boolean vazia = l.isEmpty();
		System.out.println("Vazia: " + vazia);
		System.out.println("================================================\n");
		
		int size = l.size();
		System.out.println("Tamanho: " + size);
		System.out.println("================================================\n");
			
		
		try {
			l.addFirst(3);
			l.addFirst(2);
			l.addFirst(2);
			l.add(10, 1);// valor / posição -- só daqui pra baixo teria q estar no try
			l.addLast(5);
			l.add(6, 2);
			size = l.size();
			System.out.println("Tamanho: " + size);
			System.out.println("================================================\n");
			
			l.remove(3);
			l.removeFirst();
			l.removeLast();
			size = l.size();
			System.out.println("Tamanho: " + size);
			System.out.println("================================================\n");
			
			int valor = l.get(1);
			System.out.println("Posição 2: " + valor);
			System.out.println("================================================\n");
			
			System.out.println(l.toString());
			System.out.println(l);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}

}
