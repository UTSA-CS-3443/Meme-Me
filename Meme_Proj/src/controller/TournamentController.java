package controller;
import model.*;
import java.util.ArrayList;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
/**
 * A class that determines the type of tournament based on the number of players placed 
 * into the player list 
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public class TournamentController implements EventHandler<ActionEvent> {
	TournamentRunnerModel tourn;
	public TournamentController(ArrayList<PlayerModel> playerlist) {
		super();
		 this.tourn = new TournamentRunnerModel(playerlist);
	}
	
	/**
	 * A method that decides the type of tournament based on the number of players  
	 */
	@Override
	public void handle(ActionEvent event) {
		
		try {
			Parent root;
			if (tourn.Tournament.length == 4) {
				root = FXMLLoader.load(getClass().getResource("../view/tourn4.fxml"));
			}else if(tourn.Tournament.length == 8) {
				root = FXMLLoader.load(getClass().getResource("../view/tourn8.fxml"));
			}else if(tourn.Tournament.length == 16) {
				root = FXMLLoader.load(getClass().getResource("../view/tourn16.fxml"));
			}else {
				root = FXMLLoader.load(getClass().getResource("../view/pickPlayer.fxml"));
			}
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
