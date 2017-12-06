package model;
import java.util.ArrayList;
import controller.*;
/**
 * A model class that make ups the pick player controller to insert player into game and play in tournament
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public class PickPlayer {
	
	public ArrayList<PlayerModel> playerlist;

	int currentPlayerNum;
	/**
	 * Constructs a pick player model that consists of an array list of players
	 * and a integer of current player number
	 */
	public PickPlayer() {
		this.playerlist = new ArrayList<PlayerModel>();
		this.currentPlayerNum = 0;
	}
	/**
	 * Changes the text entered in the textfield
	 * @param text The String text
	 * @param tfText String text field
	 */
	public void update(String text, String tfText) {
		String name;
		if (text.equals("OK")) {
			name = tfText;
			playerlist.add(currentPlayerNum, new PlayerModel(name));
			currentPlayerNum++;
			
		}else if(text.equals("Play")) {
			TournamentController tourn = new TournamentController(playerlist);
		}
		
	}
}
