package view;

import controller.Dicionario;
import model.Palavra;

public class Principal {

	public static void main(String[] args) {
		Palavra p0 = new Palavra();
		p0.verbete = "Vocábulo";
		p0.siginificado = "Palavra";
		
		Palavra p1 = new Palavra();
		p1.verbete = "Voz";
		p1.siginificado = "Sons produzidos pelas cordas vocais";
		
		Dicionario dicionario = new Dicionario();
		dicionario .adicionarPalavara(p0);
		dicionario .adicionarPalavara(p1);
		
		
		try {
			Palavra px= new Palavra();
			px.verbete = "Vo";
			px = dicionario.buscaPalavra(px);
			System.out.println(px.siginificado);
			dicionario.removePalavra(px);
			
			String caracter = "V";
			dicionario.listarPalavras(caracter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
