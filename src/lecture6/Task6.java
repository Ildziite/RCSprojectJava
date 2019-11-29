package lecture6;
import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("Task6");
		int starp;
		int[] task6 = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		for (int k = 0; k < task6.length / 2; k++) {
			starp = task6[k];
			task6[k] = task6[task6.length - 1 - k];
			task6[task6.length - 1 - k] = starp;
		}

		for (int k = 0; k < task6.length; k++) {
			System.out.println(task6[k]);
		}

		System.out.println(Arrays.toString(task6));

	}

}
