package testCalculator307;

import static org.junit.Assert.*;

import org.junit.Test;


import logic.*;

public class TestBasicArithmatic {

	@Test
	public void testAddition() {
		Addition add = new Addition();
		assertEquals(add.operate((double) 5, (double) 6), new Double(11));
		
		assertEquals(add.operate((double) 4, (double) -11), new Double(-7));
	}
	
	@Test
	public void testSubtraction() {
		Subtraction sub = new Subtraction();
		assertEquals(sub.operate((double) 12, (double) 6), new Double (6));
		
		assertEquals(sub.operate((double) 2, (double) 7), new Double(-5));
	}
	
	@Test
	public void testMultiplicaiton() {
		Multiplication mult = new Multiplication();
		assertEquals(mult.operate((double) 4, (double) 3), new Double(12));
		
		assertEquals(mult.operate((double) 34, (double) 0), new Double(0));
		
		assertEquals(mult.operate((double) 3, (double) -8), new Double(-24));
	}
	
	@Test
	public void testDivision() {
		Division div = new Division();
		assertEquals(div.operate((double) 6, (double) 2), (double) 3, (double) 0.1);
		
		assertEquals(div.operate((double) 25, (double) -2), (double) -12.5, (double) 0.1);
		
		assertEquals(div.operate((double) 0, (double) 15), (double) 0, (double) 0.1);
		
		assertTrue(Double.isInfinite(div.operate((double) 15, (double) 0)));
		
		assertTrue(Double.isNaN(div.operate((double) 0, (double) 0)));
	}

}
