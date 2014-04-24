package de.danielrajic.model;

import java.util.Random;

public class Player extends Person {
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
	public Player(String name, int age, int strength, int shootingPower, int motivation, int goals){
		super(name, age);
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
	
	/*
	 * Object Methods below: 
	 */
	/**
	 * Method for adding goals to a player. 
	 */
	public void addGoal(){
		goals++;
	}
	
	public int shootsGoal(){
		Random r = new Random();
		// Shooting quality can vary [+1,0,−1 ,−2}
	    //  afterwards the limits of the intervalls will be checked again. 
		int ret = Math.max(1, Math.min(10, shootingPower + r.nextInt(4)-2));
		return ret;
	}
}
