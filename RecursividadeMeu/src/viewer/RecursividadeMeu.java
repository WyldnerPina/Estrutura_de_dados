package viewer;
import controller.Nivel1;
import controller.Nivel2;// só importa qndo o pacote é diferente

import controller.Nivel4;

public class RecursividadeMeu {

	public static void main(String[] args) {
		System.out.println("=================== NIVEL 1 ====================");		
		Nivel1 n1 = new Nivel1();
		n1.mainNivel1();
		
		System.out.println("=================== NIVEL 2 ====================");		
		Nivel2 n2 = new Nivel2();
		n2.mainNivel2();
		
		System.out.println("=================== NIVEL 4 ====================");		
		Nivel4 n4 = new Nivel4();
		n4.mainNivel4();
	}

}
