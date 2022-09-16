package controller;

import br.com.leandrocolevati.pilhalong.Pilha;

public class FatController {

	public FatController() {
		super();
	}

	public long fatorial(long valor) throws Exception {
		Pilha p = new Pilha();

		while (valor > 0) {
			p.push(valor);
			valor--;
		}

		valor = 1;
		while (!p.isEmpty()) {
			valor *= p.pop();
		}
		return valor;
	}

}
