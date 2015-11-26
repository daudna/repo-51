import java.util.Arrays;

/**
 * Diese Klasse präsentiert ein Polynom von einem beliebigen Grad mit realen
 * Koeffizienten.
 * <p>
 * Polynome können addiert und subtrahiert werden. Außerdem ist es möglich,
 * die Koeffizienten einzeln oder en-bloc wieder auszulesen. Für beliebige
 * Werte x kann der Polynom ausgerechnet werden.
 * <p>
 * Es besteht die Möglichkeit das Polynom zu differnzieren oder zu integrieren.
 * <p>
 * Objekte dieser Klasse sind immutable. Die Methoden verändern den Zustand des
 * Objektes nicht sondern geben grundsätzlich ein neues Objekt zurück.
 * <p>
 * Die Indices beim Zugriff auf die Koeffizienten beginnen immer bei
 * {@literal 0}
 */
public class Polynom {

	/*
	 * Hilfe, ich bin werde auf der Mother Base gefangen gehalten und muss hier
	 * den ganzen Tag Programme schreiben...
	 * 
	 * Ich lösche jetzt einfach die meisten Implementierung der Methoden und
	 * flüchte mit dem Schlauchboot, vielleicht finden sie mich ja nicht....
	 */

	private double[] a;

	/**
	 * Erzeugt ein neues Polynom mit den gegebenen Koeffizienten. Die
	 * Koeffizienten beginnen Element a0 und setzen sich dann zu höheren
	 * Koeffizienten fort. D.h., dass z.B. das Polynom
	 * <code>2x^4 - 1x^3 + 0,5x^2</code> erzeugt werden muss als:
	 * <code>new Polynom(0.0, 0.0, 0.5, -1.0, 2.0)</code>.
	 *
	 * @param a
	 *            Koeffizienten des Polynoms
	 */
	public Polynom(double... a) {
		this.a = a;
	}

	/**
	 * Erzeugt das Nullpolynom, d.h. das Polynom, bei dem alle Koeffizienten 0
	 * sind.
	 */
	public Polynom() {
		this(0);
	}

	/**
	 * Berechnet das Polynom an der Stelle x.
	 *
	 * @param x
	 *            Stelle, für die das Polynom berechnet werden soll.
	 * @return Wert an der Stelle x
	 */
	public double berechne(double x) {
		double ergebnis = 0.0;
		ergebnis += this.a[0];
		double j = 1.0;
		for (int i = 1; i < this.a.length; i++) {
			ergebnis = ergebnis + (a[i] * Math.pow(x, j));
			j++;
		}

		return ergebnis;
	}

	/**
	 * Berechnet das Polynom an mehreren Stellen.
	 *
	 * @param xs
	 *            die Stellen an der das Polynom berechnet werden soll.
	 * @return Ergebnis
	 */
	public double[] calc(double[] xs) {
		return null;
	}

