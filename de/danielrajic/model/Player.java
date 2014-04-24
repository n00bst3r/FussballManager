package de.danielrajic.model;

public class Player {
	public static int createdPlayers; //class variable for counting createdPlayers and define clearly IDs for each player. 
	
	private int strength;   //Value between 1 and 10 
	private int shootingPower; //value between 1 and 10
	private int motivation; // value between 1 and 10 
	private int goals; // number of goals
	private int playerID; //clearly number for every created player.
    /**
     * 
     * @param strength
     * @param shootingPower
     * @param motivation
     * @param goals
     * 
     * Constructor for the Player class
     */
	public Player(int strength, int shootingPower, int motivation, int goals){
		setStrength(strength);
		setShootingPower(shootingPower);
		setMotivation(motivation);
		setGoals(goals);
		createdPlayers++;
		setPlayerID(createdPlayers);
	
	}
	
	/*
	 * GETTER UND SETTER:  
	 */
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getShootingPower() {
		return shootingPower;
	}
	public void setShootingPower(int shootingPower) {
		this.shootingPower = shootingPower;
	}
	public int getMotivation() {
		return motivation;
	}
	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	
	
}
