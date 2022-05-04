package com.solvd.football.exception;

public class IncorrectGoalkeeperException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectGoalkeeperException() {
		super("Wrong choice. Try again.");
	}

}
