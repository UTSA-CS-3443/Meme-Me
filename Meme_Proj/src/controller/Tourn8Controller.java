package controller;

import java.util.ArrayList;
import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.PlayerModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Tourn8Controller implements EventHandler<ActionEvent>{

	ArrayList<PlayerModel> playerlist = new ArrayList<PlayerModel>();
	
	TournamentRunnerModel2 tourn;
	
	//= new TournamentRunnerModel2(playerlist, this.winners);
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
	private int votes1, votes2;
	private PlayerModel bye = new PlayerModel("bye");
	int iMatch;
	int numBye;
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
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
	public void goHandle(ActionEvent event) {
		//this.bye.setName("bye");
		if(this.tourn.roundNum == 1) {
			if (this.tourn.matchNum == 1) {
				//this.tourn.matchNum++;
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
