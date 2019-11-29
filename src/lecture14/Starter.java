package lecture14;
import User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Starter {
	
	public static void main(String[] args) {
		int[] arrys = new int[3];
		System.out.println(arrys.length);
		arrys[0] = 1;
		System.out.println(Arrays.toString(arrys));

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Volvo");
		arrayList.add("Lada");
		arrayList.add("Tesla");
		arrayList.add("Skoda");
		arrayList.add("Bmw");
		arrayList.add("Volvo");
		arrayList.add("Lada");
		arrayList.add("Tesla");
		arrayList.add("Skoda");
		arrayList.add("Bmw");
		arrayList.set(1, "Audi");
		System.out.println(arrayList.size());
		printArrayList(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));

		System.out.println(arrayList.get(1));

		printArrayList(arrayList);

		for (String element : arrayList) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		System.out.println("Search Volvo: "+arrayList.contains("Volvo"));
		
		
		ArrayList<Double> arrayListInt = new ArrayList<>();
		arrayListInt.add(1123.23);
		printArrayListDouble(arrayListInt);
		
		User u1=new User("Janis",333333);
		System.out.println(u1.toString());
		
		ArrayList<User> userArray=new ArrayList<>();
		userArray.add(new User("Anna",12312));
		userArray.add(new User("Denis",1232));
		userArray.add(u1);
		
		printArrayListUser(userArray);
		
		//List nav constuctor, tapec izmanto ArrayList constructor
		List<Integer> listArr = new ArrayList<>();
		listArr.add(12);
		listArr.add(23);
		listArr.add(234);
		listArr.add(123);
		listArr.add(34);
		listArr.add(689);
		System.out.println(listArr.size());
		//listArr.clear();
		//System.out.println(listArr.size());
		
		//Ta ari nesanaca Lambda :(
		//Integer n=new Integer;
		//listArr.forEach(Integer n -> System.out.println(n));
		
		List<String> listArr2 = new ArrayList<>();
		listArr2.add("12");
		listArr2.add("23");
		listArr2.add("zzz");
		listArr2.add("abc");
		
		Collections.sort(listArr2);
		
		Iterator<String> iterator =listArr2.iterator();
		while(iterator.hasNext()){
			String listToString=iterator.next();
			System.out.println(listToString);
		}
		
		System.out.println();
		Collections.sort(listArr);

		Iterator<Integer> iterator2 =listArr.iterator();
		while(iterator2.hasNext()){
			Integer listToString2=iterator2.next();
			System.out.println(listToString2);
		}
		
	
		
	}
	
	public static void printArrayList(ArrayList<String> arrayL) {
		for (int i = 0; i < arrayL.size(); i++) {
			System.out.println("Element " + i + " is " + arrayL.get(i));
		}
	}
	public static void printArrayListDouble(ArrayList<Double> arrayL) {
		for (int i = 0; i < arrayL.size(); i++) {
			System.out.println("Element " + i + " is " + arrayL.get(i));
		}
	}
	
	public static void printArrayListUser(ArrayList<User> arrayL) {
		
		for (User element : arrayL) {
			System.out.println(element);
		}
		}
}
