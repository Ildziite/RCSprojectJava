package lecture6;

public class Array {

	public static void main(String[] args) {
		int[] values = new int[4];
		System.out.println(values);
		System.out.println(values[0]);

		values[0] = 9;
		System.out.println(values[0]);

		int[] values2 = { 1, 2, 3, 4 };
		System.out.println(values2[3]);

		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i]);
		}
		System.out.println("otrs veids");
		for (int elem : values2) {
			System.out.println(elem);
		}
		

	}

}
