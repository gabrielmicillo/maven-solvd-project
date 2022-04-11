package com.solvd.football;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.exception.IncorrectFormation;

public class Runner {
	
	private static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) {
		
		Match match = new Match();
		try {
			match.menu();
		} catch (IncorrectAwayStrikerException | IncorrectHomeStrikerException | IncorrectFormation e) {
			LOGGER.error("Please choose a valid option. " + e.getMessage());
		}
	}
}
