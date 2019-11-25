package com.accenture.lecture16;

public class WarriorApp {

	public static void main(String[] args) {
		Warrior ogre = new Warrior("John", 20, 100);
		System.out.println(ogre);

		ogre.receivedDamage(50);
		System.out.println(ogre);

		ogre.restoreHealth(10);
		System.out.println(ogre);

		ogre.receivedDamage(200);
		System.out.println(ogre);

		ogre.restoreHealth(10);

	}

}
