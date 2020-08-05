package logic;

public class Addition implements Operator {

	@Override
	public Double operate(Double a, Double b) {
		return a + b;
	}

}
