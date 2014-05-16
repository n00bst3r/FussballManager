package de.danielrajic.model;

import java.util.GregorianCalendar;

public class Game {
	
	private static int idCreator = 0;
	
	private GregorianCalendar actualDate; //Contains the actual Date of the season
	private final User user;   // name of the user who plays and saved the game
	private String gameName;  // String value as which the game was saved by the user 
	private final int id;  // int value for the game id 
	
	
	public Game(String gameName, User user){
		idCreator++;
		this.id = idCreator;
		setActualDate(new GregorianCalendar(2014, 7,1));
		setGameName(gameName);
		this.user = user;
	}


	public GregorianCalendar getActualDate() {
		return actualDate;
	}


	public void setActualDate(GregorianCalendar actualDate) {
		this.actualDate = actualDate;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public User getUser() {
		return user;
	}


	public int getId() {
		return id;
	}

}
