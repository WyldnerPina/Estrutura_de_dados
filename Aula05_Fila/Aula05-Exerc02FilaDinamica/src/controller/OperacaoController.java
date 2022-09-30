package controller;
import java.text.DecimalFormat;
import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {
	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila fila) throws Exception {
		while (!fila.isEmpty()) {
				Cliente c = (Cliente)fila.remove();				
				String valorTotal = new DecimalFormat("####.00").format(c.valorPecas * c.quantidadePecas);
				System.out.println("Nome: " + c.nome  + " : R$ " + valorTotal);			
		}
	}
}
