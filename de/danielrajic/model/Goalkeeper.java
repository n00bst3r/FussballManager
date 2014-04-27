package de.danielrajic.model;

import java.util.Random;

public class Goalkeeper extends Player {
	
	private int reaction;
	/**
	 * 
	 * @param name
	 * @param age
	 * @param strength
	 * @param shootingPower
	 * @param motivation
	 * @param goals
	 * 
	 * Constructor for the Goalkeeper class, that extends the Player class
	 */
	public Goalkeeper(String name, int age, int strength, int shootingPower, int motivation, int goals, int reaction, Position pos){
		super(name, age, strength, shootingPower, motivation, pos);
		setReaction(reaction);
		
	}
	
	/*
	 * GETTER UND SETTER: 
	 */
	
	public int getReaction() {
		return reaction;
	}



	public void setReaction(int reaction) {
		this.reaction = reaction;
	}

	/**
	 * 
	 * @param shot
	 * @return boolean
	 * Method that handles the game behavior of the goalkeeper. 
	 * In case of a saved shot, it will return true, false else. 
	 */

	public boolean saveTheShot(int shot){
		Random r = new Random();
		// Reaction can vary [+1 ,0 ,−1]
		int ret = reaction + r.nextInt(3)-1;
		if (ret >= shot) return true; 
		else return false; 
		
	}

}
