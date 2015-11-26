 package tpe.exercise3.rasse;
import java.util.Random;
/**
 * 
 * @author Daud_2
 *
 */
public class Rasse {
	private static int wert;
	protected double lebenspunkte;
	protected int schaden;
	protected int geschwindigkeit;
	protected int ruestung;
	
	public Rasse(int lebenspunkte, int schaden, int geschwindigkeit, int ruestung){
		this.lebenspunkte = lebenspunkte;
		this.schaden = schaden;
		this.geschwindigkeit= geschwindigkeit;
		this.ruestung = ruestung;
	}

	public int attack(Rasse r1){
		int damage = this.geschwindigkeit * this.schaden;
		damage = ((100-r1.ruestung) * damage)/100;
		r1.lebenspunkte = r1.lebenspunkte - damage;
		return damage;
	}
	
	public boolean istLebendig(){
		if(lebenspunkte>0){
			return true;
		} else{
			return false;
		}
	}
	
	public double getLebenspunkte() {
		return lebenspunkte;
	}

	public void setLebenspunkte(double lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}

	public int getSchaden() {
		return schaden;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public int getRuestung() {
		return ruestung;
	}

	@Override
	public String toString() {
		return "[lebenspunkte=" + lebenspunkte + ", schaden=" + schaden
				+ ", geschwindigkeit=" + geschwindigkeit + ", ruestung="
				+ ruestung + "]";
	}

	public int getWert() {
		return wert;
	}

	public static void setWert(int wert) {
		Rasse.wert = wert;
	}
}
