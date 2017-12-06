package controller;

import java.util.ArrayList;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import model.PlayerModel;

/**
 * A class that runs through all the players in a 8 player tournament and determines the players positions and a 
 * bye position based on the number of players
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 *
 */
public class Tourn8Controller implements EventHandler<ActionEvent>{

	ArrayList<PlayerModel> playerlist = new ArrayList<PlayerModel>();	
	TournamentRunnerModel2 tourn;	
	@FXML 
	private Button b1;
	@FXML 
	private Button b2;
	@FXML 
	private Button b3;
	@FXML 
	private Button b4;
	@FXML 
	private Button b5;
	@FXML 
	private Button b6;
	@FXML 
	private Button b7;
	@FXML 
	private Button b8;
	@FXML 
	private Button b21;
	@FXML 
	private Button b22;
	@FXML 
	private Button b23;
	@FXML 
	private Button b24;
	@FXML 
	private Button b31;
	@FXML 
	private Button b32;
	@FXML 
	private Button b41;
	@FXML
	private Button done;
	private ArrayList<PlayerModel> winners = new ArrayList<PlayerModel>();
	@SuppressWarnings("unused")
	private int votes1, votes2;
	private PlayerModel bye = new PlayerModel("bye");
	int iMatch;
	int numBye;
	/**
	 * A method that determines a number of of byes by players entered in the game, 
	 * sets the players names in game positions  
	 */
	public void handle(ActionEvent event) {
		//set up
				if (this.numBye == 0) {
					this.tourn.matchNum = 1;
				}else if (this.numBye == 1) {
					this.tourn.matchNum = this.iMatch;	
				}
				
				if (this.tourn.Players8.get(0) == null) {
					b1.setText("bye");
				}else {
					b1.setText(this.tourn.Players8.get(0).name);	
				}
				if (this.tourn.Players8.get(1) == null) {
					b2.setText("bye");
				}else {
					b2.setText(this.tourn.Players8.get(1).name);	
				}if (this.tourn.Players8.get(2) == null) {
					b3.setText("bye");
				}else {
					b3.setText(this.tourn.Players8.get(2).name);	
				}if (this.tourn.Players8.get(3) == null) {
					b4.setText("bye");
				}else {
					b4.setText(this.tourn.Players8.get(3).name);	
				}if (this.tourn.Players8.get(4) == null) {
					b5.setText("bye");
				}else {
					b5.setText(this.tourn.Players8.get(4).name);	
				}if (this.tourn.Players8.get(5) == null) {
					b6.setText("bye");
				}else {
					b6.setText(this.tourn.Players8.get(5).name);	
				}if (this.tourn.Players8.get(6) == null) {
					b7.setText("bye");
				}else {
					b7.setText(this.tourn.Players8.get(6).name);	
				}if (this.tourn.Players8.get(7) == null) {
					b8.setText("bye");
				}else {
					b8.setText(this.tourn.Players8.get(7).name);	
				}
				if(this.tourn.roundNum == 1){
					if (this.tourn.matchNum == 1) {
						
					}else if (this.tourn.matchNum == 2) {
						b21.setText(this.tourn.winners.get(0).name);
					}else if(this.tourn.matchNum == 3) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
					}else if(this.tourn.matchNum == 4) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
					}
				}else if(this.tourn.roundNum == 2) {
					if(this.tourn.matchNum == 1) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
					}else if(this.tourn.matchNum == 2) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b31.setText(this.tourn.winners.get(4).name);
					}
				}else if(this.tourn.roundNum == 3) {
					if(this.tourn.matchNum == 1) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b31.setText(this.tourn.winners.get(4).name);
						b32.setText(this.tourn.winners.get(5).name);
					}
				}else if(this.tourn.roundNum == 4) {
					b21.setText(this.tourn.winners.get(0).name);
					b22.setText(this.tourn.winners.get(1).name);
					b23.setText(this.tourn.winners.get(2).name);
					b24.setText(this.tourn.winners.get(3).name);
					b31.setText(this.tourn.winners.get(4).name);
					b32.setText(this.tourn.winners.get(5).name);
					b41.setText(this.tourn.winners.get(6).name);
				}
				
	}
	/**
	 * A method that will place player into their match positions and place them into their advancing placements.
	 * @param event An event to occur
	 */
	public void goHandle(ActionEvent event) {
		if(this.tourn.roundNum == 1) {
			if (this.tourn.matchNum == 1) {
				if(this.tourn.Players8.get(0) == null) {
					this.tourn.Match[0] = this.bye;
					this.tourn.Match[1] = this.tourn.Players8.get(1);
				}else if(this.tourn.Players8.get(1) == null) {
					this.tourn.Match[0] = this.tourn.Players8.get(0);
					this.tourn.Match[1] = this.bye;
				}else {
					this.tourn.Match[0] = this.tourn.Players8.get(0);
					this.tourn.Match[1] = this.tourn.Players8.get(1);
				}
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 2) {
				
				if(this.tourn.Players8.get(2) == null) {
					this.tourn.Match[2] = this.bye;
					this.tourn.Match[3] = this.tourn.Players8.get(3);
				}else if(this.tourn.Players8.get(3) == null) {
					this.tourn.Match[2] = this.tourn.Players8.get(2);
					this.tourn.Match[3] = this.bye;
				}else {
					this.tourn.Match[2] = this.tourn.Players8.get(2);
					this.tourn.Match[3] = this.tourn.Players8.get(3);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 3) {
				
				if(this.tourn.Players8.get(4) == null) {
					this.tourn.Match[4] = this.bye;
					this.tourn.Match[5] = this.tourn.Players8.get(5);
				}else if(this.tourn.Players8.get(5) == null) {
					this.tourn.Match[4] = this.tourn.Players8.get(4);
					this.tourn.Match[5] = this.bye;
				}else {
					this.tourn.Match[4] = this.tourn.Players8.get(4);
					this.tourn.Match[5] = this.tourn.Players8.get(5);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 4) {
				
				if(this.tourn.Players8.get(6) == null) {
					this.tourn.Match[6] = this.bye;
					this.tourn.Match[7] = this.tourn.Players8.get(7);
				}else if(this.tourn.Players8.get(7) == null) {
					this.tourn.Match[6] = this.tourn.Players8.get(6);
					this.tourn.Match[7] = this.bye;
				}else {
					this.tourn.Match[6] = this.tourn.Players8.get(6);
					this.tourn.Match[7] = this.tourn.Players8.get(7);
				}
				
				this.tourn.RunRound();
			}
			}else if(this.tourn.roundNum == 2) {
				if(this.tourn.matchNum == 1) {
					this.tourn.Match[0] = this.tourn.winners.get(0);
					this.tourn.Match[1] = this.tourn.winners.get(1);
					this.tourn.RunRound();
					
				}else if(this.tourn.matchNum == 2) {
					this.tourn.Match[2] = this.tourn.winners.get(2);
					this.tourn.Match[3] = this.tourn.winners.get(3);
					this.tourn.RunRound();
				}
				}else if(this.tourn.roundNum == 3) {
					if(this.tourn.matchNum == 1) {
						this.tourn.Match[0] = this.tourn.winners.get(4);
						this.tourn.Match[1] = this.tourn.winners.get(5);
						this.tourn.RunRound();
					}
		
				}
	
		
	}
	/**
	 * A method that places the players into the players list and places them into the 8 player tournament
	 * @param players An array list reference call to the PlayerModel
	 */
	public void setUser(ArrayList<PlayerModel> players) {
		System.out.println(players.size());
		this.playerlist = players;
		this.tourn = new TournamentRunnerModel2(players, this.winners);
	}
	/**
	 * A method that places the players into the players list, places them into the 8 player tournament
	 * and sets them to a players to a round in the tournament in which they are advancing to
	 * @param players A reference to an arrayList built from PlayerModel
	 * @param roundNum An integer specifying the round number
	 */
	public void setUser(ArrayList<PlayerModel> players, int roundNum) {
		System.out.println(players.size());
		this.playerlist = players;
		this.tourn = new TournamentRunnerModel2(players, this.winners, roundNum, this.iMatch);
		this.iMatch = this.tourn.matchNum;
	}
	/**
	 * A method that will set the votes to integer value
	 * @param vote1 An integer specifying the number of votes for vote1
	 * @param vote2 An integer specifying the number of votes for vote2
	 */
	public void setUser2(int vote1, int vote2) {
		this.votes1 = vote1;
		this.votes2 = vote2;
	}
	
	/**
	 * A method that will add the winner to the winner's circle
	 * @param winner A reference to the PlayerModel for this winner
	 */
	public void setUser3(PlayerModel winner) {
		this.winners.add(winner);
	}
	/**
	 * A method to set an integer to the game matches and number of byes 
	 * @param match An integer specifying the match 
	 * @param numBye An integer specifying number of byes
	 */
	public void setUser4(int match, int numBye) {
		this.iMatch = match;
		this.numBye = numBye;
	}
	/**
	 * A method to set an integer to a game round number
	 * @param roundNum An integer specifying the round number  
	 */
	public void setUser5(int roundNum) {
		this.tourn.roundNum = roundNum;
	}
	/**
	 * A method to set winners in the winner list within tournament
	 * @param winnerList A reference to an array list based on Player Model
	 */
	public void setUser6(ArrayList<PlayerModel> winnerList) {
		this.tourn.winners = winnerList;
		
	}
	/**
	 * A function to direct winner of tournament to congratulations  page
	 * @param event An event to occur
	 */
	public void doneFunction(ActionEvent event) {
		 		try {
		 			Parent root = FXMLLoader.load(getClass().getResource("../view/Congrats.fxml"));
		 			Main.stage.setScene(new Scene(root, 700, 600));
		 			Main.stage.show();
		 		} catch(Exception e) {
		 			e.printStackTrace();
		 		}
	}

}
