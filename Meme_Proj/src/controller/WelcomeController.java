package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import application.Main;
/**
 * A controller class that directs the user to Mode page from Welcome page 
 * @author Katie Yarbough: Team Lead5
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 *
 */
public class WelcomeController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Mode.fxml"));
			Main.stage.setTitle("Mode");
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.setTitle("Choose your Player Mode");
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
