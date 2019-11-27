package com.accenture.lecture17;

public class App {

	public static void main(String[] args) {
		Circle aplis = new Circle(1.45, "Yellow");
		Circle aplis2 = new Circle(1.0);
		
		System.out.println(aplis);
		System.out.println(aplis2);
		
		System.out.println(aplis2.getArea());
		
		Cylinder cilindrs = new Cylinder(2,"Red",5);
		System.out.println(cilindrs);
		System.out.println(cilindrs.getArea());
		System.out.println(cilindrs.getVolume());
		
	}

}
