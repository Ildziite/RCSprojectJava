package lecture6;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Task2");
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday" };
		Scanner input = new Scanner(System.in);
		System.out.println("Ievadi dienas skaitli:");
		int diena = input.nextInt();
		if (diena > 7 || diena < 1) {
			System.out.println("Ievaditais skaitlis neatbilst dienai");
		} else {
			System.out.println(days[diena - 1]);
		}
		input.close();
	}

}
