package tpe.exercise3.spiel;

import java.util.Random;

import tpe.exercise3.rasse.Rasse;
/**
 * 
 * @author Daud_2
 *
 */
public class GameController {
	private Squad s1;
	private Squad s2;

	public GameController() {

	}

	public Squad getS1() {
		return s1;
	}

	public Squad getS2() {
		return s2;
	}

	public void erstelleSquad(Spieler... spieler) {
		if(spieler.length > 2){
			System.err.print("FALSCHE PARAMETERANZAHL");
		} else{
			for (Spieler n : spieler) {
				if (s1 == null) {
					s1 = new Squad(n.squadName, n.armee);
				}
				s2 = new Squad(n.squadName, n.armee);
			}
		}
		
	}

	public String runGame() {
		Random zufall = new Random();
		Rasse[] spieler1 = s1.getRasse();
		Rasse[] spieler2 = s2.getRasse();
		int schaden1;
		int schaden2;
		int random;
		int runde = 1;
		String auswirkungen = "";

		while (!ausgeloescht(s1) && !ausgeloescht(s2)) {
			/* Spieler1 greift Spieler2 an */
			auswirkungen = "";
			for (int i = 0; i < s1.getRasse().length; i++) {
				random = zufall.nextInt(s2.getRasse().length);
		//		while(!s2.getRasse()[random].istLebendig()){
					random = zufall.nextInt(s2.getRasse().length);
		//		}
				schaden2 = s1.getRasse()[i].attack(s2.getRasse()[random]);
				auswirkungen += "\n" + s2.getName() + " Schaden: "
						+ s2.getRasse()[random].toString() + " " + schaden2;
			}
			/* Spieler2 greift Spieler1 an */
			for (int j = 0; j < s2.getRasse().length; j++) {
				random = zufall.nextInt(s1.getRasse().length);
	//			while(!s1.getRasse()[random].istLebendig()){
					random = zufall.nextInt(s1.getRasse().length);
		//		}
				schaden1 = s2.getRasse()[j].attack(s1.getRasse()[random]);
				auswirkungen += "\n" + s1.getName() + " Schaden: "
						+ s1.getRasse()[random].toString() + " " + schaden1;
			}
			System.out.println(ausgabe(runde, auswirkungen));
			squadAendern(s1);
			squadAendern(s2);
/*			System.out.println("\n\n");
			for(Rasse rasse:s1.getRasse()){
				String ausgabe = "\n" + rasse.toString();
				System.out.println(ausgabe);
			}
			for(Rasse rasse:s2.getRasse()){
				String ausgabe = "\n" + rasse.toString();
				System.out.println(ausgabe);
			}*/
			runde++;
		}
		if (ausgeloescht(s1) && !ausgeloescht(s2)) {
			return "Das Spiel ist beendet! " + s2.getName() + " hat gewonnen";
		} else if (ausgeloescht(s2) && !ausgeloescht(s1)) {
			return "Das Spiel ist beendet! " + s1.getName() + " hat gewonnen";
		}
		return "DRAW (gleichstand)";
	}

	public boolean ausgeloescht(Squad s) {
		boolean ausgeloescht = false;
		int anzahl = 0;
		if (s.getRasse().length == 0) {
			ausgeloescht = true;
		} else {
			for (int i=0; i<s.getRasse().length;i++) {
				if (!s.getRasse()[i].istLebendig()) {
					anzahl++;
				}
			}
			if (anzahl == s.getRasse().length) {
				ausgeloescht = true;
			}
		}

		return ausgeloescht;
	}

	public void squadAendern(Squad s) {
		int anzahl = 0;
		for (int i = 0; i < s.getRasse().length; i++) {
			if (s.getRasse()[i].istLebendig()) {
				anzahl++;
			}
		}
		int n = 0;
		Rasse[] geaenderteRasse = new Rasse[anzahl];
		for (int j = 0; j < geaenderteRasse.length; j++) {
			while(!s.getRasse()[n].istLebendig()) {
				n++;
			}
			geaenderteRasse[j] = s.getRasse()[n];
			n++;
		}
		s.setRasse(geaenderteRasse);

	}
	

	public String ausgabe(int aktuelleRunde, String auswirkungen) {
		return "Runde:" + aktuelleRunde + "\n" + auswirkungen;
	}
}
