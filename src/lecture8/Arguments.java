package lecture8;
class Bicycle{
	int speed=10;
	void direction(String side, int speed){
		System.out.println("Side "+side+ " speed "+speed+"km/h.");
		System.out.println("This bicycle speed "+this.speed +"km/h.");
	}
}
public class Arguments {

	public static void main(String[] args) {
		Bicycle b=new Bicycle();
		String side="North";
		int speed=5;
		b.direction(side, speed);
	}

}
