package com.accenture.lecture18;

public class ObjTest {

	public static void main(String[] args) {
Account janis=new Account("A0001", "Janis", 450);
Account peteris=new Account("A0002", "Peteris", 450);

janis.transferTo(peteris, 20);
	}

}
