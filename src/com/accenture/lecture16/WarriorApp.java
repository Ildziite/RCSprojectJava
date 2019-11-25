package com.accenture.lecture16;

public class WarriorApp {

	public static void main(String[] args) {
		Warrior ogre = new Warrior("John", 20, 100);
		System.out.println(ogre);

		ogre.receivedDamage(50);
		System.out.println(ogre);

		ogre.restoreHealth(10);
		System.out.println(ogre);

		// ogre.receivedDamage(200);
		// System.out.println(ogre);

		ogre.restoreHealth(10);

		Warrior human = new Warrior("Peter", 40, 60);
		Warrior human2 = new Warrior("Dean", 10, 30);
		human.fight(human2);
		System.out.println(human);
		System.out.println(human2);

		Warrior alien = new Warrior("Abu", 10, 100);
		Warrior alien2 = new Warrior("Kabu", 15, 80);
		alien.fightTillDeath(alien2);

	}

}
