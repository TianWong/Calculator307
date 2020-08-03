package calculator307;

public class OperatorFactory {
	public static Operator getOperator(String input) {
		Operator op = null;
		if(input.equals("+")) {
			op = new Addition();
		}else if(input.equals("-")) {
			op = new Subtraction();
		}else if(input.equals("*")) {
			op = new Multiplication();
		}else if(input.equals("/")) {
			op = new Division();
		}else if(input.equals("log")) {
			op = new Logarithm();
		}
		return op;
	}
}
