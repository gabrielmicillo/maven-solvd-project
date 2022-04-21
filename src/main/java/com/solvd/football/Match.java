package com.solvd.football;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.exception.IncorrectVenue;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.exception.IncorrectFormation;
import com.solvd.football.exception.IncorrectGoalkeeper;
import com.solvd.football.human.Coach;
import com.solvd.football.human.Player;
import com.solvd.football.human.Referee;
import com.solvd.football.inteerface.IPlayable;
import com.solvd.football.team.HomeTeam;
import com.solvd.football.team.AwayTeam;
import com.solvd.football.building.Stadium;
import com.solvd.football.building.TrainingCentre;
import com.solvd.football.collection.CountryMap;
import com.solvd.football.collection.CustomLinkedList;
import com.solvd.football.building.Weather;

public class Match implements IPlayable {
	
	private static Logger LOGGER = LogManager.getLogger(Match.class);
	
	boolean refereeWhistle = true;
	
	public void menu() throws IncorrectAwayStrikerException, IncorrectHomeStrikerException, IncorrectFormation, IncorrectGoalkeeper {
		HomeTeam hometeam = new HomeTeam();
		AwayTeam awayteam = new AwayTeam();
//		Stadium stadium = new Stadium();
//		CountryMap countryMap = new CountryMap();
//		TrainingCentre trainingCentre = new TrainingCentre();
//		LOGGER.info("WELCOME TO THE FOOTBALL SIMULATOR!");
//		
//		LOGGER.info("Select your formation. Send your number of defenders, then your number of midfielders and then your number of strikers. The total must be 10.");
//		Scanner def = new Scanner(System.in);
//		int defenders = def.nextInt();
//		Scanner mid = new Scanner(System.in);
//		int midfielders = mid.nextInt();
//		Scanner str = new Scanner(System.in);
//		int strikers = str.nextInt();
//		if ( (defenders + midfielders + strikers) != 10 ) {
//			throw new IncorrectFormation();
//		}
//		
//		CustomLinkedList<Integer> formationList = new CustomLinkedList<>();
//		formationList.insert(defenders);
//		formationList.insert(midfielders);
//		formationList.insert(strikers);
//		LOGGER.info("Your formation on the field will be:");
//		formationList.show();
//		
//		LOGGER.info("Select your tactics. Send HIGH PRESSURE/LOW PRESSURE, COUNTER-ATTACK/POSSESSION, WIDE PLAY/INNER PLAY.");
//		Scanner pres = new Scanner(System.in);
//		String pressure = pres.nextLine();
//		Scanner pos = new Scanner(System.in);
//		String possession = pos.nextLine();
//		Scanner play = new Scanner(System.in);
//		String playType = play.nextLine();
//		
//		CustomLinkedList<String> tacticsList = new CustomLinkedList<>();
//		tacticsList.insert(pressure);
//		tacticsList.insert(possession);
//		tacticsList.insert(playType);
//		LOGGER.info("Your tactics will be:");
//		tacticsList.show();
//		
//		PlayableDay[] playableDay = PlayableDay.values();
//		for(int i = 0; i < playableDay.length; i++) {
//			LOGGER.info(playableDay[i]);
//		}
//		
//		
//		
//		PlayableDay sat = PlayableDay.SATURDAY;
//		LOGGER.info("This match will be played on " + sat.randomPlayableDay() + ".");
//		
//		LOGGER.info("Type 0 if you want to see the available players and their nationalities. Type any other NUMBER to continue.");
//		Scanner firstChoice = new Scanner (System.in);
//		int wantsMap = firstChoice.nextInt();
//		if (wantsMap == 0) {
//			
////			countryMap.countries();
//			
//			CountryMapEnum[] countryMapEnum = CountryMapEnum.values();
//			for(int i = 0; i < countryMapEnum.length; i++) {
//				LOGGER.info(countryMapEnum[i]);
//			}
//			
//			LOGGER.info("We continue to select the type of match.");
//		} else {
//			LOGGER.info("We continue to select the type of match.");
//		}
//		
//		
		
		
		
		
//		LOGGER.info("Choose between a training match or an official match.");
//		LOGGER.info("Type 0 for training match, 1 for official match.");
//		Scanner venue = new Scanner(System.in);
//		int selectedVenue = venue.nextInt();
//		if (selectedVenue == 1) {
//			
//			Stadium borisov = new Stadium(30000, "Borisov Arena");
//			Stadium bombo = new Stadium(60000, "La Bombonera");
//			Stadium wembley = new Stadium(90000, "Wembley Stadium");
//			
//			ArrayList<Stadium> stadiumArrayList = new ArrayList <>();
//			stadiumArrayList.add(borisov);
//			stadiumArrayList.add(bombo);
//			stadiumArrayList.add(wembley);
//			
//			int pick = new Random().nextInt(stadiumArrayList.size());
//			LOGGER.info("The match will be played in " + stadiumArrayList.get(pick).getStadiumName() + ".");
//			LOGGER.info("The crowd will be " + stadiumArrayList.get(pick).getCrowd() + " spectators.");
//			
//			
////			StadiumEnum[] stadiumenum = StadiumEnum.values();
////			for(int i = 0; i < stadiumenum.length; i++) {
////				LOGGER.info(stadiumenum[i]);
////			}
////			
////			StadiumEnum bor = StadiumEnum.BORISOV_ARENA;
////			LOGGER.info("This match will be played on " + bor.randomStadium() + ".");
//			
////			stadium.attendance(stadium.stadiumSelection());
//			
//			if (stadium.hasCrowd() == true) {
//				LOGGER.info("The fans are coming to the stadium!");
//			}
//			
//		} else if (selectedVenue == 0) {
//			trainingCentre.trainingCentre();
//			if (trainingCentre.hasCrowd() == false) {
//				LOGGER.info("Just the managers and the medical group will witness this match.");
//			}	
//		} else {
//			throw new IncorrectVenue();
//		}
//		
//		
//		
//		Weather win = Weather.WINDY;
//		LOGGER.info(win.randomWeather());
//		
//		
//		
//		
//		Coach coach = new Coach();
//		coach.nameCoach();
//		
//		
//		
//		
////		Referee referee = new Referee ();
////		referee.randomReferee();
//		Referee collina = new Referee("Pierluigi Collina", 45, "ITA", "middle", false, 10, 4, 76);
//		Referee webb = new Referee("Howard Webb", 50, "ENG", "middle", false, 11, 5, 80);
//		Referee elizondo = new Referee("Horacio Elizondo", 51, "ARG", "middle", false, 9, 5, 70);
//		
//		ArrayList<Referee> refereeArrayList = new ArrayList <>();
//		refereeArrayList.add(collina);
//		refereeArrayList.add(webb);
//		refereeArrayList.add(elizondo);
//		
//		Random randomReferee = new Random();
//		int givenReferee = randomReferee.nextInt(3);
//		LOGGER.info("The assigned referee for this match will be: " + refereeArrayList.get(givenReferee).getName() + ".");
//		if (refereeArrayList.get(givenReferee).getName() == "Pierluigi Collina") {
//			collina.trainingLevel();
//		} else if (refereeArrayList.get(givenReferee).getName() == "Howard Webb") {
//			webb.trainingLevel();
//		} else {
//			elizondo.trainingLevel();
//		}
		
		Player rooney = new Player("Wayne Rooney", 34, "Eng", "high", true, 0, 90, 2);
		Player eto = new Player("Samuel Eto'o", 37, "Cam", "high", true, 1, 90, 6);
		Player salah = new Player("Mohamed Salah", 35, "Egy", "high", true, 2, 90, 1);
		Player pato = new Player("Roberto Abbondanzieri", 35, "Arg", "high", true, 0, 90, 0);
		Player neuer = new Player("Manuel Neuer", 40, "Ger", "high", true, 1, 90, 7);
		Player kudravets = new Player("Andrey Kudravets", 35, "Blr", "high", true, 2, 90, 2);
		Player messi = new Player("Lionel Messi", 34, "Arg", "high", true, 0, 90, 2);
		Player cristiano = new Player("Cristiano Ronaldo", 37, "Por", "high", true, 1, 90, 3);
		Player hleb = new Player("Aliaksandr Hleb", 35, "Blr", "high", true, 2, 90, 1);
		Player cech = new Player("Petr Cech", 35, "Cze", "high", true, 0, 90, 0);
		Player edwin = new Player("Edwin van der Sar", 40, "Ned", "high", true, 1, 90, 5);
		Player casillas = new Player("Iker Casillas", 35, "Esp", "high", true, 2, 90, 4);
		

		ArrayList<Player> playerArrayList = new ArrayList<>();
		playerArrayList.add(rooney);
		playerArrayList.add(eto);
		playerArrayList.add(salah);
		playerArrayList.add(pato);
		playerArrayList.add(neuer);
		playerArrayList.add(kudravets);
		playerArrayList.add(messi);
		playerArrayList.add(cristiano);
		playerArrayList.add(hleb);
		playerArrayList.add(cech);
		playerArrayList.add(edwin);
		playerArrayList.add(casillas);
		
//		ArrayList<Player> sortedList = (ArrayList<Player>) playerArrayList.stream()
//				.sorted(Comparator.comparing(player -> player.getName()))
//				.collect(Collectors.toList());
//		
//		sortedList.forEach(player -> LOGGER.info(player.getName()));
				
		ArrayList<Player> skilledSortedClub = (ArrayList<Player>) playerArrayList.stream()
				.filter(player -> player.getSkillLevel() < 1)
				.sorted(Comparator.comparing(player -> player.getName()))
				.collect(Collectors.toList());
		
//		for (Player p : playerArrayList) {
//			if(p.getSkillLevel() < 1) {
//				skilledClub.add(p);
//			}
//		}
		
		skilledSortedClub.forEach(player -> LOGGER.info(player.getName()));
		
		ArrayList<Integer> strikerGoalArrayList = new ArrayList<>();
		strikerGoalArrayList.add(5);
		strikerGoalArrayList.add(4);
		strikerGoalArrayList.add(3);
		
//		ArrayList<Integer> strikerGoalArrayList = new ArrayList<>();
//		strikerGoalArrayList.add(5);
//		strikerGoalArrayList.add(4);
//		strikerGoalArrayList.add(3);
		
		ArrayList<Integer> goalkeeperGoalArrayList = new ArrayList<>();
		goalkeeperGoalArrayList.add(3);
		goalkeeperGoalArrayList.add(2);
		goalkeeperGoalArrayList.add(1);
		
		
		
		ArrayList<Player> strikersArrayList = new ArrayList<>();
		strikersArrayList.add(messi);
		strikersArrayList.add(cristiano);
		strikersArrayList.add(hleb);
		
		ArrayList<Player> goalkeepersArrayList = new ArrayList<>();
		goalkeepersArrayList.add(cech);
		goalkeepersArrayList.add(edwin);
		goalkeepersArrayList.add(casillas);
		
		ArrayList<Player> enemyStrikersArrayList = new ArrayList<>();
		enemyStrikersArrayList.add(rooney);
		enemyStrikersArrayList.add(eto);
		enemyStrikersArrayList.add(salah);
		
		ArrayList<Player> enemyGoalkeepersArrayList = new ArrayList<>();
		enemyGoalkeepersArrayList.add(pato);
		enemyGoalkeepersArrayList.add(neuer);
		enemyGoalkeepersArrayList.add(kudravets);
		
		LOGGER.info("Choose enemy striker. Type 0 for Rooney, 1 for Eto'o or 2 for Salah.");
		
		Scanner sc = new Scanner(System.in);
		int chosedEnemyStriker = sc.nextInt();
		
		if (chosedEnemyStriker >= 3) {
			throw new IncorrectAwayStrikerException();
		}
		
		int awayStrIndex = enemyStrikersArrayList.get(chosedEnemyStriker).getSkillLevel();
		int positiveAwayTeamGoals = strikerGoalArrayList.get(awayStrIndex);
		
		LOGGER.info("Choose the enemy goalkeeper. Type 0 for Abbondanzieri, 1 for Neuer or 2 for Kudravets.");
		
		Scanner sca = new Scanner(System.in);
		int chosedEnemyGoalkeeper = sca.nextInt();
		
		if (chosedEnemyGoalkeeper >= 3) {
			throw new IncorrectGoalkeeper();
		}
		
		int awayGkIndex = enemyGoalkeepersArrayList.get(chosedEnemyGoalkeeper).getSkillLevel();
		int awayTeamSavedGoals = goalkeeperGoalArrayList.get(awayGkIndex);
		
		LOGGER.info("Choose your striker. Type 0 for Messi, 1 for Cristiano Ronaldo or 2 for Aliaksandr Hleb.");
		
		Scanner scan = new Scanner(System.in);
		int chosedStriker = scan.nextInt();
		
		if (chosedStriker >= 3) {
			throw new IncorrectHomeStrikerException();
		}
		
		int homeStrIndex = strikersArrayList.get(chosedStriker).getSkillLevel();
		int positiveHomeTeamGoals = strikerGoalArrayList.get(homeStrIndex);
		
		LOGGER.info("Choose your goalkeeper. Type 0 for Cech, 1 for van der Sar or 2 for Casillas.");
		Scanner scann = new Scanner(System.in);
		int chosedGoalkeeper = scann.nextInt();
		
		if (chosedGoalkeeper >= 3) {
			throw new IncorrectGoalkeeper();
		}
		
		int homeGkIndex = goalkeepersArrayList.get(chosedGoalkeeper).getSkillLevel();
		int homeTeamSavedGoals = goalkeeperGoalArrayList.get(homeGkIndex);
		
		int homeTeamGoals = (positiveHomeTeamGoals - awayTeamSavedGoals);
		int awayTeamGoals = (positiveAwayTeamGoals - homeTeamSavedGoals);
		
		
		
		
		
		LOGGER.info("Your team scored "+ homeTeamGoals + " goals.");
		LOGGER.info("Enemy team scored "+ awayTeamGoals + " goals.");
		LOGGER.info("THE FINAL SCORE IS: HOME TEAM " + homeTeamGoals + " - " + awayTeamGoals + " AWAY TEAM.");
		
		
		
	}
	@Override
	public void play(String suffix) {
		if (refereeWhistle == true) {
			LOGGER.info("Match has begun!");
		} else {
			LOGGER.info("Match hasn't started yet. Come again later.");
		}
		
	}
}
