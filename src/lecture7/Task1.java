package lecture7;
class Car {
	String color;
	String brand;
	String number;
	int year;
	boolean techCheck;

	void printInfo() {
		System.out.println("This is " + brand + " from year " + year
				+ ". It's registration number is " + number + " It is " + color
				+ ".");
	}

	void checkTechnicalState() {
		if (techCheck) {
			System.out.println("Car with registration number " + number
					+ " has valid technical check.");
		} else {
			System.out.println("Car with registration number " + number
					+ " does not have valid technical check.");
		}
	}
}

public class Task1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.color = "red";
		c1.brand = "Ford";
		c1.number = "HE-2312";
		c1.year = 2005;
		c1.techCheck = true;
		
		c2.color = "blue";
		c2.brand = "Audi";
		c2.number = "MH-6712";
		c2.year = 2015;
		c2.techCheck = true;
		
		c3.color = "white";
		c3.brand = "Ford";
		c3.number = "GP-3421";
		c3.year = 2008;
		c3.techCheck = false;

		c1.printInfo();
		c1.checkTechnicalState();
		
		c2.printInfo();
		c2.checkTechnicalState();
		
		c3.printInfo();
		c3.checkTechnicalState();
	}

}
