package model;

/**
 * The PlayerModel is a class that defines a player
 * based on their name.
 * 
 * @author paul
 *
 */
public class PlayerModel {
	
	int votes;		//number of votes the player was given
					//for the current match being played
	String name;	//Player's name
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
	
}
