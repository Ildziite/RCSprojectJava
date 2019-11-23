package lecture8;
class Task2 {
	int retSum(int[] task2) {
		int sum = 0;
		for (int i = 0; i < task2.length; i++) {
			sum = sum + task2[i];
		}
		//for (int value:processedArray){
		//sum=sum+value;
		//}
		return sum;
	}
}

public class A_Task2 {

	public static void main(String[] args) {
		Task2 b = new Task2();

		int[] array = { 1, 2, 4, 3 };
		System.out.println(b.retSum(array));

	}

}
