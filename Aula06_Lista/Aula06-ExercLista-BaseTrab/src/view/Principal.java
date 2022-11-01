package view;

import java.io.IOException;

import controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) {	
		ModificacaoCadastroController cadastro = new ModificacaoCadastroController();
		
		
		String caminho = "C:\\TEMP";
		String nome = "cadastro.csv";
		
		try {
			cadastro.leArquivo(caminho, nome);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
//		cadastro.novoCadastro(0, 0, null);
//		Para idade entre 41 e 60 e limite de Crédito acima de 8000.00 
//		Para idade entre 31 e 40 e limite de Crédito acima de 5000.00 
//		Para idade entre 21 e 30 e limite de Crédito acima de 3000. 00
		
	}

}
