package com.solvd.football.team;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.human.Player;
import com.solvd.football.interfaces.ICheerable;


public class AwayTeam extends Team implements ICheerable {
	
	Logger LOGGER = LogManager.getLogger(HomeTeam.class);
	Player rooney = new Player("Wayne Rooney", 34, "Eng", 0);
	Player eto = new Player("Samuel Eto'o", 37, "Cam", 1);
	Player salah = new Player("Mohamed Salah", 35, "Egy", 2);
	Player pato = new Player("Roberto Abbondanzieri", 35, "Arg", 0);
	Player neuer = new Player("Manuel Neuer", 40, "Ger", 1);
	Player kudravets = new Player("Andrey Kudravets", 35, "Blr", 2);
	
	public int awayGoals() throws IncorrectAwayStrikerException {
		
		ArrayList<Integer> strikerGoalArrayList = new ArrayList<>();
		strikerGoalArrayList.add(5);
		strikerGoalArrayList.add(4);
		strikerGoalArrayList.add(3);
		
		ArrayList<Player> enemyStrikersArrayList = new ArrayList<>();
		enemyStrikersArrayList.add(rooney);
		enemyStrikersArrayList.add(eto);
		enemyStrikersArrayList.add(salah);
		
//		ArrayList<String> enemyStrikerArrayList = new ArrayList<>();
//		enemyStrikerArrayList.add("0-Wayne Rooney");
//		enemyStrikerArrayList.add("1-Samuel Eto'o");
//		enemyStrikerArrayList.add("2-Mohamed Salah");
		
		LOGGER.info("Choose enemy striker. Type 0 for Rooney, 1 for Eto'o or 2 for Salah.");
//		LOGGER.info("These are the strikers available:");
//		LOGGER.info(enemyStrikerArrayList);
		Scanner sc = new Scanner(System.in);
		int chosedEnemyStriker = sc.nextInt();
		
		if (chosedEnemyStriker >= 3) {
			throw new IncorrectAwayStrikerException();
		}
		
		index = enemyStrikersArrayList.get(chosedEnemyStriker).getSkillLevel();
		
//		if (chosedEnemyStriker == 0){
//			LOGGER.info("Wayne Rooney is enemy's striker.");
//			index = rooney.getSkillLevel();
//			
//		} else if (chosedEnemyStriker == 1) {
//			LOGGER.info("Samuel Eto'o is enemy's striker.");
//			index = eto.getSkillLevel();
//		}
//		else if (chosedEnemyStriker == 2) {
//			LOGGER.info("Mohamed Salah is enemy's striker.");
//			index = salah.getSkillLevel();
//		} else {
//			throw new IncorrectAwayStrikerException();
//		}
		
		int positiveAwayTeamGoals = strikerGoalArrayList.get(index);
		return positiveAwayTeamGoals;
		}
	
	public int awaySavedGoals() {
		
		ArrayList<Integer> goalkeeperGoalArrayList = new ArrayList<>();
		goalkeeperGoalArrayList.add(3);
		goalkeeperGoalArrayList.add(2);
		goalkeeperGoalArrayList.add(1);
		
		ArrayList<Player> goalkeepersArrayList = new ArrayList<>();
		goalkeepersArrayList.add(pato);
		goalkeepersArrayList.add(neuer);
		goalkeepersArrayList.add(kudravets);
		
//		ArrayList<String> goalkeeperArrayList = new ArrayList<>();
//		goalkeeperArrayList.add("0-Roberto Abbondanzieri");
//		goalkeeperArrayList.add("1-Manuel Neuer");
//		goalkeeperArrayList.add("2-Andrey Kudravets");
		
		LOGGER.info("Choose the enemy goalkeeper. Type 0 for Abbondanzieri, 1 for Neuer or 2 for Kudravets.");
//		LOGGER.info("These are the goalkeepers available:");
//		LOGGER.info(goalkeeperArrayList);
		Scanner sc = new Scanner(System.in);
		int chosedGoalkeeper = sc.nextInt();
		
		if (chosedGoalkeeper >= 3) {
			throw new RuntimeException("Wrong choice. Try again.");
		}
		
		index = goalkeepersArrayList.get(chosedGoalkeeper).getSkillLevel();
		
//		if (chosedGoalkeeper == 0){
//			LOGGER.info("Roberto Abbondanzieri is enemy's goalkeeper.");
//			index = pato.getSkillLevel();
//			
//		} else if (chosedGoalkeeper == 1) {
//			LOGGER.info("Manuel Neuer is enemy's goalkeeper.");
//			index = neuer.getSkillLevel();
//		}
//		else if (chosedGoalkeeper == 2) {
//			LOGGER.info("Andrey Kudravets is enemy's goalkeeper.");
//			index = kudravets.getSkillLevel();
//		} else {
//			throw new RuntimeException("Wrong choice. Try again.");
//		}
		
		int awayTeamSavedGoals = goalkeeperGoalArrayList.get(index);
		return awayTeamSavedGoals;
	}

	@Override
	public boolean onThePitch() {
		boolean onThePitch = true;
		return onThePitch;
	}

	@Override
	public void cheer() {
		LOGGER.info(FANS + " are cheering for this team!");
		
	}
}
