package testCalculator307;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.*;

public class TestOperatorFactory {

	@Test
	public void testIsAddition() {
		assertTrue(OperatorFactory.getOperator("+") instanceof Addition);
	}
	
	@Test
	public void testIsSubtraction() {
		assertTrue(OperatorFactory.getOperator("-") instanceof Subtraction);
	}
	
	@Test
	public void testIsMultiplication() {
		assertTrue(OperatorFactory.getOperator("*") instanceof Multiplication);
	}
	
	@Test
	public void testIsDivision() {
		assertTrue(OperatorFactory.getOperator("/") instanceof Division);
	}

}
