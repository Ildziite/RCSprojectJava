package lecture7;
import java.util.Scanner;

class User {
	String name;
	int age;
	boolean man;
	String haircolor;
	
	void sayHi(){
		System.out.println("Hi! My name is " + name + ". I am "
				+ age + " years old. My hair color is " + haircolor
				+ ".");
	}
}

public class Fields {

	public static void main(String[] args) {
		User peter = new User();
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;
		peter.haircolor = "brown";

		User anna = new User();
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		anna.haircolor = "blonde";

		User zane = new User();
		zane.name = "Zane";
		zane.age = 35;
		zane.man = false;
		zane.haircolor = "brown";

		peter.sayHi();
		anna.sayHi();
		zane.sayHi();
		
		Scanner input = new Scanner(System.in);
		User pirmais = new User();
		System.out.println("Input your name!");
		pirmais.name = input.nextLine();
		System.out.println("Input your haircolor!");
		pirmais.haircolor = input.nextLine();
		System.out.println("Input your age!");
		pirmais.age = input.nextInt();
		
		
		System.out.println("Hi! My name is " + pirmais.name + ". I am " + pirmais.age
				+ " years old. My hair color is " + pirmais.haircolor + ".");
		input.close();
	}
}
