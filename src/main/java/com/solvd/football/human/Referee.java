package com.solvd.football.human;

import java.util.ArrayList;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.football.inteerface.ITrainable;

public class Referee extends Human implements ITrainable {
	int yellowCards;
	int redCards;
	int trainingLevel = 75;
	
	Logger LOGGER = LogManager.getLogger(Referee.class);
	
	public Referee() {
	}

	public Referee(String name, int age, String country, int yellowCards, int redCards) {
		super(name, age, country);
		this.yellowCards = yellowCards;
		this.redCards = redCards;
	}
	
	public void randomReferee() {
		ArrayList<String> refereeArrayList = new ArrayList<>();
		refereeArrayList.add("Pierluigi Collina");
		refereeArrayList.add("Howard Webb");
		refereeArrayList.add("Horacio Elizondo");
		Random random = new Random();
		int givenReferee = random.nextInt(3);
		LOGGER.info("The assigned referee for this match will be: " + refereeArrayList.get(givenReferee) + ".");
	}

	@Override
	public String physicalEffort() {
		String effort = "middle";
		return effort;
	}

	@Override
	public boolean hasAgent() {
		boolean agent = false;
		return agent;
	}

	@Override
	public void trainingLevel() {
		if (MIN_FITNESS > trainingLevel) {
			LOGGER.info("Referee is not fit for the match.");
		} else {
			LOGGER.info("Referee is fit for the match.");
		}
		
	}

}
