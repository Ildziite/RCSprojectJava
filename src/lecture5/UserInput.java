package lecture5;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner skeneris = new Scanner(System.in);

		System.out.println("What is your name?");
		String vards = skeneris.nextLine();
		System.out.println("Your name is " + vards);

		System.out.println("Ievadi skaitli");
		double skaitlis = skeneris.nextDouble();
		if (skaitlis > 0) {
			System.out.println("Number " + skaitlis + " is positive");
		} else {
			System.out.println("Number " + skaitlis + " is negative");
		}

		System.out.println("Ievadi dienas skaitli:");
		int diena = skeneris.nextInt();
		switch (diena) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Neatbilst nedelas dienai!");
		}

		System.out.println("Ievadi skaitli");
		if (skeneris.hasNextDouble()) {
			double skaitlis2 = skeneris.nextDouble();
			System.out.println(skaitlis2);
		} else {
			System.out.println("Neatbilst formats!");
		}
		
		skeneris.close();
	}
}
