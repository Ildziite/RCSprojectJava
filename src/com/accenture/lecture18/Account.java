package com.accenture.lecture18;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name) {
		this(id, name, 0);
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int debit(int amount) {
		this.balance = this.balance + amount;
		return balance;
	}

	public int credit(int amount) {
		if (amount <= balance) {
			this.balance = this.balance - amount;
		} else {
			System.out.println("Amount Exceeded balance");
		}
		return balance;
	}
	
	public int transferTo(Account another, int amount){
		if (amount <= balance) {
			System.out.println(this.credit(amount));
			System.out.println(another.debit(amount));
		} else {
			System.out.println("Amount Exceeded balance");
		}
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}
	
	

}
