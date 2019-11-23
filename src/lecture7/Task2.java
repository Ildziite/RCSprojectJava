package lecture7;
class Circle{
	double radius;
	
	void getRadius(){
		System.out.println("Circle radius is "+radius+".");
	}
	
	double getRadius1(){
		return radius;
	}
	
	void getArea(){
		System.out.println("Circle area is "+radius*radius*Math.PI+".");
	}
	
	double getArea1(){
		return radius*radius*Math.PI;
	}
}
public class Task2 {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.radius=3.12;
		Circle c2=new Circle();
		c2.radius=14.34;
		Circle c3=new Circle();
		c3.radius=25.12;
		
		c1.getRadius();
		c1.getArea();
		System.out.println(c1.getRadius1());
		System.out.println(c1.getArea1());

	}

}
