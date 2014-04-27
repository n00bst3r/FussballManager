package de.danielrajic.model;

public class Coach extends Person {
	
	private int experience;
	private Position position;
	/**
	 * 
	 * @param name
	 * @param age
	 * @param experience
	 * 
	 * Constructor of the Coach class, that extends the Person class.
	 */
	public Coach(String name, int age, int experience, Position pos){
		super(name,age);
		setExperience(experience);
		setPosition(pos);
		
	}
	
	/*
	 * GETTER UND SETTER: 
	 */

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	

}
