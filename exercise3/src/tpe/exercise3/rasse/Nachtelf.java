package tpe.exercise3.rasse;
/**
 * 
 * @author Daud_2
 *
 */
public class Nachtelf extends Rasse {
	public static final int wert= 145;
	public Nachtelf() {
		super(120, 15, 3, 20);
	}
	@Override
	public int getWert() {
		return wert;
	}
	@Override
	public String toString() {
		return "Nachtelf " + super.toString();
	}

}
