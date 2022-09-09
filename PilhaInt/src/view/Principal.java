package view;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
//=======================================================================================
		// TESTANDO SE ESTÁ VAZIA
		PilhaInt p = new PilhaInt();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		
//=======================================================================================		
		// TESTE DE INSERÇÃO 
		p.push(20);
		p.push(10);
		p.push(30);
		
		try {
			int a = p.pop();// jogando valor do topo para var
			System.out.println("resultado " + a);
		} catch (Exception e1) {		
			e1.printStackTrace();
		}		
//=======================================================================================
		
		
		// GERANDO PILHA RANDOMICA
		int totalNos = (int)((Math.random()*10)+1);
		for(int i = 0; i < totalNos; i++) {
			int e = (int)((Math.random()*100)+1);
			p.push(e);
		}
		
		// DETERMINANDO O TAMANHO DA PILHA GERADA
		int tamanho = p.size();
		System.out.println("Tamanho da pilha gerada: " +tamanho);
		
		// VERIFICANDO QUEM É O TOPO - top assim como pop precisa do try catch
		int top;
		try {
			top = p.top();
			System.out.println("Topo" + top);
		} catch (Exception e1) {			
			e1.printStackTrace();
		}
		
		
		// DESEMPILHANDO PILHA RANDOMICA GERADA ACIMA 
		for(int i = 0; i < totalNos; i++) {
			try {
				int valor = p.pop();// tenta fazer o pop se não conseguir
				System.out.println("Pop " + valor);
			} catch (Exception e) {				
				e.printStackTrace();// se pilha estiver vazia vai escrever aqui
				// print = imprimir Stack = pilha Trace = rota...... printa a rota do erro
			}
			p.isEmpty();
			vazia = p.isEmpty();
			System.out.println("Vazia " + vazia);
		}

	}

}
