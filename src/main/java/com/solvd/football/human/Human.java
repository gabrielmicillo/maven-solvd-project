package com.solvd.football.human;

public abstract class Human {
	
	protected String name;
	protected int age;
	protected String country;
	protected String effort;
	protected boolean agent;
	
	public Human() {
		
	}
	public Human (String name, int age, String country, String effort, boolean agent) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.effort = effort;
		this.agent = agent;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}
	
	public void setEffort(String effort) {
		this.effort = effort;
	}

	public String getEffort() {
		return this.effort;
	}
	
	public void setAgent(boolean agent) {
		this.agent = agent;
	}

	public boolean getAgent() {
		return this.agent;
	}
	
	public abstract void physicalEffort();
	public abstract void hasAgent();
}
