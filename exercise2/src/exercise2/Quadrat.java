package exercise2;

public class Quadrat extends Figur {
	double laenge;
	double flaeche;
	
	public Quadrat(){
		
	}
	
	public Quadrat(double laenge){
		super(laenge*laenge);
		this.laenge = laenge;
	}
}
