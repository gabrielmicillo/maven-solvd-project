package com.solvd.football;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.exception.IncorrectFormation;
import com.solvd.football.human.Coach;
import com.solvd.football.human.Referee;
import com.solvd.football.inteerface.IPlayable;
import com.solvd.football.team.HomeTeam;
import com.solvd.football.team.AwayTeam;
import com.solvd.football.building.Stadium;
import com.solvd.football.building.TrainingCentre;
import com.solvd.football.collection.CountryMap;
import com.solvd.football.collection.CustomLinkedList;

public class Match implements IPlayable {
	
	private static Logger LOGGER = LogManager.getLogger(Match.class);
	
	boolean refereeWhistle = true;
	
	public void menu() throws IncorrectAwayStrikerException, IncorrectHomeStrikerException, IncorrectFormation {
		HomeTeam hometeam = new HomeTeam();
		AwayTeam awayteam = new AwayTeam();
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
		
		PlayableDay sat = PlayableDay.SATURDAY;
		LOGGER.info("This match will be played on " + sat.randomPlayableDay() + ".");
		
		LOGGER.info("Type 0 if you want to see the available players and their nationalities. Type any other NUMBER to continue.");
		Scanner firstChoice = new Scanner (System.in);
		int wantsMap = firstChoice.nextInt();
		if (wantsMap == 0) {
			countryMap.countries();
			LOGGER.info("We continue to select the type of match.");
		} else {
			LOGGER.info("We continue to select the type of match.");
		}
		LOGGER.info("Choose between a training match or an official match.");
		LOGGER.info("Type 0 for training match, 1 for official match.");
		Scanner venue = new Scanner(System.in);
		int selectedVenue = venue.nextInt();
		if (selectedVenue == 1) {
			stadium.attendance(stadium.stadiumSelection());
			if (stadium.hasCrowd() == true) {
				LOGGER.info("The fans are coming to the stadium!");
			}
		} else if (selectedVenue == 0) {
			trainingCentre.trainingCentre();
			if (trainingCentre.hasCrowd() == false) {
				LOGGER.info("Just the managers and the medical group will witness this match.");
			}	
		} else {
			throw new RuntimeException("Wrong choice. Try again.");
		}
		
		Coach coach = new Coach();
		coach.nameCoach();
		Referee referee = new Referee ();
		referee.randomReferee();
		
		int HomeTeamGoals = (hometeam.homeGoals() - awayteam.awaySavedGoals());
		int AwayTeamGoals = (awayteam.awayGoals() - hometeam.savedGoals());
		
		LOGGER.info("Your team scored "+ HomeTeamGoals + " goals.");
		LOGGER.info("Enemy team scored "+ AwayTeamGoals + " goals.");
		LOGGER.info("THE FINAL SCORE IS: HOME TEAM " + HomeTeamGoals + " - " + AwayTeamGoals + " AWAY TEAM.");
		
		
	}
	@Override
	public void play() {
		if (refereeWhistle == true) {
			LOGGER.info("Match has begun!");
		} else {
			LOGGER.info("Match hasn't started yet. Come again later.");
		}
		
	}
}
