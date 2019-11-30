package com.accenture.lecture15.copy;

import java.util.ArrayList;
import java.util.Date;

public class Weather {

	final String country;
	ArrayList<DayWeather> weatherList = new ArrayList<>();

	public Weather(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void addDayWeather(int year, int month, int date, int minTemp,
			int maxTemp, int minWind, int maxWind, String wind) {
		DayWeather dayW = new DayWeather(year, month, date, minTemp, maxTemp,
				minWind, maxWind, wind);
		this.weatherList.add(dayW);
	}

	public void addDefaultDayWeather(int year, int month, int date) {
		DayWeather dayW = new DayWeather(year, month, date);
		this.weatherList.add(dayW);
	}

	public void addRandomDayWeather() {
		this.weatherList.add(DayWeather.makeRandomForecast());
	}

	public int getHottestIndex() {
		int maxT = this.weatherList.get(0).getMaxTemp();
		int maxIndex = 0;
		for (int i = 1; i < this.weatherList.size(); i++) {
			if (this.weatherList.get(i).getMaxTemp() > maxT) {
				maxT = this.weatherList.get(i).getMaxTemp();
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public int getHottestTemperature() {
		return this.weatherList.get(this.getHottestIndex()).getMaxTemp();
	}

	public Date getHottestTempDate() {
		return this.weatherList.get(this.getHottestIndex()).getDay();
	}

	public void printForecast() {
		System.out.println("Weather forecast in " + this.country + " for");
		for (int i = 0; i < this.weatherList.size(); i++) {
			System.out.println(this.weatherList.get(i));
		}
	}
	// public String toString() {
	// return "Weather forecast in '" + this.country + "' for next days '"
	// + Arrays.toString(this.getDaysWeather()) +
	// "'. Wind forecast "+Arrays.toString(this.getWindWeather());
	// }

}
