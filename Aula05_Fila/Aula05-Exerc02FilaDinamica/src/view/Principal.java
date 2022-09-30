package view;

import br.edu.fateczl.filaobj.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) throws Exception {
		Fila fila = new Fila();// chamando fila
		OperacaoController op = new OperacaoController();

		for (int i = 0; i < 20; i++) {
			Cliente c = new Cliente();
			c.nome = "Cliente" + i;
			c.quantidadePecas = (int) ((Math.random() * 31) + 20);
			c.valorPecas = (float) ((Math.random() * 96) + 5);
			fila.insert(c);
		}
		op.caixa(fila);
	}
}
