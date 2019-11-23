package lecture6;
import java.util.Arrays;


public class MA_Task3 {

	public static void main(String[] args) {
		int[][] data = { { 1, -5, 98, 20 }, { 3, -68, 2 },
				{ 7, 29, 0, -1, -68 } };

		for (int[] arrayRow : data) {
			System.out.println(Arrays.toString(arrayRow));
		}
		
		int sum = 0;
		int min = data[0][0];
		int minR = 0;
		int minC = 0;
		for (int currentRow = 0; currentRow < data.length; currentRow++) {
			for (int col = 0; col < data[currentRow].length; col++) {
				//System.out.println(data[currentRow][col]+" "+currentRow+" "+col);
				sum += data[currentRow][col];
				if (data[currentRow][col] < min) {
					min = data[currentRow][col];
					minR = currentRow;
					minC = col;
				}
			}
		}

		System.out.println("Datu summa ir " + sum);
		System.out.println("The smallest element is "+min+" with coordinates Row:"+minR+";Col:"+minC);
		
		
	}
}
