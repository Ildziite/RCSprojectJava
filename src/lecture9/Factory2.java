package lecture9;
class Factory {
	private String name;
	private String location;
	private int workerAmount;
	private boolean status;

	public Factory() {
		this("", "");
	}

	public Factory(String name, String location) {
		status = true;
		workerAmount = 0;
		this.name = name;
		this.location = location;
		System.out.println("Factory " + name + " has been opened in " + location);

	}

	String getName() {
		return name;
	}

	String getLocation() {
		return location;
	}

	int getWorkerAmount() {
		return workerAmount;
	}

	boolean getStatus() {
		return status;
	}

	void setName(String n) {
		name = n;
	}

	void setLocation(String l) {
		location = l;
	}

	void setWorkerAmount(int a) {
		workerAmount = a;
	}

	void hireNewWorker(String position) {
		if (status == true) {
			workerAmount++;
			System.out.println(position + " has been hired. Now there are " + workerAmount + " workers in the factory "
					+ name + ".");
		} else {
			System.out.println("Factory is closed!");
		}
	}

	void fireWorker(String position) {
		if (status == true) {
			workerAmount--;
			System.out.println(position + " has been fired. Now there are " + workerAmount + " workers in the factory "
					+ name + ".");
		} else {
			System.out.println("Factory is closed!");
		}
	}

	void fireAll() {
		if (status == true) {
			workerAmount = 0;
			System.out.println("All factory workers have been fired. Now there are " + workerAmount
					+ " workers in the factory " + name + ".");
		} else {
			System.out.println("Factory is closed!");
		}
	}

	void bankrupt() {
		System.out.println("Factory has gone bankrupt.");
		fireAll();
		status = false;
		System.out.println("Status for this factory has been changed to not operating.");

	}

	void output() {
		System.out.println("Factory " + name + " is located in " + location + " and employs " + workerAmount
				+ " workers. Factories status is " + status);
	}

}

public class Factory2 {

	public static void main(String[] args) {

		Factory f1 = new Factory("Razotne", "Kaunas");
		Factory f2 = new Factory();
		f1.hireNewWorker("Owner");
		f1.hireNewWorker("Inznieris");
		f1.hireNewWorker("Stradnieks");
		f1.fireWorker("Stradnieks");

		f1.output();

		f1.fireAll();
		f1.output();

		f1.bankrupt();
		f1.output();
		f1.hireNewWorker("asdas");

	}

}
