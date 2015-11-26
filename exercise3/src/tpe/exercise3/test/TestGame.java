package tpe.exercise3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tpe.exercise3.rasse.*;
import tpe.exercise3.rasse.anfuehrer.*;
import tpe.exercise3.spiel.*;
/**
 * 
 * @author Daud_2
 *
 */
public class TestGame {
	private static final int DELTA = 0;
	
	
	@Test
	public void test() {
		Mensch m = new Mensch();
		Nachtelf n = new Nachtelf();
		Farseer f = new Farseer();
		Lich l = new Lich();
		
/*		Rasse[] rasse = {m,f};
		Rasse[] rasse2 = {n,l};
		
		Squad pak = new Squad("pak", rasse);
		Squad ind = new Squad("ind", rasse2);
		
		GameController neuesSpiel = new GameController(pak, ind, 1);
		neuesSpiel.runGame();*/
		
		Spieler s1 = new Spieler("pak");
		Spieler s2 = new Spieler("ind");
		
		s1.kaufeWesen(m,f);
		s2.kaufeWesen(n,l);
		GameController g1 = new GameController();
		g1.erstelleSquad(s1, s2);
		g1.runGame();
	}
	@Test
	public void testAttack() {
		Ork o = new Ork();
		Untote u = new Untote();
		Mensch m = new Mensch();
		Nachtelf n = new Nachtelf();
		
		Farseer f = new Farseer();
		Lich l = new Lich();
		Erzmagier e = new Erzmagier();
		Daemonenjaeger d = new Daemonenjaeger();
		
		assertEquals(23, o.attack(u));
		assertEquals(23,f.attack(m));
	}
	@Test
	public void testIstLebendig(){
		Ork o = new Ork();
		Untote u = new Untote();
		Mensch m = new Mensch();
		Nachtelf n = new Nachtelf();
		
		Farseer f = new Farseer();
		Lich l = new Lich();
		Erzmagier e = new Erzmagier();
		Daemonenjaeger d = new Daemonenjaeger();
		
		assertEquals(true,o.istLebendig());
		while(o.istLebendig()){
			m.attack(o);	
		}
		assertEquals(false,o.istLebendig());
	}
	@Test
	public void createSquads(){
		Ork o = new Ork();
		Untote u = new Untote();
		Mensch m = new Mensch();
		Nachtelf n = new Nachtelf();
		
		Farseer f = new Farseer();
		Farseer f2 = new Farseer();
		Lich l = new Lich();
		Erzmagier e = new Erzmagier();
		Daemonenjaeger d = new Daemonenjaeger();
		
		Spieler spieler1 = new Spieler("USA");
		Spieler spieler2 = new Spieler("RUS");
		
		spieler1.kaufeWesen(o,u,f,l);
		spieler2.kaufeWesen(m,n,e,d);
		
		GameController kalterKrieg = new GameController();
		GameController kimKrieg = new GameController();
		GameController krimKonflikt = new GameController();
		
		kalterKrieg.erstelleSquad(spieler1,spieler2);
		kimKrieg.erstelleSquad(spieler1, spieler2, spieler1);
		krimKonflikt.erstelleSquad(spieler1,spieler2);
		
		assertEquals(kalterKrieg.getS1().getRasse().toString(),krimKonflikt.getS1().getRasse().toString());
		assertNull(kimKrieg.getS1());
		assertNull(kimKrieg.getS2());
		
		assertEquals(false,spieler1.kaufeWesen(o,f,l,l,l,l));
		assertEquals(false,spieler1.kaufeWesen(o,o,o,o,o,o,o,o,o,o,o,o,o,o));
		
	}

}
