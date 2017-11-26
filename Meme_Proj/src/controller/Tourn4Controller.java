package controller;
import model.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.ArrayList;
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
	private Button b5;
	@FXML 
	private Button b6;
	@FXML 
	private Button b7;
	private ArrayList<PlayerModel> winners = new ArrayList<PlayerModel>();
	private int votes1, votes2;
	private PlayerModel bye = new PlayerModel("bye");
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		//set up
			
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
				if(this.tourn.roundNum == 1 && this.tourn.matchNum == 0) {
					this.tourn.matchNum = 1;
				}else if(this.tourn.roundNum == 1 && this.tourn.matchNum == 1) {
					b5.setText(winners.get(0).getName());
				}else if(this.tourn.roundNum == 1 && this.tourn.matchNum == 2) {
					b6.setText(winners.get(1).getName());
				}else if(this.tourn.roundNum == 2 && this.tourn.matchNum == 1) {
					b7.setText(winners.get(2).getName());
				}
				
	}
	public void goHandle(ActionEvent event) {
		//this.bye.setName("bye");
		
		if(this.tourn.roundNum == 1) {
			if (this.tourn.matchNum == 1) {
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
				//this.tourn.matchNum++;
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
				b5.setText(this.winners.get(0).getName());
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
				if(this.tourn.Players4.get(2) == null) {
					this.tourn.Match[2] = this.bye;
					this.tourn.Match[3] = this.tourn.Players4.get(3);
				}else if(this.tourn.Players4.get(1) == null) {
					this.tourn.Match[2] = this.tourn.Players4.get(2);
					this.tourn.Match[3] = this.bye;
				}else {
					this.tourn.Match[2] = this.tourn.Players4.get(2);
					this.tourn.Match[3] = this.tourn.Players4.get(3);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.roundNum == 2) {
				if(this.tourn.matchNum == 1) {
					b5.setText(winners.get(0).getName());
					b6.setText(winners.get(1).getName());
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
					this.tourn.matchNum++;
				
			//}else if(this.tourn.roundNum == 2) {
					this.tourn.Match[0] = this.winners.get(0);
					this.tourn.Match[1] = this.winners.get(1);
					this.tourn.RunRound();
				}else if(this.tourn.matchNum == 2){
					b5.setText(winners.get(0).getName());
					b6.setText(winners.get(1).getName());
					b7.setText(winners.get(2).getName());
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
					this.tourn.matchNum = 1;
			}
			}
		}
		
		
		
		
		
	}
	public void setUser(ArrayList<PlayerModel> players) {
		System.out.println(players.size());
		this.playerlist = players;
		tourn = new TournamentRunnerModel2(players);
	}
	public void setUser2(int vote1, int vote2) {
		this.votes1 = vote1;
		this.votes2 = vote2;
	}
	public void setUser3(PlayerModel winner) {
		this.winners.add(winner);
	}

}
