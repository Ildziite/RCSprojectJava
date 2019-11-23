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
	public String toString(){
		return "Weather forecast in '"+this.country+"' for next days '"+ Arrays.toString(this.getDaysWeather()) +"'";
	}

	
}
