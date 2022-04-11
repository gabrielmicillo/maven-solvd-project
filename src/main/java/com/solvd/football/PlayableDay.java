package com.solvd.football;

import java.util.Random;

public enum PlayableDay {
	WEDNESDAY,
	SATURDAY,
	SUNDAY;
	
	public PlayableDay randomPlayableDay() {
	    int pick = new Random().nextInt(PlayableDay.values().length);
	    return PlayableDay.values()[pick];
	}
}
