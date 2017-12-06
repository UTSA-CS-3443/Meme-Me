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
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson 
 * 
 */
public class ByeController implements EventHandler<ActionEvent> {

	public PlayerModel play1;
	public PlayerModel play2;
	private ArrayList<PlayerModel> players = new ArrayList<PlayerModel>();
	TournamentRunnerModel2 tourn;
	int iMatch;
	int numRound;
	ArrayList<PlayerModel> winnerList = new ArrayList<PlayerModel>();
	int sizeTourn;
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
			if (this.play1.getName().equals("bye")) {
				//controller.setUser3(this.play2);
				this.winnerList.add(play2);
			}else {
				//controller.setUser3(this.play1);
				this.winnerList.add(play1);
			}
			controller.setUser4(this.winnerList);
			controller.setUser3(this.players, this.iMatch, this.sizeTourn);
			controller.setUser2(this.numRound);
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	/**
	 * If button "no" is clicked then user will move on to next match automatically
	 * @param event Event to occur once clicked
	 */
	public void noHandle(ActionEvent event) {
		if(this.sizeTourn == 4) {
			Parent root;
			
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn4.fxml"));
				root = (Parent)fxmlLoader.load();
				Tourn4Controller controller = fxmlLoader.<Tourn4Controller>getController();
				if (this.play1.getName().equals("bye")) {
					//controller.setUser3(this.play2);
					this.winnerList.add(play2);
				}else {
					//controller.setUser3(this.play1);
					this.winnerList.add(play1);
				}
				//this.tourn = new TournamentRunnerModel2(this.players, this.iMatch, this.winnerList);
				controller.setUser4(this.iMatch, 1);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}else if(this.sizeTourn == 8) {
			Parent root;
			
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn8.fxml"));
				root = (Parent)fxmlLoader.load();
				Tourn8Controller controller = fxmlLoader.<Tourn8Controller>getController();
				if (this.play1.getName().equals("bye")) {
					//controller.setUser3(this.play2);
					this.winnerList.add(play2);
				}else {
					//controller.setUser3(this.play1);
					this.winnerList.add(play1);
				}
				//this.tourn = new TournamentRunnerModel2(this.players, this.iMatch, this.winnerList);
				controller.setUser4(this.iMatch, 1);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}else if(this.sizeTourn == 16) {
			Parent root;
			
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn16.fxml"));
				root = (Parent)fxmlLoader.load();
				Tourn16Controller controller = fxmlLoader.<Tourn16Controller>getController();
				if (this.play1.getName().equals("bye")) {
					//controller.setUser3(this.play2);
					this.winnerList.add(play2);
				}else {
					//controller.setUser3(this.play1);
					this.winnerList.add(play1);
				}
				//this.tourn = new TournamentRunnerModel2(this.players, this.iMatch, this.winnerList);
				controller.setUser4(this.iMatch, 1);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}		
	}

	/**
	 *  Set user 3 in player list and gives a match number to them
	 * @param playerlist An arrayList of players
	 * @param matchNum An integer to match player numbers
	 */

	public void setUser3(ArrayList<PlayerModel> playerlist, int matchNum, int size) {

		this.players = playerlist;
		this.iMatch = matchNum;
		this.sizeTourn = size;
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
	public void setUser4(ArrayList<PlayerModel> winners) {
		this.winnerList = winners;
	}
	public void setUser5(int numRound) {
		this.numRound = numRound;
	}
}
