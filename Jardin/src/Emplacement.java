import Flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;
	
	public Vegetal getVegetal() {
		return vegetal;
	}
	
	public Emplacement(Vegetal v){
		this.vegetal = v;
	}
	
	public String toString() {
        return vegetal.toString();
    }
	
}
