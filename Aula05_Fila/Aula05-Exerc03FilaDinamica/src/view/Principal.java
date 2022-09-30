package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import model.Pessoa;


public class Principal {

	public static void main(String[] args) throws Exception {
		Fila fila = new Fila();	
		ParqueController parq = new ParqueController();
		
		for(int i = 0; i < 30; i++) {
			Pessoa p = new Pessoa();
			p.nome = "Pessoa" + i;
			p.idade = (int)((Math.random() * 31)+10);
			p.altura = (float)((Math.random() * 1.66)+1.35);
			fila.insert(p);
		}		
		parq.brinquedo(fila);	
	}

}
