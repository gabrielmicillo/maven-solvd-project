package com.solvd.football.human;

import java.util.ArrayList;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.football.inteerface.ITrainable;

public class Referee extends Human implements ITrainable {
	private int yellowCards;
	private int redCards;
	private int fitnessLevel;
	
	public static ArrayList<Referee> refereeArrayList = new ArrayList<>();

	Logger LOGGER = LogManager.getLogger(Referee.class);

	public Referee() {
	}

	public Referee(String name, int age, String country, String effort, boolean agent, int yellowCards, int redCards,
			int fitnessLevel) {
		super(name, age, country, effort, agent);
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.fitnessLevel = fitnessLevel;
	}

	public int getYellowCards() {
		return yellowCards;
	}

	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}

	public int getRedCards() {
		return redCards;
	}

	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}

	public int getFitnessLevel() {
		return fitnessLevel;
	}

	public void setFitnessLevel(int fitnessLevel) {
		this.fitnessLevel = fitnessLevel;
	}

//	public void randomReferee() {
//		ArrayList<String> refereeArrayList = new ArrayList<>();
//		refereeArrayList.add("Pierluigi Collina");
//		refereeArrayList.add("Howard Webb");
//		refereeArrayList.add("Horacio Elizondo");
//		Random random = new Random();
//		int givenReferee = random.nextInt(3);
//		LOGGER.info("The assigned referee for this match will be: " + refereeArrayList.get(givenReferee) + ".");
//	}

	@Override
	public void physicalEffort() {
		if (effort == "middle") {
			fitnessLevel = -10;
		} else if (effort == "high") {
			fitnessLevel = -20;
		}
	}

	@Override
	public void hasAgent() {
		if (agent == true) {
			LOGGER.info("You have to negotiate this referee's salary with his agent.");
		} else {
			LOGGER.info("You have to negotiate this referee's salary with himself.");
		}
	}

	@Override
	public void trainingLevel() {
		if (MIN_FITNESS > fitnessLevel) {
			LOGGER.info("Referee is not fit for the match.");
		} else {
			LOGGER.info("Referee is fit for the match.");
		}

	}
	
	public void selectRandomReferee() {
		Random randomReferee = new Random();
		int givenReferee = randomReferee.nextInt(3);
		LOGGER.info("The assigned referee for this match will be: " + refereeArrayList.get(givenReferee).getName()
				+ ".");
		refereeArrayList.get(givenReferee).trainingLevel();
	}

}
