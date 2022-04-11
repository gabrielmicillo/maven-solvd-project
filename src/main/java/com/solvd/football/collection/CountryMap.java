package com.solvd.football.collection;

import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CountryMap {
	
	Logger LOGGER = LogManager.getLogger(CountryMap.class);
	
	public void countries() {
		
	HashMap<String, String> countriesMap = new HashMap<>();
	
	countriesMap.put("LIONEL", "ARGENTINA");
	countriesMap.put("CRISTIANO RONALDO", "PORTUGAL");
	countriesMap.put("ALIAKSANDR HLEB", "BELARUS");
	countriesMap.put("ROBERTO ABBONDANZIERI", "ARGENTINA");
	countriesMap.put("MANUEL NEUER", "GERMANY");
	countriesMap.put("ANDREY KUDRAVETS", "BELARUS");
	countriesMap.put("WAYNE ROONEY", "ENGLAND");
	countriesMap.put("SAMUEL ETO'O", "CAMEROON");
	countriesMap.put("MOHAMED SALAH", "EGYPT");
	countriesMap.put("PETR CECH", "CZECH REPUBLIC");
	countriesMap.put("EDWIN VAN DER SAR", "NETHERLANDS");
	countriesMap.put("IKER CASILLAS", "SPAIN");
	
	LOGGER.info(countriesMap);
	
	}
}
