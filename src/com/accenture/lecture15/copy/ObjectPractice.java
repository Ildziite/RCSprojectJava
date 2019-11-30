package com.accenture.lecture15.copy;

public class ObjectPractice {

	public static void main(String[] args) {

		Weather latvia = new Weather("Latvia");
		latvia.addDayWeather(119, 5, 24, 12, 15, 10, 12, "E");
		latvia.addDefaultDayWeather(119, 0, 1);
		latvia.addDefaultDayWeather(119, 11, 31);
		latvia.addRandomDayWeather();
		latvia.addRandomDayWeather();
		latvia.addRandomDayWeather();
		latvia.addRandomDayWeather();
		latvia.printForecast();
		System.out.println("Hottest temperature in " + latvia.getCountry()
				+ " is " + latvia.getHottestTemperature() + " on "
				+ latvia.getHottestTempDate());

	}

}