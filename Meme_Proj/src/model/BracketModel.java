package model;

import java.util.ArrayList;

/**
 * The BracketModel class will be passed an
 * ArrayList that has the players in the tournament.
 * 
 * It will define how a bracket is generated and
 * who plays in what match.
 * @author Katie Yarbough: Team Lead5
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public abstract class BracketModel {
	
	private ArrayList<PlayerModel> Players;		//list of players in tournament
	public int[] Matches;					//list of rounds and number 
									//of players in the round
	public PlayerModel[] Tournament;		//the tournament bracket
	
	/**
	 * Constructs a bracket model with players that call the tournament and set matches methods
	 * @param players
	 */
	public BracketModel(ArrayList<PlayerModel> players) {
		
		//We are assuming a valid positive integer number of players
		Players = players;
		SeededTournamentBuilder();
		SetMatches();
	}
	

	/**
	 * Returns the players in the arraylist
	 * @return array list of players
	 */
	public ArrayList<PlayerModel> getPlayers() {
		return Players;
	}

	/**
	 * Changes the players in the arraylist 
	 * @param players The arrayList to be changed 
	 */
	public void setPlayers(ArrayList<PlayerModel> players) {
		Players = players;
	}
	
	
	//Classmates: you can't just spend 20 hours rewriting
	//	code just because this one runs a little bit faster.
	//Me:
	/**
	 * A beautiful algorithm written by oh so wonderful Paul(Cheyenne says so and Katie and Danielle concur with this notion)
	 * that does exactly what is say on the inside comments
	 */
	private void SeededTournamentBuilder() {
		
		//for ease of use later
		int playNum = this.Players.size();

		//initialize the tournament bracket
		//with size up to next valid exponent of 2
		this.Tournament = new 
				PlayerModel[(int) Math.ceil((Math.log(playNum) / Math.log(2)))];
		
		//this stack will be used to keep track of the 
		//list of indices to be reassigned
		int[] AssignmentStack = new int[playNum/2 -1];
		AssignmentStack[this.Tournament.length/2 -1] = -1;

		//pair the first and last elements in the bracket
		this.Tournament[0] = this.Players.get(0);
		this.Tournament[1] = this.Players.get(playNum);
		
		//set the first position in the stack to players/2
		AssignmentStack[0] = this.Tournament.length/2;
		int assignments = 1;
		
		//iterate over the assignment stack until all 
		//assignments have been finished (this is the ugly part)
		for(int i=0; i<=(AssignmentStack.length); i++) {
			
			//place player into appropriate matches based on 
			//assignment stack index
			this.Tournament[AssignmentStack[i]] = this.Players.get(assignments);
			this.Tournament[AssignmentStack[i]] = this.Players.get(playNum-assignments);
			assignments++;
			
			//update the children of the current position in the stack
			if((i*2)+1 < (AssignmentStack.length)) {
				
				//you can't question the algorithm if you don't 
				//understand it **points to brain**
				AssignmentStack[(i*2)+1] = AssignmentStack[i] 
						+ playNum/(2^((int) Math.floor(Math.log(i+1)/Math.log(2))));
				AssignmentStack[(i*2)+2] = AssignmentStack[i] 
						- playNum/(2^((int) Math.floor(Math.log(i+1)/Math.log(2))));
			}
			else
				break;
		}
		return;
	}
	
	/**
	 * Gets and assigns the number of player in the tournament, assign number of players in each match
	 */
	private void SetMatches() {
		
		//get number of players in the tournament
		int playNum = this.Players.size();
		this.Matches = new int[(int) Math.floor(Math.log(playNum)/Math.log(2))];
		
		//assign number of players in each match
		for(int match : Matches) {
			this.Matches[match] = playNum;
			playNum = playNum/2 + playNum%2;
		}		
		return;
	}

}
