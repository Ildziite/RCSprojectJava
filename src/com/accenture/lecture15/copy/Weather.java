package com.accenture.lecture15.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Weather {

	final String country;
	ArrayList<DayWeather> weatherList;

	public Weather(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void addDayWeather(int year, int month, int date) {
		DayWeather dayW = new DayWeather(year, month, date);
		this.weatherList.add(dayW);
	}

	public void addRandomDayWeather(int year, int month, int date) {
		DayWeather dayW = new DayWeather(year, month, date);
		this.weatherList.add(dayW);
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
