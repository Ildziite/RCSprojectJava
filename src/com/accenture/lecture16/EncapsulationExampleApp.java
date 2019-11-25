package com.accenture.lecture16;

class BankAccount {
	private String owner;
	private int balance;

	public BankAccount(String owner, int initialBalance) {
		this.owner = owner;
		this.balance = initialBalance;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Succeed to deposit " + amount + " to "
					+ this.owner + " account");
		} else {
			System.out.println("!Failed to deposit " + amount + " to "
					+ this.owner + " account");
		}
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("!Failed to withdraw  " + amount + " from "
					+ this.owner + " account");
		} else {
			balance = balance - amount;
			System.out.println("Succeed withdraw  " + amount + " from "
					+ this.owner + " account");
		}
	}

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", balance=" + balance + "]";
	}

}

public class EncapsulationExampleApp {

	public static void main(String[] args) {

		BankAccount johnAccount = new BankAccount("John", 100);

		// successful operation
		johnAccount.deposit(10);
		System.out.println(johnAccount);

		// successfully taken from bank account 60
		johnAccount.withdraw(60);
		System.out.println(johnAccount);

		// prevented attempt to take more than you have on your bank account
		johnAccount.withdraw(60);
		System.out.println(johnAccount);

		// prevented attempt to hack bank
		johnAccount.deposit(-60);
		System.out.println(johnAccount);

	}

}