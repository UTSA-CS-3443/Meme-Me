package model;

import java.util.ArrayList;

/**
 * The BracketModel class will be passed an
 * ArrayList that has the players in the tournament.
 * 
 * It will define how a bracket is generated and
 * who plays in what match
 * 
 * @author paul
 */
public class BracketModel {
	
	ArrayList<PlayerModel> Players;		//list of players in tournament
	int[] Matches;					//list of rounds and number 
									//of players in the round
	PlayerModel[] Tournament;		//the tournament bracket
	
	//Constructor
	public BracketModel(ArrayList<PlayerModel> players) {
		
		//TODO error check Players arraylist to ensure no bugs
		//We are assuming a valid positive integer number of players
		Players = players;
		
		//call tournament builder and setmatches method
		SeededTournamentBuilder();
		SetMatches();
	}
	
	
	//Getters and Setters
	public ArrayList<PlayerModel> getPlayers() {
		return Players;
	}

	public void setPlayers(ArrayList<PlayerModel> players) {
		Players = players;
	}
	
	
	/*
	 * SeededTournamentBuilder is the fastest possible 
	 * algorithm for generating a fairly seeded bracket.
	 * 
	 * Our implementation does not have a player seed, but 
	 * this method creates a bracket with each player having within
	 * one bye of the other players
	 * 
	 * Runtime O(n)
	 * 
	 * Warning: this code looks very ugly since it is unable to use
	 * a recursive method to define it
	 * 
	 */
	private void SeededTournamentBuilder() {
		
		//for ease of use later
		int playNum = this.Players.size();
		
		//this stack will be used to keep track of the 
		//list of indices to be reassigned
		int[] AssignmentStack = new int[playNum/2 -1];
		AssignmentStack[playNum/2 -1] = -1;
		
		//initialize the tournament bracket
		//with size up to next valid exponent of 2
		this.Tournament = new 
				PlayerModel[(int) Math.ceil((Math.log(playNum) / Math.log(2)))];

		//pair the first and last elements in the bracket
		this.Tournament[0] = this.Players.get(0);
		this.Tournament[1] = this.Players.get(playNum);
		
		//set the first position in the stack to players/2
		AssignmentStack[0] = playNum/2;
		int assignments = 1;
		
		//iterate over the assignment stack until all 
		//assignments have been finished (this is the ugly part)
		for(int i=0; i<=((playNum/2)-1); i++) {
			
			//place player into appropriate matches based on 
			//assignment stack index
			this.Tournament[AssignmentStack[i]] = this.Players.get(assignments);
			this.Tournament[AssignmentStack[i]] = this.Players.get(playNum-assignments);
			assignments++;
			
			//update the children of the current position in the stack
			if((i*2)+1 < (playNum/2)-1) {
				
				//just don't think about what's going on here lol
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
