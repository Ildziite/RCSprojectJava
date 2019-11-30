package com.accenture.lecture19;

public class TernaryOperatorTask {

	public static void main(String[] args) {
		// receive passed arguments and parse them from string to integers
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		int arg3 = Integer.parseInt(args[2]);

		// Task1 rewrite current condition to Ternary operator
		int biggestValue;
		/*
		 * if(arg1 > arg2) { biggestValue = arg1; }else { biggestValue = arg2; }
		 */

		biggestValue = arg1 > arg2 ? (arg1 > arg3 ? arg1 : arg3)
				: (arg2 > arg3 ? arg2 : arg3);
		System.out.println("The biggest value is " + biggestValue);
	}

}
