package com.solvd.football.human;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.football.inteerface.ICheerable;
import com.solvd.football.inteerface.ISanctionable;
import com.solvd.football.inteerface.ITrainable;

public class Player extends Human implements ITrainable , ISanctionable , ICheerable {
	private int skillLevel;
	private int fitnessLevel;
	int foulsCommited;
	
	public Player() {
	}
	
	public Player(String name, int age, String country, String effort, boolean agent, int skillLevel, int fitnessLevel, int foulsCommited) {
		super(name, age, country, effort, agent);
		this.setSkillLevel(skillLevel);
		this.setFitnessLevel(fitnessLevel);
	}
	
	Logger LOGGER = LogManager.getLogger(Player.class);
	
	@Override
	public void physicalEffort() {
		if (effort == "middle") {
			fitnessLevel =- 10;
		} else if (effort == "high") {
			fitnessLevel =- 20;
		}
	}

	@Override
	public void hasAgent() {
		if (agent == true) {
			LOGGER.info("You have to negotiate this player's salary with his agent.");
		} else {
			LOGGER.info("You have to negotiate this players's salary with himself.");
		}
	}

	@Override
	public void trainingLevel() {
		if (MIN_FITNESS > fitnessLevel) {
			LOGGER.info("Player is not fit for the match.");
		} else {
			LOGGER.info("Player is fit for the match.");
		}
		
	}

	@Override
	public void sanction() {
		if (foulsCommited >= 3) {
			LOGGER.info("This player receives a " + YELLOW_CARD + ".");
		} else if (foulsCommited >= 6) {
			LOGGER.info("This player receives a " + RED_CARD + ".");
			LOGGER.info("He has to go!");
		}
		
	}

	@Override
	public void cheer() {
		LOGGER.info(FANS + " are cheering for this player!");
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
	
	public int getFitnessLevel() {
		return fitnessLevel;
	}

	public void setFitnessLevel(int fitnessLevel) {
		this.fitnessLevel = fitnessLevel;
	}
	
	public int getFoulsCommited() {
		return foulsCommited;
	}

	public void setFoulsCommited(int foulsCommited) {
		this.foulsCommited = foulsCommited;
	}
}
