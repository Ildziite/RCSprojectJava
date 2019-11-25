package com.accenture.lecture16;

public class Warrior {
	private String name;
	private int health;

	public Warrior(String name, int initialHealth) {
		this.name = name;
		this.health = initialHealth;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	private boolean isAlive() {
		return this.health > 0;
	}

	public void receivedDamage(int damage) {
		if (this.health > damage) {
			this.health = this.health - damage;
		} else {
			this.health = 0;
			System.out.println("Warrior "+this.name+" is dead!");
		}
	}

	public void restoreHealth(int health) {
		if (this.isAlive()) {
			if (this.health + health > 100) {
				health = 100;
			} else {
				this.health = this.health + health;
			}
		} else{
			System.out.println("Warrior "+this.name+"is dead and can't restore health");
		}
	}

	public String toString() {
		return "Warrior [name=" + name + ", health=" + health + "]";
	}

}
