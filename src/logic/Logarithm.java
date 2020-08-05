package logic;

import java.lang.Math;

public class Logarithm implements Operator {

	@Override
	public Double operate(Double a, Double b) {
		return Math.log10(b);
	}

}
