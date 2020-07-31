package calculator307;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class CalcController {
	
	@FXML
	Label output;
	
	@FXML
	ComboBox<String> operators;
	
	@FXML
	TextField operand1;
	
	@FXML
	TextField operand2;
	
	public void handleSolveAction(ActionEvent event) {
		try {
			Double op1 = Double.parseDouble(operand1.getCharacters().toString());
			Double op2 = Double.parseDouble(operand2.getCharacters().toString());
			String op = operators.getValue().toString();
			Operator oper = OperatorFactory.getOperator(op);
			Double out = oper.operate(op1, op2);
			output.setText("= " + out.toString());
		}catch(Exception e) {
			output.setText("Invalid Args");
		}
	}
}
