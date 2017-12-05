package controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.PlayerModel;

/** 
 * A bye, when less than 4 players wish to compete in a 4 player tournament or less than 8 players compete in a 8 player 
 * or less than 16 compete than a 16 player tournament then a bye is create for the null seat not being participated in 
 * A player is prompted if they wish to create a meme for fun, if yes then they create a meme, if no then advance forward,
 * regardless of their choice they willgo on to the next round 
 *
 */
public class ByeController implements EventHandler<ActionEvent> {

	public PlayerModel play1;
	public PlayerModel play2;
	private ArrayList<PlayerModel> players = new ArrayList<PlayerModel>();
	TournamentRunnerModel2 tourn;
	int iMatch;
	@Override
	public void handle(ActionEvent event) {
		// leave blank to satisfy implementation
		
	}
	/**
	 * If button "yes" is clicked then user will be able to create a meme for fun
	 * @param event Event to occur once clicked
	 */
	public void yesHandle(ActionEvent event) {
		Parent root;
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/byecreate.fxml"));
			root = (Parent)fxmlLoader.load();
			CreateByeController controller = fxmlLoader.<CreateByeController>getController();
			controller.setUser2(this.play1, this.play2);
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**
	 * If button "no" is clicked then user will move on to next match automatically
	 * @param event Event to occur once clicked
	 */
	public void noHandle(ActionEvent event) {
		Parent root;
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn4.fxml"));
			root = (Parent)fxmlLoader.load();
			Tourn4Controller controller = fxmlLoader.<Tourn4Controller>getController();
			if (this.play1.getName().equals("bye")) {
				controller.setUser3(this.play2);
			}else {
				controller.setUser3(this.play1);
			}
			controller.setUser4(this.tourn.matchNum, 1);
			controller.setUser(this.players);
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	/**
	 *  Set user 3 in player list and gives a match number to them
	 * @param playerlist An arrayList of players
	 * @param matchNum An integer to match player numbers
	 */
	public void setUser3(ArrayList<PlayerModel> playerlist, int matchNum) {
		this.players = playerlist;
		this.tourn = new TournamentRunnerModel2(playerlist, matchNum++);
		//this.iMatch = matchNum;
	}
	/**
	 * Set user 2 in player list and gives a match number to them 
	 * @param player1 A reference to a player object in PlayerModel
	 * @param player2 A reference to a player object in PlayerModel
	 */
	public void setUser2(PlayerModel player1, PlayerModel player2) {
		this.play1 = player1;
		this.play2 = player2;
	}
}
