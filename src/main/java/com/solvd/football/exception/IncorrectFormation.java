package com.solvd.football.exception;

public class IncorrectFormation extends Exception {
	public IncorrectFormation() {
		super("Incorrect number of players selected.");
	}
}