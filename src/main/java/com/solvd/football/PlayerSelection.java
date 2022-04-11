package com.solvd.football;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PlayerSelection {
	private static Logger LOGGER = LogManager.getLogger(PlayerSelection.class);
	public static void main (String[] args) {
		ArrayList<String> goalkeepersArrayList = new ArrayList<>();
		goalkeepersArrayList.add("0-Buffon");
		goalkeepersArrayList.add("1-Cech");
		goalkeepersArrayList.add("2-Casillas");
		goalkeepersArrayList.add("3-Van der Sar");
		goalkeepersArrayList.add("4-Neuer");
		
		ArrayList<String> defendersArrayList = new ArrayList<>();
		defendersArrayList.add("0-Terry");
		defendersArrayList.add("1-Lucio");
		defendersArrayList.add("2-Vidic");
		defendersArrayList.add("3-van Dijk");
		defendersArrayList.add("4-Sergio Ramos");
		defendersArrayList.add("5-Puyol");
		defendersArrayList.add("6-Ferdinand");
		defendersArrayList.add("7-Maicon");
		
		ArrayList<String> midfieldersArrayList = new ArrayList<>();
		midfieldersArrayList.add("0-Riquelme");
		midfieldersArrayList.add("1-Essien");
		midfieldersArrayList.add("2-Makelele");
		midfieldersArrayList.add("3-Kante");
		midfieldersArrayList.add("4-Mascherano");
		midfieldersArrayList.add("5-Lampard");
		midfieldersArrayList.add("6-Pirlo");
		midfieldersArrayList.add("7-Iniesta");
		
		ArrayList<String> strikersArrayList = new ArrayList<>();
		strikersArrayList.add("0-Cristiano Ronaldo");
		strikersArrayList.add("1-Messi");
		strikersArrayList.add("2-Hleb");
		strikersArrayList.add("3-Drogba");
		strikersArrayList.add("4-Anelka");
		strikersArrayList.add("5-Fernando Torres");
		strikersArrayList.add("6-Benzema");
		strikersArrayList.add("7-Eto'o");
		
		LOGGER.info("These are the goalkeepers available:");
		LOGGER.info(goalkeepersArrayList);
		LOGGER.info("These are the defenders available:");
		LOGGER.info(defendersArrayList);
		LOGGER.info("These are the midfielders available:");
		LOGGER.info(midfieldersArrayList);
		LOGGER.info("These are the strikers available:");
		LOGGER.info(strikersArrayList);
		
		LinkedList<String> homeTeamLinkedList = new LinkedList<>();
		LOGGER.info("PICK 1 GOALKEEPER (enter value between 0 and 4)");
		Scanner selectedGoalkeeper = new Scanner(System.in);
		int goalkeeper = selectedGoalkeeper.nextInt();
		homeTeamLinkedList.add(goalkeepersArrayList.get(goalkeeper));
		LOGGER.info("PICK 1 DEFENDER (enter value between 0 and 7)");
		Scanner selectedDefender = new Scanner(System.in);
		int defender = selectedDefender.nextInt();
		homeTeamLinkedList.add(defendersArrayList.get(defender));
		LOGGER.info("PICK 2 MIDFIELDERS (enter value between 0 and 7)");
		Scanner selectedFirstMidfielder = new Scanner(System.in);
		int firstMidfielder = selectedFirstMidfielder.nextInt();
		homeTeamLinkedList.add(midfieldersArrayList.get(firstMidfielder));
		Scanner selectedSecondMidfielder = new Scanner(System.in);
		int secondMidfielder = selectedSecondMidfielder.nextInt();
		homeTeamLinkedList.add(midfieldersArrayList.get(secondMidfielder));
		LOGGER.info("PICK 1 STRIKER (enter value between 0 and 7)");
		Scanner selectedStriker = new Scanner(System.in);
		int striker = selectedStriker.nextInt();
		homeTeamLinkedList.add(strikersArrayList.get(striker));
		LOGGER.info(homeTeamLinkedList);
	}
}
