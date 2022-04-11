package com.solvd.football.building;

public abstract class Building {
	protected int crowd;

	public Building() {

	}

	public Building(int crowd) {
		this.crowd = crowd;
	}

	public void setCrowd(int crowd) {
		this.crowd = crowd;
	}

	public int getCrowd() {
		return this.crowd;
	}
	
	public abstract boolean hasCrowd();
}
