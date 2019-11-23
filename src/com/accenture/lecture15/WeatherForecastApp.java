package com.accenture.lecture15;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherForecastApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Weather> forecastList = new ArrayList<>();
		forecastList.add(Weather.getWeatherForecast("Estonia"));
		forecastList.add(Weather.getWeatherForecast("Finland"));
		forecastList.add(Weather.getWeatherForecast("Sweden"));
	
	System.out.println("Welcome to Weather Forecat App! Please select option:");
	System.out.println("[l] - list country names for which forecast exist");
	System.out.println("[a] - add new forecast, by providing country name and one day forecast temperature");
	// 
	// -- [d] - delete forecast, by specifying country name
	// -- [g] - generate new weather forecast, by specifying country name
	// -- [q] - quit the program
	
	}
}
