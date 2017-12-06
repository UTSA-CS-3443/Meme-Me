package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * A class that implements the view of the Player vs Player 
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson 
 *
 */
public class PlayerVPlayer implements EventHandler<ActionEvent>{
	private int sizeTourn = 2;
	@FXML 
	private Button win;
	@Override
	public void handle(ActionEvent event) {
		// Ignore for implementation uses only 
	}
	
	/**
	 * A method that will start the game strictly between two players 
	 * @param event An event to occur
	 */
	public void goHandle(ActionEvent event) {
		System.out.println("winner button pushed");
		try {
			Parent root;
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/choosePic.fxml")); 
			root = (Parent)fxmlLoader.load(); 
			ChoosePic controller = fxmlLoader.<ChoosePic>getController();
			controller.setUser(sizeTourn);
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.setTitle("Choose Your Image");
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * A method that will determine if player 1 or player2 wins based on their votes
	 * @param player1Votes A integer specifying the votes of player1
	 * @param player2Votes A integer specifying the votes of player2
	 */
	public void setUser(int player1Votes, int player2Votes){
		if(player1Votes > player2Votes) {
			win.setText("Player1 Wins");
		}else {
			win.setText("Player2 Wins");
		}	    
	}
	
	/**
	 * A method that will that the user back to the welcome page 
	 * @param event 
	 */
	public void goToWelcome(ActionEvent event) {
		try {
			Parent root;
			root = FXMLLoader.load(getClass().getResource("../view/WelcomeView.fxml"));
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.setTitle("Welcome Page");
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
