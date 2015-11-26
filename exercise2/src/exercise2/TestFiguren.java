package exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFiguren {
	//difference between expected and actual result
	private static final double DELTA = 1e-15;
	@Test
	public void testCreation() {
		Figur f1 = new Figur();
		assertEquals(0.0,f1.getFlaeche(),DELTA);
		
		Dreieck d1 = new Dreieck();
		Dreieck d2 = new Dreieck(5.0, 2.5);
		assertEquals(0.0, d1.getFlaeche(),DELTA);
		assertEquals(6.25, d2.getFlaeche(),DELTA);
		
		Rechteck r1 = new Rechteck();
		Rechteck r2 = new Rechteck(3, 6);
		assertEquals(0.0, r1.getFlaeche(),DELTA);
		assertEquals(3*6,r2.getFlaeche(),DELTA);
		
		Gerade g1 = new Gerade();
		Gerade g2 = new Gerade(4.625);
		assertEquals(0,g1.getFlaeche(), DELTA);
		assertEquals(0, g2.getFlaeche(),DELTA);
		
		Quadrat q1 = new Quadrat();
		Quadrat q2 = new Quadrat(33.8659);
		assertEquals(0, q1.getFlaeche(), DELTA);
		assertEquals(33.8659*33.8659,q2.getFlaeche(),DELTA);
		
	}

}
