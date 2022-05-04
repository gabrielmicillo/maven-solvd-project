package com.solvd.football;

import java.util.Random;

public enum PlayableDay {
    WEDNESDAY("Wednesday", 4, "Dark", 10), SATURDAY("Saturday", 8, "Sun", 15), SUNDAY("Sunday", 8, "Sun", 20);

    private String dayName;
    private int playableHours;
    private String dayLight;
    private int quantityOfMatches;

    private PlayableDay(String dayName, int playableHours, String dayLight, int quantityOfMatches) {
        this.dayName = dayName;
        this.playableHours = playableHours;
        this.dayLight = dayLight;
        this.quantityOfMatches = quantityOfMatches;
    }

    public PlayableDay randomPlayableDay() {
        int pick = new Random().nextInt(PlayableDay.values().length);
        return PlayableDay.values()[pick];
    }

    public double matchesPerHour() {
        return this.quantityOfMatches / this.playableHours;
    }

    @Override
    public String toString() {
        return "PlayableDay[" + "dayName= " + dayName + ", playableHours= " + playableHours + ", dayLight= " + dayLight
                + ", quantityOfMatches= " + quantityOfMatches + "]";
    }
}
