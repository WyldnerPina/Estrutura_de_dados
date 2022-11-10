package view;

import javax.swing.JOptionPane;

import controller.Exerc04Controller;
import model.Produto;

public class Main {

	public static void main(String[] args) {
		int arg = 0;
		Exerc04Controller ex04ctrl = new Exerc04Controller();
		do {
			arg = Integer.parseInt(JOptionPane.showInputDialog(""
															+ "--------------------- Menu ---------------------\n"
															+ " 1- Inserir produto\n"
															+ " 2- Remover produto\n"
															+ " 3- Modificar produto\n"
															+ " 4- Verificar valor\n"
															+ " 5- Exibir lista de produtos\n"
															+ " 9- Sair"));
			switch(arg) {
			case  1://---------------------------------------------------------------------------------------------
				Produto p = new Produto();
				p.nome = JOptionPane.showInputDialog("Digite o nome do produto");
				p.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
				try {
					ex04ctrl.inserir(p);
				} catch (Exception e) {					
					e.printStackTrace();
				}
				break;
				
			case  2://--------------------------------------------------------------------------------------------- 
				String nome;
				nome = JOptionPane.showInputDialog("Digite o nome do produto a ser removido");
				try {
					ex04ctrl.remover(nome);
				} catch (Exception e1) {					
					e1.printStackTrace();
				}
				break;
				
			case  3://---------------------------------------------------------------------------------------------
				String nomeMod;
				nomeMod = JOptionPane.showInputDialog("Digite o nome do produto a ser modificado");
				try {
					ex04ctrl.modificar(nomeMod);
				} catch (Exception e1) {					
					e1.printStackTrace();
				}
				break;
				
			case  4://---------------------------------------------------------------------------------------------
				String nomeVal;
				nomeVal = JOptionPane.showInputDialog("Digite o nome do produto para verificar o valor");
				try {
					ex04ctrl.verificarValor(nomeVal);
				} catch (Exception e1) {					
					e1.printStackTrace();
				}
				break;
				
			case  5://---------------------------------------------------------------------------------------------
				try {
					ex04ctrl.exibirLista();
				} catch (Exception e) {					
					e.printStackTrace();
				}
				break;
				
			case  9://---------------------------------------------------------------------------------------------
				JOptionPane.showMessageDialog(null, "tks");
				break;
				
			default://---------------------------------------------------------------------------------------------
				JOptionPane.showMessageDialog(null, "pfv, digite um número válido");
			}
		}while(arg != 9);
	}
}