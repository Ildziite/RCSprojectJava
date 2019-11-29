package lecture6;
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Task3");

		int[] task3 = new int[10];
		for (int j = task3.length - 1; j > -1; j--) {
			task3[j] = j;
			System.out.println(task3[j]);
		}

	}

}
