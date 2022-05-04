package com.solvd.football.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.football.inteerface.IAttendable;

public class TrainingCentre extends Building implements IAttendable {
	Logger LOGGER = LogManager.getLogger(TrainingCentre.class);

	public void trainingCentre() {
		LOGGER.info("This match will be played on home team's training centre.");
	}

	@Override
	public boolean hasCrowd() {
		crowd = 0;
		return false;
	}

	@Override
	public void attend() {
		LOGGER.info("There will not be fans of any team.");
	}
}
