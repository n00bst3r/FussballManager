package de.danielrajic.model;


public class Team {
	
	private String name;
	private Coach coach;
	private Goalkeeper keeper;
	private Player[] squad;
	private boolean next;

	public Team(String teamName, Coach coach, Goalkeeper keeper, Player[] squad){
		
		setName(teamName);
		setCoach(coach);
		setKeeper(keeper);
		setSquad(squad);
		
	}
	
	/*
	 * GETTER und SETTER: 
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public Goalkeeper getKeeper() {
		return keeper;
	}
	public void setKeeper(Goalkeeper keeper) {
		this.keeper = keeper;
	}
	public Player[] getSquad() {
		return squad;
	}
	public void setSquad(Player[] squad) {
		this.squad = squad;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
	/*
	 * INSTANZMETHODEN: 
	 */
	/**
	 * 
	 * @return int
	 * Method that returns average value of team's strength. 
	 */
	public int getAverageStrength() {
		int summ = keeper.getStrength();
		for (int i = 0; i < 10; i++) {
			summ += squad[i].getStrength();

		}
		return summ / 11;
	}
	/**
	 * 
	 * @return int
	 * 
	 * Method that returns the average value of team's motivation
	 */
	public int getAverageMotivation() {
		int summ = keeper.getMotivation();
		for (int i = 0; i < 10; i++) {
			summ += squad[i].getMotivation();

		}

		return summ / 11;
	}

}
