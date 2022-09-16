package controller;

import br.com.leandrocolevati.pilhaint.Pilha;

public class OperacaoController {
	public OperacaoController() {
		super();
	}

//==================================================================	
	public int maiorValor(Pilha p) throws Exception {
		Pilha p2 = new Pilha();
		p2 = p;
//==================================================================		
		while (p2.size() != 1) {
			int n1, n2;
			n1 = p2.pop();
			n2 = p2.pop();
			if (n2 > n1) {
				p2.push(n2);
			} else {
				p2.push(n1);
			}
		}
		return p2.pop();
	}

}
