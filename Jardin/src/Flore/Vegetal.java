package Flore;

public abstract class Vegetal {

	protected Etat etat;
	protected String dessin[] = new String[6];
	
	public Vegetal(){
			
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";
		
	}
	
	public String toString() {
        int etat = this.etat.ordinal();
        return dessin[etat];
    }
	
	public void grandir() {
		this.etat = Etat.values()[this.etat.ordinal() + 1];
	}
	
	
}