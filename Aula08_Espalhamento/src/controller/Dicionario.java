package controller;

import br.com.leandrocolevati.Lista.Lista;
import model.Palavra;

public class Dicionario {
	Lista[] vetDicionario;
	
	public Dicionario() {
		vetDicionario = new Lista[26];
		inicializar();
	}

	private void inicializar() {
		int tamanho = vetDicionario.length;
		for(int i = 0; i < tamanho; i++) {
			vetDicionario[i] = new Lista();
		}		
	}
	
	public void adicionarPalavara(Palavra palavra) {
		int posicao = palavra.hashCode();
		vetDicionario[posicao].addFirst(palavra);// dependendo da palavra ele entra
	}
	
	public Palavra buscaPalavra(Palavra palavra) throws Exception {
		int posicao = palavra.hashCode();
		int tamanhoLista = vetDicionario[posicao].size();// retornando o tamanho da lista
		for(int i = 0; i < tamanhoLista; i++) {
			Palavra p = (Palavra) vetDicionario[posicao].get(i);
			if(p.verbete.equals(palavra.verbete)) {
				palavra.siginificado = p.siginificado; // break dentro de um laço encerra (tem continue tbm, mas só continua)
				break;
			}
		}
		if(palavra.siginificado == null) {// não encontrou a palavra
			throw new Exception ("Não encontrou a palavra");
		}
		return palavra;
	}
	
	public void removePalavra(Palavra palavra) throws Exception {
		int posicao = palavra.hashCode();
		int tamanhoLista = vetDicionario[posicao].size();
		for(int i = 0; i < tamanhoLista; i++) {
			Palavra p = (Palavra) vetDicionario[posicao].get(i);
			if(p.verbete.equals(palavra.verbete)){
				vetDicionario[posicao].removePosition(i);
				break;				
			}
		}
	}
	
	public void listarPalavras(String caracter) throws Exception {
		int posicao = funcaoHash(caracter);
		int tamanhoLista = vetDicionario[posicao].size();
		for(int i = 0; i< tamanhoLista; i++) {			
			Palavra p = (Palavra) vetDicionario[posicao].get(i);
			System.out.println(p.toString());		
		}
		
	}

	private int funcaoHash(String caracter) {// se objeto defino hash dentro do objeto, se int ou string dentro da função
		int posicao = caracter.toLowerCase().charAt(0);
		posicao = posicao - 97;		
		return posicao;	
	}
}
