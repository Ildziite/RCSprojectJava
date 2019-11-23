package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {

	final String country;

	int[] daysWeather;

	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return "Weather forecast in '" + this.country + "' for next days '"
				+ Arrays.toString(this.getDaysWeather()) + "'";
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

}
