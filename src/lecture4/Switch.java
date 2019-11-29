package lecture4;

public class Switch {
	public static void main(String[] args) {
		int expression = 2;
		int result = 0;
		switch (expression){
		case 1: result++;
		case 2: result++;
		case 3: result++;
		break;
		default: result++;
		}
		System.out.println(result);
		
	int diena=11;
	
	switch (diena){
	case 1: System.out.println("Monday");
	break;
	case 2: System.out.println("Tuesday");
	break;
	case 3: System.out.println("Wednesday");
	break;
	case 4: System.out.println("Thursday");
	break;
	case 5: System.out.println("Friday");
	break;
	case 6: System.out.println("Saturday");
	break;
	case 7: System.out.println("Sunday");
	break;
	default: System.out.println("Neatbilst nedelas dienai!");
	}
	
	int monthIndex=5;
	switch (monthIndex){
	case 1: System.out.println("January");
	case 2: System.out.println("February");
	case 3: System.out.println("March");
	case 4: System.out.println("April");
	case 5: System.out.println("May");
	case 6: System.out.println("June");
	case 7: System.out.println("July");
	case 8: System.out.println("August");
	case 9: System.out.println("September");
	case 10: System.out.println("October");
	case 11: System.out.println("November");
	case 12: System.out.println("December");
	break;
	default: System.out.println("Neatbilst gada menesim!");
	}
	
	System.out.println("");
	
	int diena2=3;
	
	switch (diena2){
	case 7: System.out.println("Sunday");
	case 6: System.out.println("Saturday");
	case 5: System.out.println("Friday");
	case 4: System.out.println("Thursday");
	case 3: System.out.println("Wednesday");
	case 2: System.out.println("Tuesday");
	case 1: System.out.println("Monday");
	break;
	default: System.out.println("Neatbilst nedelas dienai!");
	}
	
	}
}
