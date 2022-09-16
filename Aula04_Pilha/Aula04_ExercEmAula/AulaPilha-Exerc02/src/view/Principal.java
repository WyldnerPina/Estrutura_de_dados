package view;

import br.com.leandrocolevati.pilhaint.Pilha;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		OperacaoController c = new OperacaoController();
		Pilha p = new Pilha();
		int valor;
		
		for(int i = 0; i < 15; i++) {
			valor = (int)(Math.random()*51);			
			p.push(valor);
		}
		valor = c.maiorValor(p);
		System.out.println("Resultado: " + valor);
	}

}
