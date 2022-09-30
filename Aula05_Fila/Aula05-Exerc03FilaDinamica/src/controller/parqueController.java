package controller;

//import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {

	public void brinquedo(Fila fila) throws Exception {
		while (!fila.isEmpty()) {
			Pessoa p = (Pessoa) fila.remove();
			if (p.altura < 1.60) {
				if(p.idade >= 16) {
					System.err.println(p.nome + " não apta por Altura");
				}else {
					System.err.println(p.nome + " não apta por Altura e idade");
				}				
			} else {
				if (p.idade < 16) {
					System.err.println(p.nome + " não apta por idade");
				}else {
					System.out.println(p.nome + " está apta");
				}					
			}	
		}
	}

}
