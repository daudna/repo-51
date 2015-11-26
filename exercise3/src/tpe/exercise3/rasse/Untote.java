package tpe.exercise3.rasse;
/**
 * 
 * @author Daud_2
 *
 */
public class Untote extends Rasse {
	public static final int wert= 70;
	public Untote() {
		super(120, 16, 2, 30);
	}
	@Override
	public int getWert() {
		return wert;
	}
	@Override
	public String toString() {
		return "Untote " + super.toString();
	}
	
}
