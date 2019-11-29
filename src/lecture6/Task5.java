package lecture6;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		System.out.println("Task5");
		Scanner input = new Scanner(System.in);

		int[] task5 = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		boolean contains = false;
		System.out.println("Input number:");
		int num = input.nextInt();
		for (int s = 0; s < task5.length; s++) {
			if (task5[s] == num) {
				contains = true;
				break;
			}
		}
		if (contains) {
			System.out.println("number " + num + " is inside of an array");
		} else {
			System.out.println("number " + num + " is not inside of an array");
		}

		input.close();
	}

}
