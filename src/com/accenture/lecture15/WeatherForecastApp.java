package com.accenture.lecture15;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherForecastApp {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Weather> forecastList = new ArrayList<>();

	public static void main(String[] args) {

		forecastList.add(Weather.getWeatherForecast("Estonia"));
		forecastList.add(Weather.getWeatherForecast("Finland"));
		forecastList.add(Weather.getWeatherForecast("Sweden"));
		System.out.println("Welcome to Weather Forecat App!");
		String option = "";
		while (option != "q") {
			System.out.println("Please select option:");
			System.out
					.println("[l] - list country names for which forecast exist");
			System.out
					.println("[a] - add new forecast, by providing country name and one day forecast temperature");
			System.out
					.println("[d] - delete forecast, by specifying country name");
			System.out
					.println("[g] - generate new weather forecast, by specifying country name");
			System.out.println("[q] - quit the program");

			option = input.nextLine();

			switch (option) {
			case "l":
				listCountryNames();
				break;
			case "a":
				addNewForecast();
				break;
			case "d":
				deleteForecast();
				break;
			case "g":
				addNewForecastCountry();
				break;
			case "q":
				break;
			default:
				System.out.println("Option not recognized!");
			}
		}
	}

	public static void listCountryNames() {
		for (Weather element : forecastList) {
			System.out.print(element.country + " ");
		}
		System.out.println();
	}

	public static void addNewForecast() {
		System.out.println("Input country for new forecast");
		String country = input.nextLine();
		System.out.println("Input temperatures for new forecast");
		int[] forecast = new int[7];
		for (int i = 0; i < 7; i++) {
			int temperature = input.nextInt();
			forecast[i] = temperature;
		}

		Weather NewForecast = new Weather(country, forecast);
		forecastList.add(NewForecast);
	}

	public static void deleteForecast() {
		System.out.println("Input country to delete from forecast");
		String country = input.nextLine();
		for (int i = 0; i < forecastList.size(); i++) {
			if (forecastList.get(i).country.equals(country)) {
				forecastList.remove(i);
				System.out.println("Country " + country
						+ " has been sucessfully deleted.");
			}

		}
	}
	
	public static void addNewForecastCountry() {
		System.out.println("Input country for new forecast");
		String country = input.nextLine();
		
		Weather NewForecast = Weather.getWeatherForecast(country);;
		forecastList.add(NewForecast);
		
	}
}
