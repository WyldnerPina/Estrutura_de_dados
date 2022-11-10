package controller;

import javax.swing.JOptionPane;
import model.Produto;
import wyldnerPina_ListaObject.Lista;

public class Exerc04Controller {
	Lista lista = new Lista();

	public Exerc04Controller() {
		super();
	}

	
//===========================================================================================================
	public void inserir(Produto p) throws Exception {
		if (lista.isEmpty()) {
			lista.addFirst(p);
		} else {
			lista.addLast(p);
		}
	}

	
//===========================================================================================================
	public void remover(String nome) throws Exception {
		int tam = lista.size();
		boolean noItem = false;
		
		if (tam == 0) {
			JOptionPane.showMessageDialog(null, "Não há nada na lista");
		} else {
			for (int i = 0; i < tam; i++) {
				Produto pAux = new Produto();
				pAux = (Produto) lista.get(i);

//			if(pAux.nome.contains(nome))// não usei o contains pra não remover se não for exatamente igual 
				if (pAux.nome.equals(nome)) {					
					lista.remove(i);
					noItem = true;
					tam--;// qndo vc remove o tamanho tem q diminuir; se não vai dar posição inválida
				} 
			}
		}
		if(!noItem) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado item com este nome");
		}
	}

	
//===========================================================================================================	
	public void modificar(String nomeMod) throws Exception {
		int tam = lista.size();
		boolean noItem = false;
		Produto pAux = new Produto();
		
		if (tam == 0) {
			JOptionPane.showMessageDialog(null, "Não há nada na lista");
		} else {
			for (int i = 0; i < tam; i++) {
				pAux = (Produto) lista.get(i);
				if (pAux.nome.equals(nomeMod)) {					
					lista.remove(i);					
					
					//-------------------------------------------------------------------------------
					String nome;
					nome = JOptionPane.showInputDialog("Deseja modificar nome \n[Y/N]");
					nome = nome.toLowerCase();
					
					if(nome.equals("y")) {
						pAux.nome = JOptionPane.showInputDialog("Digite o nove nome do produto");						
					}
					
					//-------------------------------------------------------------------------------
					String preco;
					preco = JOptionPane.showInputDialog("Deseja modificar o preço \n[Y/N]");
					preco = preco.toLowerCase();
					
					if(preco.equals("y")) {
						pAux.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do produto"));
					}
					
					//-------------------------------------------------------------------------------
					lista.addLast(pAux);
					noItem = true;
					tam--;
				} 
			}			
		}
		if(!noItem) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado item com este nome");
		}		
	}

	
//===========================================================================================================	
	public void verificarValor(String nomeVal) throws Exception {
		int tam = lista.size();
		boolean noItem = false;
		
		if (tam == 0) {
			JOptionPane.showMessageDialog(null, "Não há nada na lista");
		} else {
			for (int i = 0; i < tam; i++) {
				Produto pAux = new Produto();
				pAux = (Produto) lista.get(i);

				if (pAux.nome.equals(nomeVal)) {
					System.out.println("Preço" + pAux.preco);
					noItem = true;
				} 
			}
		}
		if(!noItem) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado item com este nome");
		}
	}

	
//===========================================================================================================	
	public void exibirLista() throws Exception {
		int tam = lista.size();
		
		if (tam == 0) {
			JOptionPane.showMessageDialog(null, "Não há nada na lista");
		} else {
			for (int i = 0; i < tam; i++) {
				System.out.println(lista.get(i));
			}
		}
	}
}
