package tpe.exercise3.rasse;
/**
 * 
 * @author Daud_2
 *
 */
public class Mensch extends Rasse {
	public static final int wert = 110;
	
	public Mensch() {
		super(140, 40, 2, 40);
	}
	@Override
	public int getWert() {
		return wert;
	}
	@Override
	public String toString() {
		return "Mensch " + super.toString();
	}
	
}
