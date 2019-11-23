package lecture6;
import java.util.Arrays;

public class MA_Task1 {

	public static void main(String[] args) {
		int[][] grid = new int[4][4];
		int i = 0;
			for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
				for (int colIndex = 0; colIndex < grid[rowIndex].length; colIndex++) {
					grid[rowIndex][colIndex] = i;
					i++;
				}
			}

		for (int[] arrayRow : grid) {
			System.out.println(Arrays.toString(arrayRow));
		}
	}
}
