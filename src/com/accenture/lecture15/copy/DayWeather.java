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
		@SuppressWarnings("deprecation")
		Date day= new Date(year, month, date);
		this.day=day;
		System.out.println(day);
		this.minTemp=minTemp;
		this.maxTemp=maxTemp;
		this.minWind=minWind;
		this.maxWind=maxWind;
		this.wind=wind;
	}
	
	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getMinWind() {
		return minWind;
	}

	public void setMinWind(int minWind) {
		this.minWind = minWind;
	}

	public int getMaxWind() {
		return maxWind;
	}

	public void setMaxWind(int maxWind) {
		this.maxWind = maxWind;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public static DayWeather makeRandomForecast() {
		Random rand = new Random();
		return new DayWeather(rand.nextInt((119-118)+1)+118,rand.nextInt(11),rand.nextInt(30),rand.nextInt((30 + 30) + 1) - 30,rand.nextInt((30 + 30) + 1) - 30,rand.nextInt(30),rand.nextInt(30), "S");
	}
		
	@Override
	public String toString() {
		return "DayWeather [day=" + day + ", minTemp=" + minTemp + ", maxTemp="
				+ maxTemp + ", minWind=" + minWind + ", maxWind=" + maxWind
				+ ", wind=" + wind + "]";
	}

}
