package com.solvd.football.building;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.football.inteerface.IAttendable;

public enum Weather {
	
	RAINY("Rainy", 20, 100),
	SUNNY("Sunny", 30, 0),
	SNOWY("Snowy", 0, 50),
	WINDY("Windy", 10, 25);
	
	private String name;
	private int temperature;
	private int humidity;
	
	private Weather(String name, int temperature, int humidity) {
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
	
	public Weather randomWeather() {
		int pick = new Random().nextInt(Weather.values().length);
		return Weather.values()[pick];
	}

	@Override
	public String toString() {
		return "The weather will be [" + name + ", temperature = " + temperature + "°, humidity = " + humidity + "%.]"; 
	}


}
