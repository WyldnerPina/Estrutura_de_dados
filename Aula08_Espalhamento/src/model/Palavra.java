package model;

import java.util.Objects;

public class Palavra {
	public String verbete;
	public String siginificado;
	
	public int hashCode() {
		// com o int dá pra chamar o número referente na tabela asc
		int posicao = verbete.toLowerCase().charAt(0);// todos caracteres em letra minúscula, e pego o primeiro carácter;
		posicao = posicao - 97;// pq 97=A na asc então menos 97 = 0, posição zero e dai por diante vai pra outros números		
		return posicao;
	}
	
	
	public String toString() {
		return "Palavra [verbete=" + verbete + ", siginificado=" + siginificado + "]";
	}
}
