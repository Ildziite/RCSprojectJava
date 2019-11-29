package lecture5;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		// jauns piemers
		System.out.println("");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// jauns piemers
		System.out.println("");

		int i = 1;
		while (i < 16) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		// jauns piemers
		System.out.println(i);
		Scanner input = new Scanner(System.in);
		double j;
		do {
			System.out.println("Uzmini skaitli!");
			j = input.nextDouble();
		} while (j != 0);
		System.out.println("Pareizi!");

		// jauns piemers
		System.out.println("");

		System.out.println("Ievadi skaitli!");
		int z = input.nextInt();
		for (int y = 1; y < z + 1; y++) {
			for (int x = 1; x < y + 1; x++) {
				System.out.print(y);
			}
			System.out.println();
		}

		// jauns piemers
		System.out.println("");
		int r=1;

		System.out.println("Ievadi skaitli!");
		int s = input.nextInt();
		for (int y = 1; y < s + 1; y++) {
			for (int x = 1; x < y + 1; x++) {
				System.out.print(r);
				r++;
			}
			System.out.println();
			r=1;
		}
		
		// jauns piemers
				System.out.println("");
				int p=1;

				System.out.println("Ievadi skaitli!");
				int o = input.nextInt();
				for (int y = 1; y < o + 1; y++) {
					for (int x = 1; x < y + 1; x++) {
						System.out.print(p+" ");
						p++;
					}
					System.out.println();
				}
		input.close();

	}
}
