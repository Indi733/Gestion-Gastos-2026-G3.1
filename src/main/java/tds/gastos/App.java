package tds.gastos;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	
	 @Override
	public void start(Stage primaryStage) throws Exception {
		 
		 
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); 
		Scene miEscena = new Scene(root);

        
        primaryStage.setTitle("Mi primera ventana en JavaFX");
        primaryStage.setScene(miEscena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
