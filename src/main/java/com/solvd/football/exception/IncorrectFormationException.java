package com.solvd.football.exception;

public class IncorrectFormationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectFormationException() {
		super("Incorrect number of players selected.");
	}
}