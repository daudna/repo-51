package tpe.exercise3.rasse.anfuehrer;

import tpe.exercise3.rasse.Rasse;
import tpe.exercise3.rasse.Untote;

/**
 * 
 * @author Daud_2
 *
 */
public class Lich extends Untote{
	private String beherrschtesElement;
	private double bonus;
	public static final int wert = 140;
	
	public Lich(){
		super();
		this.beherrschtesElement = "";
		this.bonus = 2.3;
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
		return "Lich " + super.toString();
	}
}
