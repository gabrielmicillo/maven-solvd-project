package com.solvd.football.human;

public abstract class Human {
	
	String name;
	int age;
	String country;
	
	public Human() {
		
	}
	public Human (String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	
	public abstract String physicalEffort();
	public abstract boolean hasAgent();
}
