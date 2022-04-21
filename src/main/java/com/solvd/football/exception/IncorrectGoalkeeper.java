package com.solvd.football.exception;

public class IncorrectGoalkeeper extends RuntimeException {
	public IncorrectGoalkeeper() {
		super("Wrong choice. Try again.");
	}

}
