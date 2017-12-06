package model;

/**
 * The PlayerModel is a class that defines a player
 * based on their name.
 * @author Katie Yarbough: Team Lead5
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public class PlayerModel {
	
	int votes;		//number of votes the player was given
					//for the current match being played
	int totalVotes;	//total votes a player has received
					//used for tie breakers
	public String name;	//Player's name
		
	
	/**
	 * Constructs a player model with a name, vote, and total votes  
	 * @param name
	 */
	public PlayerModel(String name) {
		this.name = name;
		
		//set initial vote counts to 0
		this.votes = 0;
		this.totalVotes = 0;
	}
	
	/**
	 * Returns the string of this name
	 * @return The string name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Changes the string of this name
	 * @param name The string of this name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Represents the entire name as a sring
	 */
	public String toString() {
		return this.name;
	}
	/**
	 * Changes the number of votes 
	 * @param vote An integer specifying the number of votes 
	 */
	public void setVotes(int vote) {
		this.votes = vote;
	}
	/**
	 * Changes the total number of votes 
	 * @param vote An integer specifying the total number of votes 
	 */
	public void setTotalVotes(int vote) {
		this.totalVotes += vote;
	}
	/**
	 * Returns the number of votes
	 * @return The number of votes as an integer
	 */
	public int getVotes() {
		return this.votes;
	}
	
}
