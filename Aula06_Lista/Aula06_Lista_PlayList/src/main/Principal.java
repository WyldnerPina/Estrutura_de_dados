package main;

import javax.swing.JOptionPane;

import controller.PlayerController;
import wyldnerPina_ListaObject.Lista;

public class Principal {

	public static void main(String[] args) {		
		Lista lista = new Lista();
		PlayerController pc = new PlayerController();		
		int opc = 0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("" + 
		                       "|========== MENU ==========|\n" +
							   " 1- Inserir música          \n" +
							   " 2- Remover música          \n" +
							   " 3- Executar PlayList       \n" +
							   " ========================== \n" +
							   " 9- Sair                    \n" +
							   "|==========================|\n"));
			switch(opc) {
				case 1 :					
					try {
						String mus = JOptionPane.showInputDialog("Digite Nome_da_musica;nome_artista;duracao");						
						pc.addMusic(lista, mus);
					} catch (Exception e) {					
						e.printStackTrace();
					}	
					break;
				//----------------------------------------------------------------------------------------------------
				case 2 :							
					try {
						int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da musica q será excluída"));
						pc.removeMusic(lista, pos - 1);// as pessoas vão digitar 1 pra posição 0, e assim por diante
					} catch (Exception e1) {						
						e1.printStackTrace();
					}
					break;
				//----------------------------------------------------------------------------------------------------
				case 3 :
					try {
						pc.executaPlaylist(lista);
					} catch (Exception e) {						
						e.printStackTrace();
					}
					break;
				//----------------------------------------------------------------------------------------------------
				case 9 :
					JOptionPane.showMessageDialog(null, "Muito Obrigado!");
					break;
				//----------------------------------------------------------------------------------------------------
				default :
					JOptionPane.showMessageDialog(null, "Valor não compatível");
			}			
		}while(opc != 9);
	}
}
