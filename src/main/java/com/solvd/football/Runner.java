package com.solvd.football;

import java.util.Scanner;

import com.solvd.football.human.HumanReflection;
import com.solvd.football.human.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.exception.IncorrectHomeStrikerException;
import com.solvd.football.human.Coach;
import com.solvd.football.human.Referee;
import com.solvd.football.inteerface.IPlayable;
import com.solvd.football.team.HomeTeam;
import com.solvd.football.building.Stadium;
import com.solvd.football.building.TrainingCentre;
import com.solvd.football.building.Weather;
import com.solvd.football.collection.CustomLinkedList;
import com.solvd.football.exception.IncorrectAwayStrikerException;
import com.solvd.football.exception.IncorrectFormationException;

public class Runner {

    private static Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

        Stadium borisov = new Stadium(30000, "Borisov Arena");
        Stadium bombo = new Stadium(60000, "La Bombonera");
        Stadium wembley = new Stadium(90000, "Wembley Stadium");

        Stadium.stadiumArrayList.add(borisov);
        Stadium.stadiumArrayList.add(bombo);
        Stadium.stadiumArrayList.add(wembley);

        Referee collina = new Referee("Pierluigi Collina", 45, "ITA", "middle", false, 10, 4, 76);
        Referee webb = new Referee("Howard Webb", 50, "ENG", "middle", false, 11, 5, 80);
        Referee elizondo = new Referee("Horacio Elizondo", 51, "ARG", "middle", false, 9, 5, 70);

        Referee.refereeArrayList.add(collina);
        Referee.refereeArrayList.add(webb);
        Referee.refereeArrayList.add(elizondo);

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

        Match.playerArrayList.add(rooney);
        Match.playerArrayList.add(eto);
        Match.playerArrayList.add(salah);
        Match.playerArrayList.add(pato);
        Match.playerArrayList.add(neuer);
        Match.playerArrayList.add(kudravets);
        Match.playerArrayList.add(messi);
        Match.playerArrayList.add(cristiano);
        Match.playerArrayList.add(hleb);
        Match.playerArrayList.add(cech);
        Match.playerArrayList.add(edwin);
        Match.playerArrayList.add(casillas);

        Match.strikerGoalArrayList.add(5);
        Match.strikerGoalArrayList.add(4);
        Match.strikerGoalArrayList.add(3);

        Match.goalkeeperGoalArrayList.add(3);
        Match.goalkeeperGoalArrayList.add(2);
        Match.goalkeeperGoalArrayList.add(1);

        Match.strikersArrayList.add(messi);
        Match.strikersArrayList.add(cristiano);
        Match.strikersArrayList.add(hleb);

        Match.goalkeepersArrayList.add(cech);
        Match.goalkeepersArrayList.add(edwin);
        Match.goalkeepersArrayList.add(casillas);

        Match.enemyStrikersArrayList.add(rooney);
        Match.enemyStrikersArrayList.add(eto);
        Match.enemyStrikersArrayList.add(salah);

        Match.enemyGoalkeepersArrayList.add(pato);
        Match.enemyGoalkeepersArrayList.add(neuer);
        Match.enemyGoalkeepersArrayList.add(kudravets);

        Match match = new Match();

        IPlayable lambdaIPlayable = () -> {
            if (match.refereeWhistle == true) {
                LOGGER.info("Match will begun soon");
            } else {
                LOGGER.info("Match hasn't started yet. Come again later");
            }
        };

        try (Scanner input = new Scanner(System.in)) {

//		CountryMap countryMap = new CountryMap();
            TrainingCentre trainingCentre = new TrainingCentre();
            LOGGER.info("WELCOME TO THE FOOTBALL SIMULATOR!");

            HomeTeam team = new HomeTeam();

            team.formation();

            LOGGER.info(
                    "Select your tactics. Send HIGH PRESSURE/LOW PRESSURE, COUNTER-ATTACK/POSSESSION, WIDE PLAY/INNER PLAY.");
//		Scanner pres = new Scanner(System.in);
            String pressure = input.next();
//		Scanner pos = new Scanner(System.in);
            String possession = input.next();
//		Scanner play = new Scanner(System.in);
            String playType = input.next();

            CustomLinkedList<String> tacticsList = new CustomLinkedList<>();
            tacticsList.insert(pressure);
            tacticsList.insert(possession);
            tacticsList.insert(playType);
            LOGGER.info("Your tactics will be:");
            tacticsList.show();

            PlayableDay[] playableDay = PlayableDay.values();
            for (int i = 0; i < playableDay.length; i++) {
                LOGGER.info(playableDay[i]);
            }

            PlayableDay sat = PlayableDay.SATURDAY;
            LOGGER.info("This match will be played on " + sat.randomPlayableDay() + ".");

            LOGGER.info(
                    "Type 0 if you want to see the available players and their nationalities. Type any other NUMBER to continue.");
//		Scanner firstChoice = new Scanner (System.in);
            int wantsMap = input.nextInt();
            if (wantsMap == 0) {
                CountryMapEnum[] countryMapEnum = CountryMapEnum.values();
                for (int i = 0; i < countryMapEnum.length; i++) {
                    LOGGER.info(countryMapEnum[i]);
                }
                LOGGER.info("We continue to select the type of match.");
            } else {
                LOGGER.info("We continue to select the type of match.");
            }

            LOGGER.info("Choose between a training match or an official match.");
            LOGGER.info("Type 0 for training match, 1 for official match.");
            int selectedVenue = input.nextInt();
            if (selectedVenue == 1) {

                borisov.selectRandomStadium();

            } else if (selectedVenue == 0) {
                trainingCentre.trainingCentre();
                if (trainingCentre.hasCrowd() == false) {
                    LOGGER.info("Just the managers and the medical group will witness this match.");
                }
            } else {
                borisov.incorrectVenue();
            }

            Weather win = Weather.WINDY;
            LOGGER.info(win.randomWeather());

            Coach coach = new Coach();
            coach.nameCoach();

            collina.selectRandomReferee();

            lambdaIPlayable.play();

            match.menu();

            LOGGER.info("Let's see with whom you'll have to negotiate to employ a referee from the referee list or a striker from the home striker options available.");

            HumanReflection.humanReflection(Referee.refereeArrayList);
            HumanReflection.humanReflection(Match.strikersArrayList);

            Object homeCoachInstruction = new Object();
            Object awayCoachInstruction = new Object();

            FirstHalf firstHalf = new FirstHalf(homeCoachInstruction, awayCoachInstruction);
            firstHalf.start();
            SecondHalf secondHalf = new SecondHalf(homeCoachInstruction, awayCoachInstruction);
            secondHalf.start();


        } catch (IncorrectAwayStrikerException | IncorrectHomeStrikerException | IncorrectFormationException e) {
            LOGGER.error("Please choose a valid option. " + e.getMessage());
        }
    }

//    static void printMatch(IPlayable match) {
//        match.play("!");
//    }
}
