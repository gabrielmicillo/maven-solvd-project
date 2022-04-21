package com.solvd.football;

public enum CountryMapEnum {
	MESSI("Lionel Messi", "ARG", 10),
	CRISTIANO("Cristiano Ronaldo", "POR", 7),
	HLEB("Aliaksandr Hleb", "BLR", 11),
	ABBONDANZIERI("Roberto Abbondanzieri", "ARG", 1),
	NEUER("Manuel Neuer", "GER", 21),
	KUDRAVETS("Andrey Kudravets", "BLR", 99),
	ROONEY("Wayne Rooney", "ENG", 8),
	ETO("Samuel Eto'o", "CAM", 15),
	SALAH("Mohamed Salah", "EGY", 15),
	CECH("Petr Cech", "CZE", 22),
	VAN_DER_SAR("Edwin Van der Sar", "NED", 25),
	CASILLAS("Iker Casillas", "ESP", 98);
	
	private String officialName;
	private String country;
	private int shirtNumber;
	
	private CountryMapEnum(String officialName, String country, int shirtNumber) {
		this.officialName = officialName;
		this.country = country;
		this.shirtNumber = shirtNumber;
	}
	
	@Override
	public String toString() {
		return "Player info[" + "Name= " + officialName + ", Country= " + country + ", Shirt Number= " + shirtNumber + "]";
	}
}
