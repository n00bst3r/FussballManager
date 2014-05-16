package de.danielrajic.model;

import java.util.GregorianCalendar;

public class Person {
	protected final String name;
	protected final GregorianCalendar dateOfBirth; 
	protected int age;
	
	protected Person(String name,int year, int month, int dayOfMonth) {
		this.name = name; 
		this.dateOfBirth = new GregorianCalendar(year, month, dayOfMonth);   //Initializes the Date of Birth of the Person by using int values
		// TODO Age behandeln
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
