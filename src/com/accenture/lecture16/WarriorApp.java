package com.accenture.lecture16;

import java.util.ArrayList;
import java.util.Scanner;

public class WarriorApp {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Warrior> wList = new ArrayList<>();;

	public static void printList() {
		for (Warrior element : wList) {
			System.out.print(element.getName() + " ");
		}
		System.out.println();
	}

	public static void fightTillDeath(Warrior warrior1, Warrior warrior2) {
		while (warrior1.isAlive() && warrior2.isAlive()) {
			warrior1.fight(warrior2);
		}
		System.out.println(warrior1);
		System.out.println(warrior2);
	}

	public static void fight(Warrior warrior1, Warrior warrior2) {
		warrior1.fight(warrior2);
		if (!(warrior1.isAlive())) {
			wList.remove(warrior1);
		}
		if (!(warrior2.isAlive())) {
			wList.remove(warrior2);
		}
	}

	public static void inputWarrior(){
		System.out.println("Input Warrior info.");
		System.out.println("name:");
		String name = input.nextLine();
		System.out.println("Initial health:");
		int health = input.nextInt();
		System.out.println("Damage power:");
		int power = input.nextInt();
		Warrior w = new Warrior(name, power, health);
		wList.add(w);
	}
	
	
	public static void main(String[] args) {
		
		inputWarrior();
	
		Warrior ogre = new Warrior("John", 20, 100);
		wList.add(ogre);
		System.out.println(ogre);

		// ogre.receivedDamage(50);
		// System.out.println(ogre);

		// ogre.restoreHealth(10);
		// System.out.println(ogre);

		// ogre.receivedDamage(200);
		// System.out.println(ogre);

		ogre.restoreHealth(10);

		Warrior human = new Warrior("Peter", 40, 60);
		wList.add(human);
		Warrior human2 = new Warrior("Dean", 10, 30);
		wList.add(human2);
		printList();
		// human.fight(human2);
		// System.out.println(human);
		// System.out.println(human2);

		Warrior alien = new Warrior("Abu", 10, 100);
		wList.add(alien);
		Warrior alien2 = new Warrior("Kabu", 15, 80);
		wList.add(alien2);
		// fightTillDeath(alien, alien2);

		System.out.println(wList.size());

		while (wList.size() != 1) {
			for (int i = 0; i < wList.size() - 1; i++) {
				fight(wList.get(i), wList.get(i + 1));
			}
		}
		
		System.out.println(wList.get(0));
		wList.get(0).printWarriorStatistics();

	}

}
