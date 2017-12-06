package controller;
import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
/**
 * Mode Controller displays modes for players to choose and links to the Create Meme page
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public class ModeController implements EventHandler<ActionEvent> {

	/**
	 * A method that once "Free Play Mode"is clicked the game will take you to the free play mode
	 */
	@Override
	public void handle(ActionEvent arg0) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/CreateView.fxml"));
			Main.stage.setTitle("Free Play Mode");
			Main.stage.setScene(new Scene(root, 1100, 850));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();			
		}
		System.out.println("Free Play Clicked");
	}
	
	/**
	 * A method that will direct user to the tournament window and portion of the app once clicked
	 * @param event An event to occur
	 */
	public void tournamenthandle(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/pickPlayer.fxml"));
			Main.stage.setTitle("Tournament Mode");
			Main.stage.setScene(new Scene(root, 1000, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		System.out.println("Tournament Clicked");	
	}

	/**
	 * A method that will direct user to the Player vs Player window and portion of the app 
	 * @param event An event to occur
	 */
	public void playerhandle(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/pvp.fxml"));
			Main.stage.setTitle(" Player vs Player Mode");
			Main.stage.setScene(new Scene(root, 1000, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Player vs. Player Clicked");
	}	

}