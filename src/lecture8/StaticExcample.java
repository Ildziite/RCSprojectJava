package lecture8;
class Robot {
	String name;
	static String factory;
	//static - one value for every instance

	void info() {
		System.out.println("Name " + name + " factory " + factory);
	}
}

public class StaticExcample {

	public static void main(String[] args) {
		Robot.factory = "MicroTik";
		Robot robot1 = new Robot();
		robot1.name = "robo1";
		// robot1.factory="MicroTik";
		Robot robot2 = new Robot();
		robot2.name = "robo2";
		// robot2.factory="MicroTik";
		Robot robot3 = new Robot();
		robot3.name = "robo3";
		// robot3.factory="MicroTik";
		robot2.info();

		// Factory changed name
		robot3.factory = "Microsoft";
		// will be changed for everyone
		robot2.info();

	}
}
