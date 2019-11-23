package lecture6;
import java.util.Arrays;
import java.util.Scanner;


public class MA_Task2 {

	public static void main(String[] args) {
		int[][] grid = new int[4][5];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = input.nextInt()-1;
		System.out.print("Enter column: ");
		int col = input.nextInt()-1;
		System.out.print("Enter value: ");
		int value = input.nextInt();
		
		if(row<4&&row>-1&&col<5&&col>-1){
			grid[row][col] = value;
		}else {
			System.out.println("Dati neatbilst masivam 4x5! Izmainas netiks veiktas!");
		}
		
		for (int[] arrayRow : grid) {
			System.out.println(Arrays.toString(arrayRow));
		}
		input.close();
	}

}
