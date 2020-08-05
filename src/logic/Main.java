package logic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//A simple JavaFX program that emulates a simple 4 function calculator
//Operands may be signed doubles, and operators may be *'/'+-
public class Main extends Application {
	
	private GridPane grid;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		grid = FXMLLoader.load(getClass().getResource("UIboundary.fxml"));
		Scene scene = new Scene(grid, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}