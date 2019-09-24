package dad.javafx.check.palindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindrome extends Application {
	
	private TextField nombreText;
	private Button comprobarButton;
	private Label palindromoLabel;

	
	public void start(Stage primaryStage) throws Exception {
		
				
		nombreText = new TextField();
		nombreText.setPromptText("Introduce una sentencia");
		nombreText.setMaxWidth(150);
		
		comprobarButton = new Button("Comprobar");
		comprobarButton.setDefaultButton(true);
		
		comprobarButton.setOnAction(e -> onComprobarButtonAction(e));
		
		palindromoLabel = new Label();
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, comprobarButton, palindromoLabel);
		
		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("Comprobar palindromo");
		primaryStage.setScene(scene);
		primaryStage.show();
				
		

	}
	
	

	private void onComprobarButtonAction(ActionEvent e) {
		

		String cadenaInvertida = "";
		String palabra =  nombreText.getText();
        
	    for (int i=palabra.length()-1; i>=0;i--){
	        
	        cadenaInvertida = cadenaInvertida +palabra.charAt(i);
	    }
	    
	    if(palabra.equals(cadenaInvertida)){
	    	palindromoLabel.setText("Es  palindromo");
	    	palindromoLabel.setStyle("-fx-text-fill: green; ");
	    }else{
	    	palindromoLabel.setText("No es palindromo");
	    	palindromoLabel.setStyle("-fx-text-fill: red;");
	        
	    }
		
		
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

}
