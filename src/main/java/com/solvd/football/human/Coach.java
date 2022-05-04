package com.solvd.football.human;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.football.inteerface.ISanctionable;

public class Coach extends Human implements ISanctionable {
	int playersManaged;
	int complains;

	public Coach() {
	}

	public Coach(String name, int age, String country, String effort, boolean agent, int playersManaged,
			int complains) {
		super(name, age, country, effort, agent);
		this.playersManaged = playersManaged;
		this.complains = complains;
	}

	Logger LOGGER = LogManager.getLogger(Coach.class);

	public void nameCoach() {
		LOGGER.info("Write your full name, please.");
		Scanner input = new Scanner(System.in);
		name = "COACH " + input.nextLine();
		LOGGER.info("You are " + name + ".");

	}

	@Override
	public void physicalEffort() {
		LOGGER.info("Coaches do not make any physical effort.");
	}

	@Override
	public void hasAgent() {
		if (agent == true) {
			LOGGER.info("You have to negotiate this coach's salary with his agent.");
		} else {
			LOGGER.info("You have to negotiate this coach's salary with himself.");
		}
	}

	@Override
	public void sanction() {
		if (complains >= 3) {
			LOGGER.info("Coach receives a " + RED_CARD + ".");
			LOGGER.info("He has to go!");
		}
	}
}
