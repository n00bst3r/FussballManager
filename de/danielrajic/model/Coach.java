package de.danielrajic.model;

public class Coach extends Person {
	
	private int experience;
	/**
	 * 
	 * @param name
	 * @param age
	 * @param experience
	 * 
	 * Constructor of the Coach class, that extends the Person class.
	 */
	public Coach(String name, int age, int experience){
		super(name,age);
		setExperience(experience);
		
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
	
	

}
