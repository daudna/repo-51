package tpe.exercise3.test;

import tpe.exercise3.rasse.Mensch;
import tpe.exercise3.rasse.Nachtelf;
import tpe.exercise3.rasse.Ork;
import tpe.exercise3.rasse.Untote;
import tpe.exercise3.rasse.anfuehrer.Daemonenjaeger;
import tpe.exercise3.rasse.anfuehrer.Erzmagier;
import tpe.exercise3.rasse.anfuehrer.Farseer;
import tpe.exercise3.rasse.anfuehrer.Lich;
import tpe.exercise3.spiel.GameController;
import tpe.exercise3.spiel.Spieler;
/**
 * 
 * @author Daud_2
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Ork o = new Ork();
		Untote u = new Untote();
		Mensch m = new Mensch();
		Mensch m2 = new Mensch();
		Mensch m3 = new Mensch();
		Nachtelf n = new Nachtelf();
		Nachtelf n2 = new Nachtelf();
		
		Farseer f = new Farseer();
		Lich l = new Lich();
		Erzmagier e = new Erzmagier();
		Daemonenjaeger d = new Daemonenjaeger();
		
		Spieler s1 = new Spieler("USA");
		Spieler s2 = new Spieler("RUS");
		
		s1.kaufeWesen(o,u,f,l);
		s2.kaufeWesen(m,n,e,d);
		GameController kalterKrieg = new GameController();
		kalterKrieg.erstelleSquad(s1, s2);
		System.out.println(kalterKrieg.runGame());
	}
}
