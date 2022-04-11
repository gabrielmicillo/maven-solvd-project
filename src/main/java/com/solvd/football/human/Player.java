package com.solvd.football.human;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.football.inteerface.ICheerable;
import com.solvd.football.inteerface.ISanctionable;
import com.solvd.football.inteerface.ITrainable;

public class Player extends Human implements ITrainable , ISanctionable , ICheerable {
	private int skillLevel;
	int trainingLevel = 90;
	int foulsCommited = 2;
	
	public Player() {
	}
	
	public Player(String name, int age, String country, int skillLevel) {
		super(name, age, country);
		this.setSkillLevel(skillLevel);
	}
	
	Logger LOGGER = LogManager.getLogger(Player.class);
	
	@Override
	public String physicalEffort() {
		String effort = "high";
		return effort;
	}

	@Override
	public boolean hasAgent() {
		boolean agent = true;
		return agent;
	}

	@Override
	public void trainingLevel() {
		if (MIN_FITNESS > trainingLevel) {
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
}
