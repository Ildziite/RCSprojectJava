package com.accenture.lecture15.copy;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DayWeather {
	Calendar day;
	private int minTemp;
	private int maxTemp;
	private int minWind;
	private int maxWind;
	private String wind;
	
	public DayWeather(){
		this(2019,01,01);
	}
	
	public DayWeather(int year, int month, int date){
		this(year,month,date,-20,20,3,34,"N");
	}
	
	public DayWeather(int year, int month, int date, int minTemp, int maxTemp, int minWind, int maxWind, String wind) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		Calendar day= Calendar.set(year, month, date);
		this.day=day;
		System.out.println(day);
		this.minTemp=minTemp;
		this.maxTemp=maxTemp;
		this.minWind=minWind;
		this.maxWind=maxWind;
		this.wind=wind;
	}

	public DayWeather makeRandomForecast() {
		Random rand = new Random();
		return new DayWeather(rand.nextInt((2020-2019)+1)+2019,rand.nextInt(12),rand.nextInt(30),rand.nextInt((30 + 30) + 1) - 30,rand.nextInt((30 + 30) + 1) - 30,rand.nextInt(30),rand.nextInt(30), "S");
	}

		
	@Override
	public String toString() {
		return "DayWeather [day=" + day + ", minTemp=" + minTemp + ", maxTemp="
				+ maxTemp + ", minWind=" + minWind + ", maxWind=" + maxWind
				+ ", wind=" + wind + "]";
	}

}
