package model;

import java.util.ArrayList;

import application.Main;
import controller.ChoosePic;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * 
 * This class defines the methods for how a tournament is run.
 * It is an extension of the bracket model.
 * @author Katie Yarbough: Team Lead5
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 *
 */
public class TournamentRunnerModel extends BracketModel {

	public int CurrentMatch;		//current match being played
	public int CurrentRound;		//current round being played
	
	/**
	 * Constructor that describes a tournament runner mode based on players
	 * @param players An array list of players
	 */
	public TournamentRunnerModel(ArrayList<PlayerModel> players) {
		super(players);
	}

	
	/**
	 * A method that calls RunRound method for each round and increases each round by one
	 * Returns when current round number is greater than round in tournament
	 */
	public void RunTournament() {		
		//TODO may need to set all player total votes to 0
	
		for(this.CurrentRound=0; 
				this.CurrentRound<this.Matches.length; this.CurrentRound++) {
			RunRound();
		}
		//successbaby.jpg
		return;
	}
	
	/**
	 * Calls RunMatch method, when match number exceeds players in match array
	 * push all remaining players up the tournament bracket
	 * Updates tournament bracket
	 */
	private void RunRound() {
		
		//call RunMatch method	
		for(this.CurrentMatch=0; 
				this.Matches[this.CurrentMatch]>1; this.CurrentMatch++) {
			RunMatch();
		}
		
		//iterators for making the updated tournament array
		int j=0;
		PlayerModel[] newTournament = new PlayerModel[Matches[CurrentRound]];
		
		for(int index=0; index<this.Tournament.length; index++) {
			if(this.Tournament[index] == null)
				continue;
			else {
				newTournament[j] = this.Tournament[index];
				j++;
			}
		}
		this.Tournament = newTournament;		
		return;
	}
	
	/**
	 * Defines players in match for ease of use later
	 * Redirects user to vote page
	 */
	private void RunMatch() {
		PlayerModel player1 = this.Tournament[this.CurrentMatch];
		PlayerModel player2 = this.Tournament[this.CurrentMatch+1];
		
		try {
			Parent root;
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Vote.fxml")); 
			root = (Parent)fxmlLoader.load(); 
			ChoosePic controller = fxmlLoader.<ChoosePic>getController();
			controller.setUser2(player1, player2);
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		return;
	}
	/**
	 * Compares votes and advance players to the next round 
	 * tie breaker is total votes per player
	 * Resets the vote count for the next round and increments total vote counts
	 * @param player1 This player based from player model 
	 * @param player2 This player based from PlayerModel
	 * @return
	 */
	private boolean ChooseWinner(PlayerModel player1, PlayerModel player2) {
		//One does not simply choose a winner...
		boolean player1wins = false;
		if(player1.votes == player2.votes) {			
			//player 1 wins
			if(player1.totalVotes >= player2.totalVotes) {
				this.Tournament[this.CurrentMatch+1] = null;
				player1wins = true;
			}
			//player 2 wins
			else
				this.Tournament[this.CurrentMatch] = null;
		}
				
		if(player1.votes >= player2.votes) {
			//player 1 wins
			this.Tournament[this.CurrentMatch+1] = null;
			player1wins = true;
		}
				
		else {
			//player2 wins
			this.Tournament[this.CurrentMatch] = null;
		}
		player1.totalVotes = 0;
		player2.totalVotes = 0;
			
		player1.votes = 0;
		player2.votes = 0;
		
		return player1wins;
	}
	
}
