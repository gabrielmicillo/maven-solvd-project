package com.solvd.football;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.exception.IncorrectVenue;
import com.solvd.football.human.Coach;
import com.solvd.football.human.Referee;
import com.solvd.football.inteerface.IPlayable;
import com.solvd.football.building.Stadium;
import com.solvd.football.building.TrainingCentre;
import com.solvd.football.building.Weather;
import com.solvd.football.collection.CountryMap;
import com.solvd.football.collection.CustomLinkedList;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.exception.IncorrectFormation;

public class Runner {
	
	private static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) {
		
		Match match = new Match();
		
		IPlayable lambdaIPlayable = s -> {
			if (match.refereeWhistle == true) {
				LOGGER.info("Match will begun soon" + s );
			} else {
				LOGGER.info("Match hasn't started yet. Come again later" + s );
			}
		};
		
		try {
			
		Stadium stadium = new Stadium();
		CountryMap countryMap = new CountryMap();
		TrainingCentre trainingCentre = new TrainingCentre();
		LOGGER.info("WELCOME TO THE FOOTBALL SIMULATOR!");
		
		LOGGER.info("Select your formation. Send your number of defenders, then your number of midfielders and then your number of strikers. The total must be 10.");
		Scanner def = new Scanner(System.in);
		int defenders = def.nextInt();
		Scanner mid = new Scanner(System.in);
		int midfielders = mid.nextInt();
		Scanner str = new Scanner(System.in);
		int strikers = str.nextInt();
		if ( (defenders + midfielders + strikers) != 10 ) {
			throw new IncorrectFormation();
		}
		
		CustomLinkedList<Integer> formationList = new CustomLinkedList<>();
		formationList.insert(defenders);
		formationList.insert(midfielders);
		formationList.insert(strikers);
		LOGGER.info("Your formation on the field will be:");
		formationList.show();
		
		LOGGER.info("Select your tactics. Send HIGH PRESSURE/LOW PRESSURE, COUNTER-ATTACK/POSSESSION, WIDE PLAY/INNER PLAY.");
		Scanner pres = new Scanner(System.in);
		String pressure = pres.nextLine();
		Scanner pos = new Scanner(System.in);
		String possession = pos.nextLine();
		Scanner play = new Scanner(System.in);
		String playType = play.nextLine();
		
		CustomLinkedList<String> tacticsList = new CustomLinkedList<>();
		tacticsList.insert(pressure);
		tacticsList.insert(possession);
		tacticsList.insert(playType);
		LOGGER.info("Your tactics will be:");
		tacticsList.show();
		
		PlayableDay[] playableDay = PlayableDay.values();
		for(int i = 0; i < playableDay.length; i++) {
			LOGGER.info(playableDay[i]);
		}
		
		PlayableDay sat = PlayableDay.SATURDAY;
		LOGGER.info("This match will be played on " + sat.randomPlayableDay() + ".");
		
		LOGGER.info("Type 0 if you want to see the available players and their nationalities. Type any other NUMBER to continue.");
		Scanner firstChoice = new Scanner (System.in);
		int wantsMap = firstChoice.nextInt();
		if (wantsMap == 0) {
			CountryMapEnum[] countryMapEnum = CountryMapEnum.values();
			for(int i = 0; i < countryMapEnum.length; i++) {
				LOGGER.info(countryMapEnum[i]);
			}
			LOGGER.info("We continue to select the type of match.");
		} else {
			LOGGER.info("We continue to select the type of match.");
		}
		
		LOGGER.info("Choose between a training match or an official match.");
		LOGGER.info("Type 0 for training match, 1 for official match.");
		Scanner venue = new Scanner(System.in);
		int selectedVenue = venue.nextInt();
		if (selectedVenue == 1) {
			
			Stadium borisov = new Stadium(30000, "Borisov Arena");
			Stadium bombo = new Stadium(60000, "La Bombonera");
			Stadium wembley = new Stadium(90000, "Wembley Stadium");
			
			ArrayList<Stadium> stadiumArrayList = new ArrayList <>();
			stadiumArrayList.add(borisov);
			stadiumArrayList.add(bombo);
			stadiumArrayList.add(wembley);
			
			int pick = new Random().nextInt(stadiumArrayList.size());
			LOGGER.info("The match will be played in " + stadiumArrayList.get(pick).getStadiumName() + ".");
			LOGGER.info("The crowd will be " + stadiumArrayList.get(pick).getCrowd() + " spectators.");
			
			
//			StadiumEnum[] stadiumenum = StadiumEnum.values();
//			for(int i = 0; i < stadiumenum.length; i++) {
//				LOGGER.info(stadiumenum[i]);
//			}
//			
//			StadiumEnum bor = StadiumEnum.BORISOV_ARENA;
//			LOGGER.info("This match will be played on " + bor.randomStadium() + ".");
			
//			stadium.attendance(stadium.stadiumSelection());
			
			if (stadium.hasCrowd() == true) {
				LOGGER.info("The fans are coming to the stadium!");
			}
			
		} else if (selectedVenue == 0) {
			trainingCentre.trainingCentre();
			if (trainingCentre.hasCrowd() == false) {
				LOGGER.info("Just the managers and the medical group will witness this match.");
			}	
		} else {
			throw new IncorrectVenue();
		}
		
		
		
		Weather win = Weather.WINDY;
		LOGGER.info(win.randomWeather());
		
		
		
		
		Coach coach = new Coach();
		coach.nameCoach();
		
		
		
		
//		Referee referee = new Referee ();
//		referee.randomReferee();
		Referee collina = new Referee("Pierluigi Collina", 45, "ITA", "middle", false, 10, 4, 76);
		Referee webb = new Referee("Howard Webb", 50, "ENG", "middle", false, 11, 5, 80);
		Referee elizondo = new Referee("Horacio Elizondo", 51, "ARG", "middle", false, 9, 5, 70);
		
		ArrayList<Referee> refereeArrayList = new ArrayList <>();
		refereeArrayList.add(collina);
		refereeArrayList.add(webb);
		refereeArrayList.add(elizondo);
		
		Random randomReferee = new Random();
		int givenReferee = randomReferee.nextInt(3);
		LOGGER.info("The assigned referee for this match will be: " + refereeArrayList.get(givenReferee).getName() + ".");
		if (refereeArrayList.get(givenReferee).getName() == "Pierluigi Collina") {
			collina.trainingLevel();
		} else if (refereeArrayList.get(givenReferee).getName() == "Howard Webb") {
			webb.trainingLevel();
		} else {
			elizondo.trainingLevel();
		}
		
		printMatch(lambdaIPlayable);
		
		match.menu();
			
		} catch (IncorrectAwayStrikerException | IncorrectHomeStrikerException | IncorrectFormation e) {
			LOGGER.error("Please choose a valid option. " + e.getMessage());
		}
	}
	
	static void printMatch(IPlayable match) {
		match.play("!");
	}
}
