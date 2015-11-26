package tpe.exercise3.rasse;
/**
 * 
 * @author Daud_2
 *
 */
public class Ork extends Rasse {
	public static final int wert= 150;
	public Ork() {
		super(100, 33, 1, 30);
	}
	@Override
	public int getWert() {
		return wert;
	}
	@Override
	public String toString() {
		return "Ork " + super.toString();
	}
}

	

