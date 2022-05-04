package com.solvd.football.exception;

public class IncorrectVenueException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectVenueException() {
		super("Wrong choice. Try again.");
	}

}
