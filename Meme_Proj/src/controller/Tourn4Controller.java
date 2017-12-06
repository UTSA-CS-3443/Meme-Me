package controller;
import model.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.util.ArrayList;
import application.Main;

/**
 * A class that runs through all the players in a 4 player tournament and determines the players positions and a 
 * bye position based on the number of players
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 *
 */
public class Tourn4Controller implements EventHandler<ActionEvent>{
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
	private Button b21;
	@FXML 
	private Button b22;
	@FXML 
	private Button b31;
	@FXML
	private Button done;
	private ArrayList<PlayerModel> winners = new ArrayList<PlayerModel>();
	private int votes1, votes2;
	private PlayerModel bye = new PlayerModel("bye");
	int iMatch;
	int numBye;
	
	/**
	 * A method that determines a number of of byes by players entered in the game 
	 */
	@Override
	public void handle(ActionEvent event) {
		//set up
				if (this.numBye == 0) {
					this.tourn.matchNum = 1;
				}else if (this.numBye == 1) {
					this.tourn.matchNum = this.iMatch;	
				}
				
				if (this.tourn.Players4.get(0) == null) {
					b1.setText("bye");
				}else {
					b1.setText(this.tourn.Players4.get(0).getName());	
				}
				if (this.tourn.Players4.get(1) == null) {
					b2.setText("bye");
				}else {
					b2.setText(this.tourn.Players4.get(1).getName());	
				}if (this.tourn.Players4.get(2) == null) {
					b3.setText("bye");
				}else {
					b3.setText(this.tourn.Players4.get(2).getName());	
				}if (this.tourn.Players4.get(3) == null) {
					b4.setText("bye");
				}else {
					b4.setText(this.tourn.Players4.get(3).getName());	
				}
				if(this.tourn.roundNum == 1) {
					if(this.tourn.matchNum == 1) {
						
					}else if(this.tourn.matchNum == 2) {
						b21.setText(this.tourn.winners.get(0).name);
					}
				}else if(this.tourn.roundNum == 2) {
					if(this.tourn.matchNum == 1) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
					}
				}else if(this.tourn.roundNum == 3) {
					b21.setText(this.tourn.winners.get(0).name);
					b22.setText(this.tourn.winners.get(1).name);
					b31.setText(this.tourn.winners.get(2).name);
				}
	}
	
	/**
	 * A method that will 
	 * @param event
	 */
	public void goHandle(ActionEvent event) {
		if(this.tourn.roundNum == 1) {
			if (this.tourn.matchNum == 1) {
				if(this.tourn.Players4.get(0) == null) {
					this.tourn.Match[0] = this.bye;
					this.tourn.Match[1] = this.tourn.Players4.get(1);
				}else if(this.tourn.Players4.get(1) == null) {
					this.tourn.Match[0] = this.tourn.Players4.get(0);
					this.tourn.Match[1] = this.bye;
				}else {
					this.tourn.Match[0] = this.tourn.Players4.get(0);
					this.tourn.Match[1] = this.tourn.Players4.get(1);
				}
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 2) {
				
				if(this.tourn.Players4.get(2) == null) {
					this.tourn.Match[2] = this.bye;
					this.tourn.Match[3] = this.tourn.Players4.get(3);
				}else if(this.tourn.Players4.get(3) == null) {
					this.tourn.Match[2] = this.tourn.Players4.get(2);
					this.tourn.Match[3] = this.bye;
				}else {
					this.tourn.Match[2] = this.tourn.Players4.get(2);
					this.tourn.Match[3] = this.tourn.Players4.get(3);
				}
				
				this.tourn.RunRound();
			}
			}else if(this.tourn.roundNum == 2) {
				if(this.tourn.matchNum == 1) {
					this.tourn.Match[0] = this.tourn.winners.get(0);
					this.tourn.Match[1] = this.tourn.winners.get(1);
					this.tourn.RunRound();
				}
	
			}
		
	}
	public void setUser(ArrayList<PlayerModel> players) {
		System.out.println(players.size());
		this.playerlist = players;
		this.tourn = new TournamentRunnerModel2(players, this.winners);
	}
	public void setUser(ArrayList<PlayerModel> players, int roundNum) {
		System.out.println(players.size());
		this.playerlist = players;
		this.tourn = new TournamentRunnerModel2(players, this.winners, roundNum, this.iMatch);
		this.iMatch = this.tourn.matchNum;
	}
	public void setUser2(int vote1, int vote2) {
		this.votes1 = vote1;
		this.votes2 = vote2;
	}
	public void setUser3(PlayerModel winner) {
		this.winners.add(winner);
	}
	public void setUser4(int match, int numBye) {
		this.iMatch = match;
		this.numBye = numBye;
	}
	public void setUser5(int roundNum) {
		this.tourn.roundNum = roundNum;
	}
	public void setUser6(ArrayList<PlayerModel> winnerList) {
		this.tourn.winners = winnerList;
		
	}
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
