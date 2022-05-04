package com.solvd.football;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.exception.IncorrectFormationException;
import com.solvd.football.exception.IncorrectGoalkeeperException;
import com.solvd.football.human.Player;
import com.solvd.football.inteerface.IPlayable;

public class Match {

	public static ArrayList<Player> playerArrayList = new ArrayList<>();
	public static ArrayList<Integer> strikerGoalArrayList = new ArrayList<>();
	public static ArrayList<Integer> goalkeeperGoalArrayList = new ArrayList<>();
	public static ArrayList<Player> strikersArrayList = new ArrayList<>();
	public static ArrayList<Player> goalkeepersArrayList = new ArrayList<>();
	public static ArrayList<Player> enemyStrikersArrayList = new ArrayList<>();
	public static ArrayList<Player> enemyGoalkeepersArrayList = new ArrayList<>();

	private static Logger LOGGER = LogManager.getLogger(Match.class);

	boolean refereeWhistle = true;

	public void menu() throws IncorrectAwayStrikerException, IncorrectHomeStrikerException, IncorrectFormationException,
			IncorrectGoalkeeperException {

		LOGGER.info("Those are the most skilled player on the game:");

		ArrayList<Player> skilledSortedClub = (ArrayList<Player>) playerArrayList.stream()
				.filter(player -> player.getSkillLevel() < 1).sorted(Comparator.comparing(player -> player.getName()))
				.collect(Collectors.toList());

		skilledSortedClub.forEach(player -> LOGGER.info(player.getName()));

		Scanner input = new Scanner(System.in);

		LOGGER.info("Choose your goalkeeper. Type 0 for Cech, 1 for van der Sar or 2 for Casillas.");

		int chosedGoalkeeper = input.nextInt();

		if (chosedGoalkeeper >= 3) {
			throw new IncorrectGoalkeeperException();
		}

		int homeGkIndex = goalkeepersArrayList.get(chosedGoalkeeper).getSkillLevel();
		int homeTeamSavedGoals = goalkeeperGoalArrayList.get(homeGkIndex);

		LOGGER.info("Choose your striker. Type 0 for Messi, 1 for Cristiano Ronaldo or 2 for Aliaksandr Hleb.");

		int chosedStriker = input.nextInt();

		if (chosedStriker >= 3) {
			throw new IncorrectHomeStrikerException();
		}

		int homeStrIndex = strikersArrayList.get(chosedStriker).getSkillLevel();
		int positiveHomeTeamGoals = strikerGoalArrayList.get(homeStrIndex);

		LOGGER.info("Choose the enemy goalkeeper. Type 0 for Abbondanzieri, 1 for Neuer or 2 for Kudravets.");

		int chosedEnemyGoalkeeper = input.nextInt();

		if (chosedEnemyGoalkeeper >= 3) {
			throw new IncorrectGoalkeeperException();
		}

		int awayGkIndex = enemyGoalkeepersArrayList.get(chosedEnemyGoalkeeper).getSkillLevel();
		int awayTeamSavedGoals = goalkeeperGoalArrayList.get(awayGkIndex);

		LOGGER.info("Choose enemy striker. Type 0 for Rooney, 1 for Eto'o or 2 for Salah.");

		int chosedEnemyStriker = input.nextInt();

		if (chosedEnemyStriker >= 3) {
			throw new IncorrectAwayStrikerException();
		}

		int awayStrIndex = enemyStrikersArrayList.get(chosedEnemyStriker).getSkillLevel();
		int positiveAwayTeamGoals = strikerGoalArrayList.get(awayStrIndex);

		int homeTeamGoals = (positiveHomeTeamGoals - awayTeamSavedGoals);
		int awayTeamGoals = (positiveAwayTeamGoals - homeTeamSavedGoals);

		LOGGER.info("Your team scored " + homeTeamGoals + " goals.");
		LOGGER.info("Enemy team scored " + awayTeamGoals + " goals.");
		LOGGER.info("THE FINAL SCORE IS: HOME TEAM " + homeTeamGoals + " - " + awayTeamGoals + " AWAY TEAM.");

	}

//	@Override
//	public void play() {
//		if (refereeWhistle == true) {
//			LOGGER.info("Match has begun!");
//		} else {
//			LOGGER.info("Match hasn't started yet. Come again later.");
//		}
//
//	}
}
