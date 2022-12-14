package view;

import model.Arvore;

public class Principal {

	public static void main(String[] args) {
		Arvore arv = new Arvore();
		arv.insertLeaf(7);
		arv.insertLeaf(13);
		arv.insertLeaf(20);
		arv.insertLeaf(4);
		arv.insertLeaf(1);
		arv.insertLeaf(18);
		arv.insertLeaf(5);
		arv.insertLeaf(11);
		
		try {
			arv.prefixSearch();
			System.out.println(" ");
			arv.infixSearch();
			System.out.println(" ");
			arv.posfixSearch();
			
			System.out.println(" ");
			arv.search(18);

			System.out.println(" ");
			arv.removeChild(13);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
