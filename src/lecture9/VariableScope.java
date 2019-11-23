package lecture9;
class Scope{
	int x=11;
	int y=33;
	
	public void method1(int x){
		this.x=22;
		y=44;
		System.out.println("this.x: "+this.x);
		System.out.println("x: "+x);
		System.out.println("this.y: "+this.y);
		System.out.println("y: "+y);
	}
}

public class VariableScope {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++){
			System.out.println(i);
		}
		int i=20;
		System.out.println(i);

		Scope tscope=new Scope();
		tscope.method1(5);
	}

}
