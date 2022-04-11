package com.solvd.football.team;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.human.Player;
import com.solvd.football.interfaces.ICheerable;


public class HomeTeam extends Team implements ICheerable {
	
	Logger LOGGER = LogManager.getLogger(HomeTeam.class);
	Player messi = new Player("Lionel Messi", 34, "Arg", 0);
	Player cristiano = new Player("Cristiano Ronaldo", 37, "Por", 1);
	Player hleb = new Player("Aliaksandr Hleb", 35, "Blr", 2);
	Player cech = new Player("Petr Cech", 35, "Cze", 0);
	Player edwin = new Player("Edwin van der Sar", 40, "Ned", 1);
	Player casillas = new Player("Iker Casillas", 35, "Esp", 2);
	
	public int homeGoals() throws IncorrectHomeStrikerException {
		
		ArrayList<Integer> strikerGoalArrayList = new ArrayList<>();
		strikerGoalArrayList.add(5);
		strikerGoalArrayList.add(4);
		strikerGoalArrayList.add(3);
		
		ArrayList<Player> strikersArrayList = new ArrayList<>();
		strikersArrayList.add(messi);
		strikersArrayList.add(cristiano);
		strikersArrayList.add(hleb);
		
//		ArrayList<String> strikerArrayList = new ArrayList<>();
//		strikerArrayList.add("0-Lionel Messi");
//		strikerArrayList.add("1-Cristiano Ronaldo");
//		strikerArrayList.add("2-Aliaksandr Hleb");
		
		LOGGER.info("Choose your striker. Type 0 for Messi, 1 for Cristiano Ronaldo or 2 for Aliaksandr Hleb.");
//		LOGGER.info("These are the strikers available:");
//		LOGGER.info(strikerArrayList);
		Scanner sc = new Scanner(System.in);
		int chosedStriker = sc.nextInt();
		
		if (chosedStriker >= 3) {
			throw new IncorrectHomeStrikerException();
		}
		
		index = strikersArrayList.get(chosedStriker).getSkillLevel();
		
//		if (chosedStriker == 0){
//			LOGGER.info("Lionel Messi is your striker.");
//			index = messi.getSkillLevel();
//		} else if (chosedStriker == 1) {
//			LOGGER.info("Cristiano Ronaldo is your striker.");
//			index = cristiano.getSkillLevel();
//		}
//		else if (chosedStriker == 2) {
//			LOGGER.info("Aliaksandr Hleb is your striker.");
//			index = hleb.getSkillLevel();
//		} 
	
		
		int positiveHomeTeamGoals = strikerGoalArrayList.get(index);
		return positiveHomeTeamGoals;
	}
	
	public int savedGoals() {
		
		ArrayList<Integer> goalkeeperGoalArrayList = new ArrayList<>();
		goalkeeperGoalArrayList.add(3);
		goalkeeperGoalArrayList.add(2);
		goalkeeperGoalArrayList.add(1);
		
		ArrayList<Player> goalkeepersArrayList = new ArrayList<>();
		goalkeepersArrayList.add(cech);
		goalkeepersArrayList.add(edwin);
		goalkeepersArrayList.add(casillas);
		
//		ArrayList<String> goalkeeperArrayList = new ArrayList<>();
//		goalkeeperArrayList.add("0-Petr Cech");
//		goalkeeperArrayList.add("1-Edwin Van der Sar");
//		goalkeeperArrayList.add("2-Iker Casillas");
		
		LOGGER.info("Choose your goalkeeper. Type 0 for Cech, 1 for van der Sar or 2 for Casillas.");
//		LOGGER.info("These are the goalkeepers available:");
//		LOGGER.info(goalkeeperArrayList);
		Scanner sc = new Scanner(System.in);
		int chosedGoalkeeper = sc.nextInt();
		
		if (chosedGoalkeeper >= 3) {
			throw new RuntimeException("Wrong choice. Try again.");
		}
		
		
		index = goalkeepersArrayList.get(chosedGoalkeeper).getSkillLevel();
		
//		if (chosedGoalkeeper == 0){
//			LOGGER.info("Petr Cech is your goalkeeper.");
//			index = cech.getSkillLevel();
//			
//		} else if (chosedGoalkeeper == 1) {
//			LOGGER.info("Edwin Van der Sar is your goalkeeper.");
//			index = edwin.getSkillLevel();
//		}
//		else if (chosedGoalkeeper == 2) {
//			LOGGER.info("Iker Casillas is your goalkeeper.");
//			index = casillas.getSkillLevel();
//		} else {
//			throw new RuntimeException("Wrong choice. Try again.");
//		}
		
		int homeTeamSavedGoals = goalkeeperGoalArrayList.get(index);
		return homeTeamSavedGoals;
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