package lecture8;
class Car {
	private String brand;
	private int maxSpeed;
	private String color;

	public String getBrand() {
		return this.brand;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public String getColor() {
		return this.color;
	}

	public void setBrand(String b){
		this.brand=b;
	}
	
	public void setMaxSpeed(int speed){
		this.maxSpeed=speed;
	}
	
	public void setColor(String c){
		this.color=c;
	}
}

public class A_Task3 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.setBrand("Ford");
		c1.setMaxSpeed(130);
		c1.setColor("black");
		
		System.out.println("This is "+c1.getBrand()+"car with max speed "+c1.getMaxSpeed()+"km/h, in color "+c1.getColor());
		

	}

}
