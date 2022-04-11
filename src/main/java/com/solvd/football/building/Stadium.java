package com.solvd.football.building;

import java.util.ArrayList;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.interfaces.IAttendable;

public class Stadium extends Building implements IAttendable {
	
	Logger LOGGER = LogManager.getLogger(Stadium.class);
	Random random = new Random();
	
	public String stadiumSelection() {
		ArrayList<String> stadiumArrayList = new ArrayList<>();
		stadiumArrayList.add("BORISOV ARENA");
		stadiumArrayList.add("LA BOMBONERA");
		stadiumArrayList.add("WEMBLEY STADIUM");
		String randomStadium = stadiumArrayList.get(random.nextInt(3));
		LOGGER.info("The stadium for this match will be " + randomStadium + ".");
		return randomStadium;
	}
	
	@Override
	public boolean hasCrowd() {
		return true;
	}
	
	
	public int attendance(String stadium) {
		if (stadium == "BORISOV ARENA") {
			crowd = 30000;
		} else if (stadium == "LA BOMBONERA") {
			crowd = 60000;
		} else if (stadium == "WEMBLEY STADIUM") {
			crowd = 90000;
		}
		LOGGER.info("The expected attendance today is " + crowd + " spectators.");
		return crowd;
	}

	@Override
	public void attend() {
		LOGGER.info("Fans of both teams will attend to this match.");
	}
}
