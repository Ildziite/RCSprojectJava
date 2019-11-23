package lecture8;
class Task1 {
	String retStr(boolean arg1, double arg2) {
		//return Boolean.toString(arg1) + Double.toString(arg2);
		//return Boolean.toString(arg1)+arg2;
		return ""+arg1+arg2;
	}
}

public class A_Task1 {

	public static void main(String[] args) {
		Task1 b = new Task1();
		System.out.println(b.retStr(true, 3.1423));
	}

}
