package de.danielrajic.model;

public class User {
	
	private static int idCreator = 0;
	
	private final int id; //User ID 
	private String username; //Name of the user who plays the game
	
	public User(String name){
		idCreator++;
		this.id = idCreator;
		if (name.trim().equals("")) name = "SpielerID_"+this.id;  //In case of forgetting to enter a username you get an default-name: SpielerID_12 e.g. 
		setUsername(name);
		
	}

	public static int getIdCreator() {
		return idCreator;
	}

	public static void setIdCreator(int idCreator) {
		User.idCreator = idCreator;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	/*
	 * TODO toString, hashCode etc. 
	 */
	
}
