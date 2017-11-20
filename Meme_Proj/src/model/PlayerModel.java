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
	int totalVotes;	//total votes a player has received
	String name;	//Player's name
		
	
	//constructor
	public PlayerModel(String name) {
		this.name = name;
		
		//set initial vote counts to 0
		this.votes = 0;
		this.totalVotes = 0;
	}
	
	
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
