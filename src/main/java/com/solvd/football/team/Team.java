package com.solvd.football.team;

public abstract class Team {
	
	protected int employeesQuantity;
	protected String uniform;

//	int players;
//	int index;
	
	public Team() {
	}
	
	public Team(int employeesQuantity, String uniform) {
		this.employeesQuantity = employeesQuantity;
		this.uniform = uniform;
	}
	
	public int getEmployeesQuantity() {
		return employeesQuantity;
	}

	public void setEmployeesQuantity(int employeesQuantity) {
		this.employeesQuantity = employeesQuantity;
	}

	public String getUniform() {
		return uniform;
	}

	public void setUniform(String uniform) {
		this.uniform = uniform;
	}

//	public Team(int players, int index) {
//		this.players = players;
//		this.index = index;
//	}
	
	public abstract int wages();
	public abstract void kit();
}
