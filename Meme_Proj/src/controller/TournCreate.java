package controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import application.Main;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import model.PlayerModel;

/**
 * A controller class that reflects the operations in the tournament create scene
 * @author Katie Yarbough: Team Lead5
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 *
 */
public class TournCreate {
	private Image image1; 
	private Image image2;
	private Image img;
	public ImageView imgView;
	@FXML
	TextField tf1;
	@FXML
	TextField tf2;
	@FXML
	TextField tf3;
	@FXML
	Button insertText;
	@FXML
	private StackPane pane;
	@FXML 
	private Group group;
	private int sizeTourn;
	private int numMatch;
	private int numBye;
	ArrayList<PlayerModel[]> Matches;
	private PlayerModel play1;
	private PlayerModel play2;
	int roundNum;
	ArrayList<PlayerModel> players = new ArrayList<PlayerModel>();
	ArrayList<PlayerModel> winnerList = new ArrayList<PlayerModel>();
	
	/**
	 * Sets image to view to user
	 * @param event An event to occur when clicked
	 */
	public void setPicture(ActionEvent event) {
		imgView.setImage(img);
	}
	/**
	 * Saves the additions and deletions to  Player1's meme
	 * @param event An event to occur when clicked
	 */
	public void goPlayer1(ActionEvent event) {
		image1 = pane.snapshot(new SnapshotParameters(), null);
		tf1.clear();
		tf2.clear();
		tf3.clear();
	}
	/**
	 * Saves the additions and deletions to Player2's meme
	 * @param event An event to occur when clicked
	 */
	public void goPlayer2(ActionEvent event) {
		image2 = pane.snapshot(new SnapshotParameters(), null);
		tf1.clear();
		tf2.clear();
		tf3.clear();
	}
	/**
	 * Changes the user's image and size
	 * @param image The image to be changed
	 * @param size An integer specifying the tournament size
	 */
	public void setUser(Image image, int size){
	    this.img = image;
	    this.sizeTourn = size;
	}
	/**
	 * Changes the players of the game
	 * @param player1 The player to be changed 
	 * @param player2 The player to be changed
	 */
	public void setUser2(PlayerModel player1, PlayerModel player2) {
		this.play1 = player1;
		this.play2 = player2;
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
		this.roundNum = roundNum;
	}
	/**
	 * Changes the winners in the array list of winners
	 * @param winners The array list of winners
	 */
	public void setUser5(ArrayList<PlayerModel> winners) {
		this.winnerList = winners;
	}
	
	/**
	 * A method that saves a snapshot of an image as a png file
	 * @param event Event to occur
	 */
	public void saveFunction(ActionEvent event) {
		Image image = pane.snapshot(new SnapshotParameters(), null);
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Image");
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(image,
                    null), "png", file);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
	}
	/**
	 * An event that will close the application
	 * @param event Event to occur once clicked
	 */
	public void clearFunction(ActionEvent event) {
		//imgView.setImage(null);
		tf1.clear();
		tf2.clear();
		tf3.clear();
	}
	/**
	 * Inserts a line of text user input into text areas on top, middle, or bottom of the images
	 * @param event Event to occur once clicked
	 */
	public void insertLine(ActionEvent event) {
		try {
	
		Text text1 = new Text();
		Text text2 = new Text();
		Text text3 = new Text();
		text1.textProperty().bind(tf1.textProperty());
		text1.getText();
		text1.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text1.setFill(Color.WHITE);
		text1.setStroke(Color.BLACK);
		text1.setX(50);
		text1.setY(50);
		group.getChildren().add(text1);
		
		text2.textProperty().bind(tf2.textProperty());
		text2.getText();
		text2.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text2.setFill(Color.WHITE);
		text2.setStroke(Color.BLACK);
		text2.setX(50);
		text2.setY(375);
		group.getChildren().add(text2);
		
		text3.textProperty().bind(tf3.textProperty());
		text3.getText();
		text3.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text3.setFill(Color.WHITE);
		text3.setStroke(Color.BLACK);
		text3.setX(50);
		text3.setY(550);
		group.getChildren().add(text3);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}	
	
	/**
	 * A method that directs the player to the vote page 
	 * @param event An event to occur once clicked
	 */
	public void voteHandle(ActionEvent event) {
		if(!image1.equals(null) && !image2.equals(null)) {
			try {
				Parent root;
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Vote.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				VotePage controller = fxmlLoader.<VotePage>getController();
				controller.setUser1(this.image1, this.image2, this.sizeTourn);
				controller.setUser2(this.play1, this.play2);
				controller.setUser3(this.players, this.numMatch, this.numBye);
				controller.setUser4(this.roundNum);
				controller.setUser5(this.winnerList);
				Main.stage.setScene(new Scene(root, 1250,800));
				Main.stage.setTitle("Vote Page");
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
