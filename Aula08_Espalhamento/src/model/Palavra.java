package model;

import java.util.Objects;

public class Palavra {
	public String verbete;
	public String siginificado;
	
	public int hashCode() {
		// com o int d� pra chamar o n�mero referente na tabela asc
		int posicao = verbete.toLowerCase().charAt(0);// todos caracteres em letra min�scula, e pego o primeiro car�cter;
		posicao = posicao - 97;// pq 97=A na asc ent�o menos 97 = 0, posi��o zero e dai por diante vai pra outros n�meros		
		return posicao;
	}
	
	
	public String toString() {
		return "Palavra [verbete=" + verbete + ", siginificado=" + siginificado + "]";
	}
}
