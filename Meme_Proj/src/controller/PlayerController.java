package controller;

import model.PlayerModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import application.Main;
import javafx.collections.FXCollections;
/**
 * A class that is a controller to input players in to the game for tournament
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson 
 */
public class PlayerController implements EventHandler<ActionEvent> {
	
	@FXML
	private TextField tf;
	@FXML
	private ListView<String> list = new ListView<String>();
	public ArrayList<PlayerModel> playerlist = new ArrayList<PlayerModel>();
	/**
	 * The default construtor of this class
	 */
	public PlayerController() {
		super();
	}	
	
	@Override
	public void handle(ActionEvent event) {
		// ignore, for implementations only 
	}
	
	/**
	 * A method that once user clicked okay player will be added into the list of players
	 * @param event An event to occur
	 */
	public void okButtonHandle(ActionEvent event) {
		PlayerModel player;
		if (!tf.getText().isEmpty()) {
			 player = new PlayerModel(tf.getText());
		}else {
			player = null;
		}
		if (player != null) {
			if (this.playerlist.size() < 16) {
				this.playerlist.add(player);
			}
		}		
		tf.clear();
		System.out.println(player);
		ObservableList<String> items = FXCollections.observableArrayList();
		for(PlayerModel person : playerlist) {
			items.add((person.toString()));
		}
		list.setItems(items);
	}
	
	/**
	 * A method that will direct the players to corresponding tournament size depending on the total 
	 * number of players entered into the list. 
	 * @param event An event to occur
	 */
	public void playButtonHandle(ActionEvent event) {
		System.out.println("play clicked");
			Parent root;
			if (this.playerlist.size() > 2 && this.playerlist.size() <= 4) {
				try {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn4.fxml")); 
					root = (Parent)fxmlLoader.load(); 
					Tourn4Controller controller = fxmlLoader.<Tourn4Controller>getController();
					controller.setUser(this.playerlist);
					System.out.println("tournTesst");
					Main.stage.setScene(new Scene(root, 1000,800));
					Main.stage.setTitle("4 Player Tournament");
					Main.stage.show();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}else if(this.playerlist.size() > 4 && this.playerlist.size() <= 8) {
				try {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn8.fxml")); 
					root = (Parent)fxmlLoader.load(); 
					Tourn8Controller controller = fxmlLoader.<Tourn8Controller>getController();
					controller.setUser(this.playerlist);
					Main.stage.setScene(new Scene(root, 1000,800));
					Main.stage.setTitle("8 Player Tournament");
					Main.stage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if(this.playerlist.size() > 8 && this.playerlist.size() <= 16) {
				try {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn16.fxml")); 
					root = (Parent)fxmlLoader.load(); 
					Tourn16Controller controller = fxmlLoader.<Tourn16Controller>getController();
					controller.setUser(this.playerlist);
					Main.stage.setScene(new Scene(root, 1000,800));
					Main.stage.setTitle("16 Player Tournament");
					Main.stage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				try {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Mode.fxml")); 
					root = (Parent)fxmlLoader.load(); 
					Main.stage.setScene(new Scene(root, 1000,800));
					Main.stage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}			
	}
}
