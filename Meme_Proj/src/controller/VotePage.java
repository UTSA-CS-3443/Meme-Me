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
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.PlayerModel;
/**
 * A controller class that handles the operations and other functions for the Vote page
 * @author Katie Yarbough: Team Lead5
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 *
 */

public class VotePage implements EventHandler<ActionEvent>{
	@FXML
	private TextArea ta1;
	@FXML
	private TextArea ta2;
	@FXML
	private Button vote1;
	@FXML
	private Button vote2;
	private int votes1;
	private int votes2;
	private Image img;
	private Image img2;
	private int sizeTourn;
	@FXML
	public ImageView imgView1;
	@FXML
	public ImageView imgView2;
	private PlayerModel play1;
	private PlayerModel play2;
	private int numMatch;
	private int numRound;
	private Button win;
	private ArrayList<PlayerModel> players = new ArrayList<PlayerModel>();
	private int numBye;
	private ArrayList<PlayerModel> winnerList = new ArrayList<PlayerModel>();
	
	/**
	 * Updates increment of first set of votes
	 * @param event An event to occur when clicked
	 */
	public void updateVotes1(ActionEvent event) {
		this.votes1+= 1;
		String string = Integer.toString(this.votes1);
		this.ta1.setText(string);
	}
	
	/**
	 * Updates decrement of first set of votes
	 * @param event An event to occur when clicked
	 */
	public void updateVotesDown1(ActionEvent event) {
		this.votes1-= 1;
		String string = Integer.toString(this.votes1);
		this.ta1.setText(string);
	}
	
	/**
	 * Updates increment of second set of votes
	 * @param event An event to occur when clicked
	 */
	public void updateVotes2(ActionEvent event) {
		this.votes2+= 1;
		String string = Integer.toString(this.votes2);
		this.ta2.setText(string);
	}
	/**
	 * Updates the decrement of the second set of votes
	 * @param event An event to occur 
	 */
	public void updateVotesDown2(ActionEvent event) {
		this.votes2-= 1;
		String string = Integer.toString(this.votes2);
		this.ta2.setText(string);
	}
	/**
	 * A method that send information about votes to the Player vs Player page
	 * @param event An event to occur when clicked
	 */
	public void sendFunction(ActionEvent event) {
		// tie goes to player 1
		if (this.votes1 == this.votes2) {
			this.votes1 += 1;
		}
		Parent root;
		if (this.sizeTourn == 2) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/pvp.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				PlayerVPlayer controller = fxmlLoader.<PlayerVPlayer>getController();
				controller.setUser(this.votes1, this.votes2);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}else if(this.sizeTourn == 4) {
			this.play1.setVotes(this.votes1);
			this.play2.setVotes(this.votes2);
			if (this.play1.getVotes() >= this.play2.getVotes()) {
				this.winnerList.add(this.play1);
			}else {
				this.winnerList.add(this.play2);
			}
			this.play1.setTotalVotes(this.votes1);
			this.play2.setTotalVotes(this.votes2);
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn4.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				Tourn4Controller controller = fxmlLoader.<Tourn4Controller>getController();
				controller.setUser4(this.numMatch, this.numBye);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}else if(this.sizeTourn == 8) {
			this.play1.setVotes(this.votes1);
			this.play2.setVotes(this.votes2);
			if (this.play1.getVotes() >= this.play2.getVotes()) {
				this.winnerList.add(this.play1);
			}else {
				this.winnerList.add(this.play2);
			}
			this.play1.setTotalVotes(this.votes1);
			this.play2.setTotalVotes(this.votes2);
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn8.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				Tourn8Controller controller = fxmlLoader.<Tourn8Controller>getController();
				controller.setUser4(this.numMatch, this.numBye);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}else if(this.sizeTourn == 16) {
			this.play1.setVotes(this.votes1);
			this.play2.setVotes(this.votes2);
			if (this.play1.getVotes() >= this.play2.getVotes()) {
				this.winnerList.add(this.play1);
			}else {
				this.winnerList.add(this.play2);
			}
			this.play1.setTotalVotes(this.votes1);
			this.play2.setTotalVotes(this.votes2);
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn16.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				Tourn16Controller controller = fxmlLoader.<Tourn16Controller>getController();
				//controller.setUser3(this.winner);
				controller.setUser4(this.numMatch, this.numBye);
				controller.setUser(this.players, this.numRound);
				//controller.setUser3(this.winner);
				
				controller.setUser6(this.winnerList);
				//this.tourn = new TournamentRunnerModel2(this.players, this.winnerList, this.numRound);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	 /**
	  * A method that detemines the winner between two players by the number of votes
	  * @param player1Votes Player 1's votes
	  * @param player2Votes Player 2's votes
	  */
	public void setUser(int player1Votes, int player2Votes){
		if(player1Votes > player2Votes) {
			this.win.setText("Player1 Wins");
		}else {
			this.win.setText("Player2 Wins");
		}
	}
	
	/**
	 * Changes the user's image and size 
	 * @param image The first image to be changed 
	 * @param image2 The second image to be changed
	 * @param size  An integer specifying the tournament size 
	 */
	public void setUser1(Image image, Image image2, int size){
	    this.img = image;
	    this.img2 = image2;
	    this.sizeTourn = size;   
	}
	/**
	 * Changes the player of the game 
	 * @param play12 The player to be changed
	 * @param play22 The player to be changed
	 */
	public void setUser2(PlayerModel play12, PlayerModel play22) {
		this.play1 = play12;
		this.play2 = play22;
	}
	/**
	 * Changes the players in player list, match number and bye number  
	 * @param playerlist The array list of players
	 * @param matchNum The integer specifying the match number
	 * @param numBye The integer specifying the bye number
	 */
	public void setUser3(ArrayList<PlayerModel> playerlist, int matchNum, int numBye) {
		this.players = playerlist;
		this.numMatch = matchNum;
		this.numBye = numBye;
	}
	/**
	 * Changes the round number
	 * @param roundNum The integer specifying the number round
	 */
	public void setUser4(int roundNum) {
		this.numRound = roundNum;
	}
	/**
	 * Changes the winners in the array list of winners
	 * @param winners The array list of winners
	 */
	public void setUser5(ArrayList<PlayerModel> winners) {
		this.winnerList = winners;
	}
	/**
	 * Set pictures player 1 and player2 created to view to vote
	 * @param event An event to occur when clicked
	 */
	public void setPics(ActionEvent event) {
		System.out.println("Set Test");
		imgView1.setImage(this.img);
		System.out.println("Set Test2");
	    imgView2.setImage(this.img2);
	}
	@Override
	public void handle(ActionEvent event) {
		//Ignore, for implementation use only 
		
	}
	
}
