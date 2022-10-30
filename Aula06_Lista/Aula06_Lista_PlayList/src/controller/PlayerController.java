package controller;

import javax.swing.JOptionPane;

import model.Musica;
import wyldnerPina_ListaObject.Lista;


public class PlayerController {
	public PlayerController() {
		super();
	}
	
//================================================================================================
	public void addMusic(Lista lista, String music) throws Exception {
		String[] partes = music.split(";");
		Musica m = new Musica();
		m.nome = partes[0];
		m.nomeArtista = partes[1];
		m.duracao = Integer.parseInt(partes[2]);

		if (lista.isEmpty()) {
			lista.addFirst(m);
		} else {
			lista.addLast(m);
		}

		System.out.println(m);
	}

//================================================================================================
	public void removeMusic(Lista lista, int posicao) throws Exception {
		if(lista.isEmpty()) {
			JOptionPane.showMessageDialog(null, "lista vazia"); // não precisava, mas deixei pra lembrar do q pensei
			throw new Exception("A lista está vazia");// foi pedido exceção, mas eu preferia aparecer mensagem igual deixei			
		}else {
			if(posicao == lista.size()) {
				
			}else if (posicao == 1){
				
			}else {
				lista.remove(posicao);
			}
		}		
	}


//================================================================================================
	public void executaPlaylist(Lista lista) throws Exception {
		if(lista.isEmpty()) {		
			JOptionPane.showMessageDialog(null, "lista vazia");
			throw new Exception("A lista está vazia");
		}else {
			int cont = 0;
			while(cont < lista.size()) {			
				Musica m = (Musica) lista.get(cont);
				System.out.println(cont);
				System.out.println("Tocando Musica: " + m.nome + "\nArtista: " + m.nomeArtista);			
				Thread.sleep(m.duracao*1000);
				cont ++;			
			}
		}		
	}
}
