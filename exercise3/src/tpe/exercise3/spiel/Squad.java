package tpe.exercise3.spiel;
import java.util.Arrays;

import tpe.exercise3.rasse.*;
/**
 * 
 * @author Daud_2
 *
 */
public class Squad {
	private String name;
	private Rasse[] rasse;
	
	public Squad(String name, Rasse... rasse){
		this.name = name;
		this.rasse = rasse;
	}
	
	public String getName() {
		return name;
	}

	public Rasse[] getRasse() {
		return rasse;
	}

	protected void setRasse(Rasse[] rasse) {
		this.rasse = rasse;
	}

	@Override
	public String toString() {
		return "Squad [name=" + name + ", rasse=" + Arrays.toString(rasse)
				+ "]";
	}
	
}
