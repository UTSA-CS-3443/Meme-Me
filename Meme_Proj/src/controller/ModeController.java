
package controller;


import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ModeController implements EventHandler<ActionEvent> {
	
	
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
		//System.out.println("Free Play Clicked");
	}
	//STILL NEEDS WORK
	
	public void tournamenthandle(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/pickPlayer.fxml"));
			Main.stage.setScene(new Scene(root, 1000, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//STILL NEEDS WORK
	public void playerhandle(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/pvp.fxml"));
			Main.stage.setScene(new Scene(root, 1000, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Player vs. Player Clicked");
	}
	

}