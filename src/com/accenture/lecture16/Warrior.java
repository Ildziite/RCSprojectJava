package com.accenture.lecture16;

public class Warrior {
	private String name;
	private int health;
	private int damagePower;
	

	public Warrior(String name, int damagePower, int initialHealth) {
		this.name = name;
		this.health = initialHealth;
		this.damagePower = damagePower;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getDamagePower() {
		return damagePower;
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	public void receivedDamage(int damage) {
		if (this.health > damage) {
			this.health = this.health - damage;
		} else {
			this.health = 0;
			System.out.println("Warrior " + this.name + " is dead!");
		}
	}

	public void restoreHealth(int health) {
		if (this.isAlive()) {
			if (this.health + health > 100) {
				health = 100;
			} else {
				this.health = this.health + health;
			}
		} else {
			System.out.println("Warrior " + this.name
					+ "is dead and can't restore health");
		}
	}

	public void fight(Warrior anotherWarrior) {
		if (this.isAlive() && anotherWarrior.isAlive()) {
			anotherWarrior.receivedDamage(this.damagePower);
			if (anotherWarrior.isAlive()) {
				this.receivedDamage(anotherWarrior.damagePower);
			}
		} else {
			System.out
					.println("Both warriors are not alive. Fight is not gonna happen!");
		}
	}

	

	public String toString() {
		return "Warrior [name=" + name + ", health=" + health + "]";
	}
	
	

}
