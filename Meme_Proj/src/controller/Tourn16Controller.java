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

public class Tourn16Controller implements EventHandler<ActionEvent>{
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
	private Button b9;
	@FXML 
	private Button b10;
	@FXML 
	private Button b11;
	@FXML 
	private Button b12;
	@FXML 
	private Button b13;
	@FXML 
	private Button b14;
	@FXML 
	private Button b15;
	@FXML 
	private Button b16;
	@FXML 
	private Button b21;
	@FXML 
	private Button b22;
	@FXML 
	private Button b23;
	@FXML 
	private Button b24;
	@FXML 
	private Button b25;
	@FXML 
	private Button b26;
	@FXML 
	private Button b27;
	@FXML 
	private Button b28;
	@FXML 
	private Button b31;
	@FXML 
	private Button b32;
	@FXML 
	private Button b33;
	@FXML 
	private Button b34;
	@FXML 
	private Button b41;
	@FXML 
	private Button b42;
	@FXML 
	private Button b51;
	@FXML
	private Button done;
	private ArrayList<PlayerModel> winners = new ArrayList<PlayerModel>();
	private int votes1, votes2;
	private PlayerModel bye = new PlayerModel("bye");
	int iMatch;
	int numBye;
	public void handle(ActionEvent event) {
		//set up
				if (this.numBye == 0) {
					this.tourn.matchNum = 1;
				}else if (this.numBye == 1) {
					this.tourn.matchNum = this.iMatch;	
				}
				
				if (this.tourn.Players16.get(0) == null) {
					b1.setText("bye");
				}else {
					b1.setText(this.tourn.Players16.get(0).name);	
				}
				if (this.tourn.Players16.get(1) == null) {
					b2.setText("bye");
				}else {
					b2.setText(this.tourn.Players16.get(1).name);	
				}if (this.tourn.Players16.get(2) == null) {
					b3.setText("bye");
				}else {
					b3.setText(this.tourn.Players16.get(2).name);	
				}if (this.tourn.Players16.get(3) == null) {
					b4.setText("bye");
				}else {
					b4.setText(this.tourn.Players16.get(3).name);	
				}if (this.tourn.Players16.get(4) == null) {
					b5.setText("bye");
				}else {
					b5.setText(this.tourn.Players16.get(4).name);	
				}if (this.tourn.Players16.get(5) == null) {
					b6.setText("bye");
				}else {
					b6.setText(this.tourn.Players16.get(5).name);	
				}if (this.tourn.Players16.get(6) == null) {
					b7.setText("bye");
				}else {
					b7.setText(this.tourn.Players16.get(6).name);	
				}if (this.tourn.Players16.get(7) == null) {
					b8.setText("bye");
				}else {
					b8.setText(this.tourn.Players16.get(7).name);	
				}if (this.tourn.Players16.get(8) == null) {
					b9.setText("bye");
				}else {
					b9.setText(this.tourn.Players16.get(8).name);	
				}if (this.tourn.Players16.get(9) == null) {
					b10.setText("bye");
				}else {
					b10.setText(this.tourn.Players16.get(9).name);	
				}if (this.tourn.Players16.get(10) == null) {
					b11.setText("bye");
				}else {
					b11.setText(this.tourn.Players16.get(10).name);	
				}if (this.tourn.Players16.get(11) == null) {
					b12.setText("bye");
				}else {
					b12.setText(this.tourn.Players16.get(11).name);	
				}if (this.tourn.Players16.get(12) == null) {
					b13.setText("bye");
				}else {
					b13.setText(this.tourn.Players16.get(12).name);	
				}if (this.tourn.Players16.get(13) == null) {
					b14.setText("bye");
				}else {
					b14.setText(this.tourn.Players16.get(13).name);	
				}if (this.tourn.Players16.get(14) == null) {
					b15.setText("bye");
				}else {
					b15.setText(this.tourn.Players16.get(14).name);	
				}if (this.tourn.Players16.get(15) == null) {
					b16.setText("bye");
				}else {
					b16.setText(this.tourn.Players16.get(15).name);	
				}				
				
				if(this.tourn.roundNum == 1){
					if (this.tourn.matchNum == 1) {
						
					}else if(this.tourn.matchNum == 2) {
						b21.setText(this.tourn.winners.get(0).name);
					}else if(this.tourn.matchNum == 3) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
					}else if(this.tourn.matchNum == 4) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
					}else if(this.tourn.matchNum == 5) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
					}else if(this.tourn.matchNum == 6) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
					}else if(this.tourn.matchNum == 7) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
					}else if(this.tourn.matchNum == 8) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
					}
					
				}else if(this.tourn.roundNum == 2) {
					if(this.tourn.matchNum == 1) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
					}else if(this.tourn.matchNum == 2) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
					}else if(this.tourn.matchNum == 3) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
						b32.setText(this.tourn.winners.get(9).name);
					}else if(this.tourn.matchNum == 4) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
						b32.setText(this.tourn.winners.get(9).name);
						b33.setText(this.tourn.winners.get(10).name);
					}
				}else if(this.tourn.roundNum == 3) {
					if(this.tourn.matchNum == 1) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
						b32.setText(this.tourn.winners.get(9).name);
						b33.setText(this.tourn.winners.get(10).name);
						b34.setText(this.tourn.winners.get(11).name);
					}else if(this.tourn.matchNum == 2) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
						b32.setText(this.tourn.winners.get(9).name);
						b33.setText(this.tourn.winners.get(10).name);
						b34.setText(this.tourn.winners.get(11).name);
						b41.setText(this.tourn.winners.get(12).name);
					}
				}else if(this.tourn.roundNum == 4) {
					if(this.tourn.matchNum == 1) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
						b32.setText(this.tourn.winners.get(9).name);
						b33.setText(this.tourn.winners.get(10).name);
						b34.setText(this.tourn.winners.get(11).name);
						b41.setText(this.tourn.winners.get(12).name);
						b42.setText(this.tourn.winners.get(13).name);
					}
				}else if(this.tourn.roundNum == 5) {
						b21.setText(this.tourn.winners.get(0).name);
						b22.setText(this.tourn.winners.get(1).name);
						b23.setText(this.tourn.winners.get(2).name);
						b24.setText(this.tourn.winners.get(3).name);
						b25.setText(this.tourn.winners.get(4).name);
						b26.setText(this.tourn.winners.get(5).name);
						b27.setText(this.tourn.winners.get(6).name);
						b28.setText(this.tourn.winners.get(7).name);
						b31.setText(this.tourn.winners.get(8).name);
						b32.setText(this.tourn.winners.get(9).name);
						b33.setText(this.tourn.winners.get(10).name);
						b34.setText(this.tourn.winners.get(11).name);
						b41.setText(this.tourn.winners.get(12).name);
						b42.setText(this.tourn.winners.get(13).name);
						b51.setText(this.tourn.winners.get(14).name);
				}
				
	}
	public void goHandle(ActionEvent event) {
		//this.bye.setName("bye");
		if(this.tourn.roundNum == 1) {
			if (this.tourn.matchNum == 1) {
				//this.tourn.matchNum++;
				if(this.tourn.Players16.get(0) == null) {
					this.tourn.Match[0] = this.bye;
					this.tourn.Match[1] = this.tourn.Players16.get(1);
				}else if(this.tourn.Players16.get(1) == null) {
					this.tourn.Match[0] = this.tourn.Players16.get(0);
					this.tourn.Match[1] = this.bye;
				}else {
					this.tourn.Match[0] = this.tourn.Players16.get(0);
					this.tourn.Match[1] = this.tourn.Players16.get(1);
				}
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 2) {
				
				if(this.tourn.Players16.get(2) == null) {
					this.tourn.Match[2] = this.bye;
					this.tourn.Match[3] = this.tourn.Players16.get(3);
				}else if(this.tourn.Players16.get(3) == null) {
					this.tourn.Match[2] = this.tourn.Players16.get(2);
					this.tourn.Match[3] = this.bye;
				}else {
					this.tourn.Match[2] = this.tourn.Players16.get(2);
					this.tourn.Match[3] = this.tourn.Players16.get(3);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 3) {
				
				if(this.tourn.Players16.get(4) == null) {
					this.tourn.Match[4] = this.bye;
					this.tourn.Match[5] = this.tourn.Players16.get(5);
				}else if(this.tourn.Players16.get(5) == null) {
					this.tourn.Match[4] = this.tourn.Players16.get(4);
					this.tourn.Match[5] = this.bye;
				}else {
					this.tourn.Match[4] = this.tourn.Players16.get(4);
					this.tourn.Match[5] = this.tourn.Players16.get(5);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 4) {
				
				if(this.tourn.Players16.get(6) == null) {
					this.tourn.Match[6] = this.bye;
					this.tourn.Match[7] = this.tourn.Players16.get(7);
				}else if(this.tourn.Players16.get(7) == null) {
					this.tourn.Match[6] = this.tourn.Players16.get(6);
					this.tourn.Match[7] = this.bye;
				}else {
					this.tourn.Match[6] = this.tourn.Players16.get(6);
					this.tourn.Match[7] = this.tourn.Players16.get(7);
				}
				
				this.tourn.RunRound();
			}else if (this.tourn.matchNum == 5) {
				//this.tourn.matchNum++;
				if(this.tourn.Players16.get(8) == null) {
					this.tourn.Match[8] = this.bye;
					this.tourn.Match[9] = this.tourn.Players16.get(9);
				}else if(this.tourn.Players16.get(9) == null) {
					this.tourn.Match[8] = this.tourn.Players16.get(8);
					this.tourn.Match[9] = this.bye;
				}else {
					this.tourn.Match[8] = this.tourn.Players16.get(8);
					this.tourn.Match[9] = this.tourn.Players16.get(9);
				}
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 6) {
				
				if(this.tourn.Players16.get(10) == null) {
					this.tourn.Match[10] = this.bye;
					this.tourn.Match[11] = this.tourn.Players16.get(11);
				}else if(this.tourn.Players16.get(11) == null) {
					this.tourn.Match[10] = this.tourn.Players16.get(10);
					this.tourn.Match[11] = this.bye;
				}else {
					this.tourn.Match[10] = this.tourn.Players16.get(10);
					this.tourn.Match[11] = this.tourn.Players16.get(11);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 7) {
				
				if(this.tourn.Players16.get(12) == null) {
					this.tourn.Match[12] = this.bye;
					this.tourn.Match[13] = this.tourn.Players16.get(13);
				}else if(this.tourn.Players16.get(13) == null) {
					this.tourn.Match[12] = this.tourn.Players16.get(12);
					this.tourn.Match[13] = this.bye;
				}else {
					this.tourn.Match[12] = this.tourn.Players16.get(12);
					this.tourn.Match[13] = this.tourn.Players16.get(13);
				}
				
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 8) {
				
				if(this.tourn.Players16.get(14) == null) {
					this.tourn.Match[14] = this.bye;
					this.tourn.Match[15] = this.tourn.Players16.get(15);
				}else if(this.tourn.Players16.get(15) == null) {
					this.tourn.Match[14] = this.tourn.Players16.get(14);
					this.tourn.Match[15] = this.bye;
				}else {
					this.tourn.Match[14] = this.tourn.Players16.get(14);
					this.tourn.Match[15] = this.tourn.Players16.get(15);
				}
				
				this.tourn.RunRound();
			}
		}else if(this.tourn.roundNum == 2) {
			if (this.tourn.matchNum == 1) {
				//this.tourn.matchNum++;
				this.tourn.Match[0] = this.tourn.winners.get(0);
				this.tourn.Match[1] = this.tourn.winners.get(1);
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 2) {
				
				
				this.tourn.Match[2] = this.tourn.winners.get(2);
				this.tourn.Match[3] = this.tourn.winners.get(3);
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 3) {
				
				this.tourn.Match[4] = this.tourn.winners.get(4);
				this.tourn.Match[5] = this.tourn.winners.get(5);
				this.tourn.RunRound();
			}else if(this.tourn.matchNum == 4) {
				
				this.tourn.Match[6] = this.tourn.winners.get(6);
				this.tourn.Match[7] = this.tourn.winners.get(7);
				this.tourn.RunRound();
			}
			}else if(this.tourn.roundNum == 3) {
				if(this.tourn.matchNum == 1) {
					this.tourn.Match[0] = this.tourn.winners.get(8);
					this.tourn.Match[1] = this.tourn.winners.get(9);
					this.tourn.RunRound();
				}else if(this.tourn.matchNum == 2) {
					
					this.tourn.Match[2] = this.tourn.winners.get(10);
					this.tourn.Match[3] = this.tourn.winners.get(11);
					this.tourn.RunRound();
				}
			}else if(this.tourn.roundNum == 4) {
				if(this.tourn.matchNum == 1) {
					this.tourn.Match[0] = this.tourn.winners.get(12);
					this.tourn.Match[1] = this.tourn.winners.get(13);
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
 			Main.stage.setTitle("Congrats");
 			Main.stage.show();
 		} catch(Exception e) {
 			e.printStackTrace();
 		}

	}

}
	