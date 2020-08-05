package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		List<String> binary = new ArrayList<>(Arrays.asList("+", "-", "*", "/")); 
		try {
			String op = operators.getValue().toString();
			Double op1 = new Double(0);
			if(binary.contains(op)) {
				op1 = Double.parseDouble(operand1.getCharacters().toString());
			}
			Double op2 = Double.parseDouble(operand2.getCharacters().toString());
			
			Operator oper = OperatorFactory.getOperator(op);
			Double out = oper.operate(op1, op2);
			output.setText("= " + out.toString());
		}catch(Exception e) {
			output.setText("Invalid Args");
		}
	}
}
