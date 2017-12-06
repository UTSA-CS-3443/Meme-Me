package controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.PlayerModel;

/**
 * A class that will preview the tournament window and will show how players advance in bracket
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson 
 */
public class ChoosePic implements EventHandler<ActionEvent>{
	public ImageView imgView;
	private Image saved;
	private int sizeTourn;
	private PlayerModel play1;
	private PlayerModel play2;
	private int matchIndex;
	private int roundNum;
	private ArrayList<PlayerModel> players = new ArrayList<PlayerModel>();
	ArrayList<PlayerModel> winnerList = new ArrayList<PlayerModel>();

	@Override
	public void handle(ActionEvent event) {
		// Ignore, for implementation purposes	
	}
	
	/**
	 * An event once the button is clicked the tournament create is shown
	 * @param event An event to occur
	 */
	public void goHandle(ActionEvent event) {
		System.out.println("Go pushed");
		
		if (!saved.equals(null)) {
			Parent root;
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/TournamentCreate.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				TournCreate controller = fxmlLoader.<TournCreate>getController();				
				controller.setUser(this.saved, this.sizeTourn);
				controller.setUser2(this.play1, this.play2);
				controller.setUser3(this.players, this.matchIndex, 1);
				controller.setUser4(this.roundNum);
				controller.setUser5(this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
	/**
	 * A method to set user to a tournament size
	 * @param size An integer specifying the size for this tournament
	 */
	public void setUser(int size){
	    this.sizeTourn = size;
	}
	/**
	 * A method to set players to the player model
	 * @param player1 A reference to the player model
	 * @param player2 A reference to the player model
	 */
	public void setUser2(PlayerModel player1, PlayerModel player2) {
		this.play1 = player1;
		this.play2 = player2;
	}
	/**
	 * A method 
	 * @param playerlist
	 * @param matchNum
	 */
	public void setUser3(ArrayList<PlayerModel> playerlist, int matchNum) {
		this.players = playerlist;
		this.matchIndex = matchNum;
	}
	public void setUser4(int roundNum) {
		this.roundNum = roundNum;
	}
	public void setUser5(ArrayList<PlayerModel> winners) {
		this.winnerList = winners;
	}
	public void openFunction(ActionEvent event) throws IOException {		
		FileChooser choice = new FileChooser();
		choice.getExtensionFilters().addAll(new 
				ExtensionFilter("Images Files", "*.png", "*.jpg", "*.gif"));
		File selected = choice.showOpenDialog(null);
		if(selected != null) {
			String location = selected.toURI().toURL().toString();
			System.out.println( location);
			Image img = new Image(location);
			System.out.println("height: " +img.getHeight() + "\nWidth: " + img.getWidth());
			imgView.setImage(img);
			saved = img;
		}
	}
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

}
