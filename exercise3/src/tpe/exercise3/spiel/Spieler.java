package tpe.exercise3.spiel;

import tpe.exercise3.rasse.Rasse;
import tpe.exercise3.rasse.anfuehrer.Daemonenjaeger;
import tpe.exercise3.rasse.anfuehrer.Erzmagier;
import tpe.exercise3.rasse.anfuehrer.Farseer;
import tpe.exercise3.rasse.anfuehrer.Lich;
/**
 * 
 * @author Daud_2
 *
 */
public class Spieler {
	private static int geldBetrag = 2000;
	Rasse[] armee = null;
	public String squadName;
	public Spieler(String squadName){
		this.squadName = squadName;
	}
	/**
	 * 
	 * @param rasse
	 * @return true / false
	 */
	public boolean kaufeWesen(Rasse... rasse){
		Farseer f = new Farseer();
		Lich l = new Lich();
		Erzmagier e = new Erzmagier();
		Daemonenjaeger d = new Daemonenjaeger();
		
		int anzahlAnfuehrer = 0;
		boolean erfolg = true;
		for(int i=0;i<rasse.length;i++){
			if(rasse[i].toString().equals(d.toString()) || rasse[i].toString().equals(e.toString()) || rasse[i].toString().equals(f.toString()) || rasse[i].toString().equals(l.toString())){
				anzahlAnfuehrer++;
				for(int j=0; j<rasse.length;j++){
					if (rasse[j].toString().equals(rasse[i].toString()) && i!=j){
						erfolg = false;
					}
				}
				
			}
			geldBetrag -= rasse[i].getWert();
		}
/*		for(Rasse wesen:rasse){
			if(Rasse.getWert() == Daemonenjaeger.wert || Rasse.getWert() == Erzmagier.wert || Rasse.getWert()==Farseer.wert || Rasse.getWert() == Lich.wert){
				anzahlAnfuehrer++;
				for(int i=0; i<rasse.length;i++){
					if (wesen.toString() == rasse[i].toString()){
						i = rasse.length;
						erfolg = false;
					}
				}
				
			}
			geldBetrag -= wesen.getWert();
		}*/
		if(anzahlAnfuehrer>=4 || geldBetrag<0 ){
			erfolg = false;
		}else{
			armee = rasse;
		}
		
		return erfolg;
	}
}
