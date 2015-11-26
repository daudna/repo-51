package exercise2;

public class Dreieck extends Figur{
	
	private double grundseite;
	private double hoehe;
	
	public Dreieck() {
		
	}
	public Dreieck(double grundseite, double hoehe){
		super((grundseite*hoehe)/2);
		this.grundseite = grundseite;
		this.hoehe = hoehe;
	}

}
