package com.solvd.football.exception;

public class IncorrectVenue extends RuntimeException {
	public IncorrectVenue () {
		super("Wrong choice. Try again.");
	}

}
