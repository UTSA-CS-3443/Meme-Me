
package controller;


import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ModeController implements EventHandler<ActionEvent> {
	
	private	Button Free;
	private	Button Tournament;
	private	Button PlayervsPlayer;
	
	@Override
	public void handle(ActionEvent arg0) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/CreateView.fxml"));
			Main.stage.setTitle("Create Your Meme");
			Main.stage.setScene(new Scene(root, 1000, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Free Play Clicked");
	}
	
	//STILL NEEDS WORK
	
	public void tournamenthandle(ActionEvent event) {
		System.out.println("Tournament Clicked");
		
	}
	//STILL NEEDS WORK
	public void playerhandle(ActionEvent event) {
		System.out.println("Player vs. Player Clicked");
	}
	

}