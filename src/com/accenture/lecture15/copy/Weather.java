package com.accenture.lecture15.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Weather {

	final String country;
	ArrayList<DayWeather> weatherList;
//	private int[] daysWeather;
//	private String[] windWeather;
	
	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;
	}

	public Weather(String country, int[] daysWeather, String[] windWeather) {
		this.country = country;
		this.daysWeather = daysWeather;
		this.windWeather = windWeather;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public String getCountry() {
		return country;
	}

	public String[] getWindWeather() {
		return windWeather;
	}

	public String toString() {
		return "Weather forecast in '" + this.country + "' for next days '"
				+ Arrays.toString(this.getDaysWeather()) + "'. Wind forecast "+Arrays.toString(this.getWindWeather());
	}

	public double getWeekAverage() {
		double sum = 0;
		for (int i = 0; i < this.daysWeather.length; i++) {
			sum = sum + this.daysWeather[i];
		}
		double average = sum / this.daysWeather.length;
		return average;
	}

	private int getHottestDayIndex() {
		int max = this.daysWeather[0];
		int maxIndex = 0;
		for (int i = 1; i < this.daysWeather.length; i++) {
			if (max < this.daysWeather[i]) {
				maxIndex = i;
				max = this.daysWeather[i];
			}
		}
		// if there is forecast for more then one week but it starts from Monday
		maxIndex = maxIndex % 7;
		return maxIndex;
	}

	public int getHottestTemperature() {
		return this.daysWeather[getHottestDayIndex()];
	}

	public String getHottestDayName() {
		return dayName(getHottestDayIndex());
	}

	private int getColdestDayIndex() {
		int min = this.daysWeather[0];
		int minIndex = 0;
		for (int i = 1; i < this.daysWeather.length; i++) {
			if (min > this.daysWeather[i]) {
				minIndex = i;
				min = this.daysWeather[i];
			}
		}
		// if there is forecast for more then one week but it starts from Monday
		minIndex = minIndex % 7;
		return minIndex;
	}

	public int getColdestTemperature() {
		return this.daysWeather[getColdestDayIndex()];
	}

	public String getColdestDayName() {
		return dayName(getColdestDayIndex());
	}

	public void printAdvancedInformation() {
		System.out.println("In " + this.country
				+ " during next 7 day will be following weather "
				+ Arrays.toString(this.daysWeather));
		System.out.println("the highest temperature will be on "
				+ getHottestDayName() + " " + getHottestTemperature()
				+ " degree");
		System.out.println("the lowest temperature will be on "
				+ getColdestDayName() + " " + getColdestTemperature()
				+ " degree");
	}

	public void applyWarmCycloneEffect() {
		for (int i = 0; i < this.daysWeather.length; i++) {
			this.daysWeather[i] += 1;
		}
	}

	private String dayName(int index) {
		String dayName;
		switch (index) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tuesday";
			break;
		case 2:
			dayName = "Wednesday";
			break;
		case 3:
			dayName = "Thursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;
		default:
			dayName = "error";
		}
		return dayName;
	}

	public static double celsiusToFahrenheit(double celsiusTemperature) {
		return celsiusTemperature * 1.8 + 32;
	}

	public static Weather getWeatherForecast(String countryName) {
		return new Weather(countryName, makeWeekForecastArray());
	}

	private static int[] makeWeekForecastArray() {
		Random rand = new Random();
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt((30 + 30) + 1) - 30;
			// return r.nextInt((max - min) + 1) + min;
		}
		return array;
	}
}
