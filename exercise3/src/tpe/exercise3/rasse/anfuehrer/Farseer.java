package tpe.exercise3.rasse.anfuehrer;

import tpe.exercise3.rasse.Ork;
import tpe.exercise3.rasse.Rasse;
/**
 * 
 * @author Daud_2
 *
 */
public class Farseer extends Ork {
	private String beherrschtesElement;
	private double bonus;
	public static final int wert = 300; 
	
	public Farseer() {
		super();
		this.beherrschtesElement="";
		this.bonus = 1.2;
	}
	@Override
	public int getWert() {
		return wert;
	}
	@Override
	public int attack(Rasse r1) {
		double damage = super.geschwindigkeit * super.schaden;
		damage = ((100-r1.getRuestung()) * damage)/100;
		damage = damage * this.bonus;
		r1.setLebenspunkte(r1.getLebenspunkte() - (int) damage);
		return (int) damage;
	}
	@Override
	public String toString() {
		return "Faseer " + super.toString();
	}
}
