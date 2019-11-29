package com.accenture.lecture15.copy;

import java.util.Date;
import java.util.Random;

public class DayWeather {
	Date day;
	private int minTemp;
	private int maxTemp;
	private int minWind;
	private int maxWind;
	private String wind;
	
	public DayWeather(int year, int month, int date){
		this(year,month,date,-20,20,3,34,"N");
	}
	
	public DayWeather(int year, int month, int date, int minTemp, int maxTemp, int minWind, int maxWind, String wind) {
		@SuppressWarnings("deprecation")
		Date day=new Date(year, month, date);
		this.day=day;
		this.minTemp=minTemp;
		this.maxTemp=maxTemp;
		this.minWind=minWind;
		this.maxWind=maxWind;
		this.wind=wind;
	}

	public static DayWeather makeRandomForecast() {
		Random rand = new Random();
		
		
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt((30 + 30) + 1) - 30;
			// return r.nextInt((max - min) + 1) + min;
		}
		return new DayWeather(rand.nextInt((2020-2019)+1)+2019,rand.nextInt(12),rand.nextInt(30),rand.nextInt((30 + 30) + 1) - 30,rand.nextInt((30 + 30) + 1) - 30,rand.nextInt(30),rand.nextInt(30), "S");
	}

	@Override
	public String toString() {
		return "DayWeather [day=" + day + ", minTemp=" + minTemp + ", maxTemp="
				+ maxTemp + ", minWind=" + minWind + ", maxWind=" + maxWind
				+ ", wind=" + wind + "]";
	}

}
