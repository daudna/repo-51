package exercise2;

public class Figur {
	private double flaeche;
	
	public Figur() {
		flaeche = 0.0;
	}

	public Figur(double flaeche) {
		this.flaeche = flaeche;
	}

	protected double getFlaeche() {
		return flaeche;
	}

	protected void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}
	
}
