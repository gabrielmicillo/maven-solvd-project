package com.solvd.football.human;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.interfaces.ISanctionable;

public class Coach extends Human implements ISanctionable {
	int playersManaged;
	int complains = 2;
	
	public Coach() {
	}
	
	public Coach(String name, int age, String country, int playersManaged) {
		super(name, age, country);
		this.playersManaged = playersManaged;
	}
	
	Logger LOGGER = LogManager.getLogger(Coach.class);
	
	public void nameCoach() {
		LOGGER.info("Write your full name, please.");
		Scanner sc = new Scanner(System.in);
		name = "COACH " + sc.nextLine();
		LOGGER.info("You are " + name + ".");
	}

	@Override
	public String physicalEffort() {
		String effort = "low";
		return effort;
	}

	@Override
	public boolean hasAgent() {
		boolean agent = true;
		return agent;
	}

	@Override
	public void sanction() {
		if (complains >= 3) {
			LOGGER.info("Coach receives a " + RED_CARD + ".");
			LOGGER.info("He has to go!");
		}
	}
}
