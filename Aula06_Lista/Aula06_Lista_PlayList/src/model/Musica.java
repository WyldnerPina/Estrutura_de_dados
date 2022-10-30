package model;

public class Musica {
	
	public String nome;
	public String nomeArtista;
	public int duracao;
	
	@Override
	public String toString() {
		return "Musica [nome=" + nome + ", nomeArtista=" + nomeArtista + ", duracao=" + duracao + "]";
	}
}
