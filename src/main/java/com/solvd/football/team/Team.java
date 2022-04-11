package com.solvd.football.team;

public abstract class Team {
	
	int players;
	int index;
	
	public Team() {
	}

	public Team(int players, int index) {
		this.players = players;
		this.index = index;
	}
	
	public abstract boolean onThePitch();
}