	/**
	 * Liefert den Grad des Polynoms.
	 *
	 * @return Grad des Polynoms, -1 für das Nullpolynom
	 */
	public int getGrad() {
		int temp = -1;
		int grad = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				grad = i;
			}
		}
		if (grad == 0 && this.a[0] == 0) {
			return -1;
		} else {
			return grad;
		}

	}

	/**
	 * Liefert den n-ten Koeffizienten.
	 *
	 * @param n
	 *            Koeffizient, der gelesen werden soll.
	 * @return Wert des Koeffizienten oder 0 wenn n größer als der Grad des
	 *         Polynoms ist
	 */
	public double getKoeffizient(int n) {
		if (n > this.getGrad()) {
			return 0;
		} else {
			return this.a[n];
		}
	}

	/**
	 * Liefert die Koeffizienten dieses Polynoms.
	 *
	 * @return die Koeffizienten.
	 */
	public double[] getKoeffizienten() {
		return this.a;
	}

	/**
	 * Addiert das gegebenen Polynom zu diesem.
	 *
	 * @param p
	 *            Polynom, das addiert werden soll.
	 * @return neues Polynom mit dem Ergebnis der Addition
	 */
	public Polynom addiere(Polynom p) {
		double[] data;
		Polynom newPolynom;
		int i;
		if (this.a[0] == 0 || p.a[0] == 0) {
			if (this.a[0] == 0) {
				return p;
			} else {
				return this;
			}
		} else {
			if (this.a.length > p.a.length) {
				data = new double[this.a.length];
			} else {
				data = new double[p.a.length];
			}

			for (i = 0; i < this.a.length && i < p.a.length; i++) {
				data[i] = this.a[i] + p.a[i];
			}
			if (this.a.length > p.a.length) {
				for (int j = i; j < a.length; j++) {
					data[i] = this.a[i];
				}
			} else {
				for (int j = i; j < p.a.length; j++) {
					data[j] = p.a[j];
				}
			}
			return newPolynom = new Polynom(data);
		}

	}

	/**
	 * Subtrahiert das gegebenen Polynom von diesem.
	 *
	 * @param p
	 *            Polynom, das subtrahiert werden soll.
	 * @return neues Polynom mit dem Ergebnis der Subtraktion
	 */
	public Polynom subtrahiere(Polynom p) {

		double[] data;
		Polynom newPolynom;
		int i;

		if (this.a[0] == 0 || p.a[0] == 0) {
			if (this.a[0] == 0) {
				data = new double[p.a.length];
				for (i = 0; i < p.a.length; i++) {
					data[i] = -p.a[i];
				}
				return newPolynom = new Polynom(data);
			} else {
				return this;
			}
		} else {
			if (this.a.length > p.a.length) {
				data = new double[this.a.length];
			} else {
				data = new double[p.a.length];
			}

			for (i = 0; i < this.a.length && i < p.a.length; i++) {
				data[i] = this.a[i] - p.a[i];
			}
			if (this.a.length > p.a.length) {
				for (int j = i; j < a.length; j++) {
					data[i] = this.a[i];
				}
			} else {
				for (int j = i; j < p.a.length; j++) {
					data[j] = -p.a[j];
				}
			}
			return newPolynom = new Polynom(data);
		}

	}

	/**
	 * Differenziert das Polynom.
	 *
	 * @return Ergebnis der Ableitung
	 */
	public Polynom differenziere() {

		Polynom newPolynom;
		if (this.a == null) {
			return null;
		}
		double[] data = new double[this.a.length - 1];
		int j = 0;

		for (int i = 1; i < this.a.length; i++) {
			data[j] = i * this.a[i];
			j++;
		}
		return newPolynom = new Polynom(data);
	}

	/**
	 * Integriert das Polynom.
	 *
	 * @return Ergebnis der Integration.
	 */
	public Polynom integriere() {
		Polynom newPolynom;
		if (this.a == null) {
			return null;
		}
		double[] data = new double[this.a.length + 1];
		data[0] = 0;
		int j = 1;
		double erg;
		for (int i = 0; i < this.a.length; i++) {
			erg = (1 / (1 + (double) i)) * this.a[i];
			data[j] = erg;
			j++;
		}
		return newPolynom = new Polynom(data);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(a);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polynom other = (Polynom) obj;
		int i=0;
		int weiter = 0;
		while(i<getGrad() && weiter == 0){
			if(this.a[i] == other.a[i]){
				i++;
			} else{
				weiter = -1;
			}
		}
		
		if (weiter == -1 || this.getGrad() != other.getGrad()){
			return false;
		}else {
			return true;
		}
	}

	/**
	 * Diese Methode wandelt das Polynom in einen lesbaren String um. Dabei
	 * lässt sie alle Koeffizienten aus, die 0 sind und gibt den Grad vorweg
	 * aus. Für das Polynom -9x^8 - 4x^5 - 0,5x^4 + 5x^2 - 2x + 3 lautet die
	 * Ausgabe: <code>
	 * Grad 8: -9x^8 - 4x^5 - 0,5x^4 + 5x^2 - 2x + 3
	 * </code> =
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (getGrad() == -1) {
			return "";
		} else {
			String ausgabe = "";
			for (int i = this.a.length - 1; i >= 0; i--) {
				String format = "";

				if (this.a[i] != 0) {

					if (this.a[i] < 0) {
						format = (this.a[i]*-1) + "";
						if (format.charAt(0) == '0' && format.contains(".")) {
							format = (this.a[i]*-1) + "";
							format = format.replace(".", ",");
						} else {
							int zahl = (int) this.a[i] * -1;
							format = zahl + "";
						}
					} else {
						int zahl = (int) this.a[i];
						format = zahl + "";
					}

					if (ausgabe == "") {
						if (this.a[i] < 0) {
							ausgabe += "-" + format + "x^" + i;
						} else {
							ausgabe += format + "x^" + "i";
						}
					} else if (i == 1) {
						if (this.a[i] < 0) {
							ausgabe += " - " + format + "x";
						} else {
							ausgabe += " + " + format + "x";
						}

					} else if (i == 0) {
						if (this.a[i] < 0) {
							ausgabe += " - " + format;
						} else {
							ausgabe += " + " + format;
						}
					} else {
						if (this.a[i] < 0) {
							ausgabe += " - " + format + "x^" + i;
						} else {
							ausgabe += " + " + format + "x^" + i;
						}
					}

				}
			}
			return "Grad " + getGrad() + ":  " + ausgabe;
		}

	}

}
