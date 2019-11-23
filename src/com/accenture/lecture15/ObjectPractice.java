package com.accenture.lecture15;

import java.util.Arrays;

public class ObjectPractice {

	public static void main(String[] args) {

		// Task 1 - Lets make our Weather class to store following information:
		// String country - for which forecast is prepared.
		// int[] daysWeather- temperature information for next week (7 days).

		// Task 2 - We should be able to create a new object of class Weather by
		// passing
		// both field values.
		// Create constructor in Weather class
		// public Weather(String country , int[] daysWeater)

		// Task 3 - We should prohibit to reassign country field value for
		// weather objects
		// Make it final

		// Task 4 - Lets create few weather forecasts for following countries:
		// Latvia,
		// Antaliya, Bergen
		// Example:
		Weather Latvia = new Weather("Latvia", new int[] { -2, 0, 5, 2, 6, -1,
				0 });
		Weather Antaliya = new Weather("Latvia", new int[] { 12, 10, 15, 12,
				16, 11, 10 });
		Weather Bergen = new Weather("Latvia", new int[] { 22, 20, 25, 22, 26,
				-21, 20 });

		// Task 5 - We should prohibit direct access to Weather object fields
		// Make fields private
		// Create getters for them
		// Output: Latvia [-2, 0, 5, 2, 6, -1, 0]
		System.out.println(Latvia.getCountry() + " "
				+ Arrays.toString(Latvia.getDaysWeather()));

		// Task 6 - User should be able to get weather information in
		// user-friendly way
		// Create toString method in Weather class
		// Output:
		// "Weather forecast in 'Latvia' for next days '-2, 0, 5, 2, 6, -1, 0'"
		System.out.println(Latvia);

		// Send a link of your github repository to lecturer in slack
		// Wait until everyone will reach that point eiter ask for extra task
		// -------------------------------------------------------------------------------------

	}

}