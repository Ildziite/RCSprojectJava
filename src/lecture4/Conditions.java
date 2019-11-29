package lecture4;

public class Conditions {

	
	public static void main(String[] args) {
			int a = 5;
			short b = 5;
			int c = 1;
			boolean b1 = a == b;
			boolean b2 = b != c;
			boolean b3 = a > c;
			if (b1 && b2 && b3) {
			System.out.println("Success!");
			}else {
			System.out.println("Something wrong");
			}
			
			int diena=5;
			
			String d1="Monday";
			String d2="Tuesday";
			String d3="Wednesday";
			String d4="Thursday";
			String d5="Friday";
			String d6="Saturday";
			String d7="Sunday";
			
			if(diena==1){
				System.out.println(d1);
			} else if (diena==2) {
				System.out.println(d2);
			} else if (diena==3) {
				System.out.println(d3);
			} else if (diena==4) {
				System.out.println(d4);
			} else if (diena==5) {
				System.out.println(d5);
			} else if (diena==6) {
				System.out.println(d6);
			} else if (diena==7) {
				System.out.println(d7);
			} else {
			    System.out.println("Neatbilst nedelas dienai!");	
			}
			
	}

}
