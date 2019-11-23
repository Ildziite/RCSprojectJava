package lecture6;
import java.util.Arrays;

public class Multiarray {

	public static void main(String[] args) {
		int[][] grid;
		grid = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		int[][] grid2 = { { 2, 1, 2, 4 }, { 2, 5, 13, 4 }, { 4, 1, 2, 4 },
				{ 2, 1, 2, 3 } };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grid2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Izmaina grid2[2][0]=100");
		grid2[2][0] = 100;

		for (int[] arrayRow : grid2) {
			System.out.println(Arrays.toString(arrayRow));
		}

		System.out.println("Izmaina 2. rindu");
		//izveido parastu masivu un ar to aizstaj rindu
		int[] specialRow = { 1, 1, 1, 1 };
		grid2[1] = specialRow;

		for (int[] arrayRow : grid2) {
			System.out.println(Arrays.toString(arrayRow));
		}
	}

}
