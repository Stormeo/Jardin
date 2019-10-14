import java.util.HashMap;
import java.util.Scanner;


public class Jardin {
	
	private int longueur;
	private int largeur;
	private Emplacement emplacements[][];
	private HashMap<String, Integer> panier;

	public Jardin(int longueur, int largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
		this.emplacements = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();
		
	}
	
	public void ajouterPanier(String s, int i) {
		this.panier.put(s, i);
	}
	
	public String toString(){
		
		String texte = "Voici notre jardin \n";
		
		for(int i=0; i< this.longueur; i++) {
			for(int j=0; j<this.largeur; j++) {
				Emplacement e = emplacements[i][j];
				if(e == null) {
					texte += "o";
				}else {
					texte += "Something";
				}
			}
			texte += "\n";
		}
		
		texte += "Et notre panier contient: \n";
		
		ajouterPanier("Tomate", 5);
		ajouterPanier("Carotte", 5);
		ajouterPanier("Ail", 10);
		ajouterPanier("Betrave", 5);
		
		for (String k : panier.keySet()) {
			texte += k + " : " + panier.get(k) + " graine(s)\n";
		}
		
		return texte;
	}
	
	public void semer() {
		
		Scanner abscisse = new Scanner(System.in);
		System.out.println("Choisissez la ligne où planter");
		int resAbsisse = abscisse.nextInt();
		
		Scanner ordonne = new Scanner(System.in);
		System.out.println("Choisissez la colonne où planter");
		int resOrdonne = ordonne.nextInt();
		
		Scanner graine = new Scanner(System.in);
		String rappelle = "Voici notre panier \n";
		int compt = 0;
		for (String k : panier.keySet()) {
			compt++;
			rappelle += compt +". " + k + " : " + panier.get(k) + " graine(s)\n";
		}
		System.out.println("Choisissez une graine : AVEC DES CHIFFRES");
		int newGraine = graine.nextInt();
		
		if (newGraine ==1) {
			this.emplacements[resAbsisse][resOrdonne] = new Emplacement(new Tomate());
		}else if (newGraine ==2) {
			this.emplacements[resAbsisse][resOrdonne] = new Emplacement(new Carotte());
		}else if (newGraine ==3) {
			this.emplacements[resAbsisse][resOrdonne] = new Emplacement(new Betterave());
		}else if (newGraine ==4) {
			this.emplacements[resAbsisse][resOrdonne] = new Emplacement(new Ail());
		}
		
	}
	
	public void saisonSuivante() {
		for(int x=0; x< this.longueur; x++) {
			for(int y=0; y<this.largeur; y++) {
				this.emplacements[x][y].getVegetal().grandir(); 
			}
		}
	}
		
}
	

