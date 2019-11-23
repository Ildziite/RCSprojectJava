package lecture8;
class Factory {
	private String name;
	private String location;
	private int workerAmount;
	private boolean status;

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

	void openFactory(String n, String l) {
		if (status == true) {
			System.out.println("Factory is already open!");
		} else {
			status = true;
			workerAmount = 0;
			name = n;
			location = l;
			System.out.println("Factory "+name+" has been opened in "+location);
		}
	}

	void hireNewWorker(String position) {
		if (status == true) {
		workerAmount++;
		System.out.println(position + " has been hired. Now there are "
				+ workerAmount + " workers in the factory " + name + ".");
		} else{
			System.out.println("Factory is closed!");
		}
	}

	void fireWorker(String position) {
		if (status == true) {
		workerAmount--;
		System.out.println(position + " has been fired. Now there are "
				+ workerAmount + " workers in the factory " + name + ".");
		} else{
			System.out.println("Factory is closed!");
		}
	}

	void fireAll() {
		if (status == true) {
		workerAmount = 0;
		System.out
				.println("All factory workers have been fired. Now there are "
						+ workerAmount + " workers in the factory " + name
						+ ".");
		} else{
			System.out.println("Factory is closed!");
		}
	}

	void bankrupt() {
		System.out.println("Factory has gone bankrupt.");
		fireAll();
		status = false;
		System.out
				.println("Status for this factory has been changed to not operating.");

	}

}

public class Homework2 {

	public static void main(String[] args) {

		Factory f1 = new Factory();
		f1.openFactory("Razotne", "Kaunas");
		f1.hireNewWorker("Owner");
		f1.hireNewWorker("Inznieris");
		f1.hireNewWorker("Stradnieks");
		f1.fireWorker("Stradnieks");
		

		System.out.println("Factory " + f1.getName() + " is located in "
				+ f1.getLocation() + " and employs " + f1.getWorkerAmount()
				+ " workers. Factories status is "+f1.getStatus());
		f1.fireAll();
		
		System.out.println("Factory " + f1.getName() + " is located in "
				+ f1.getLocation() + " and employs " + f1.getWorkerAmount()
				+ " workers. Factories status is "+f1.getStatus());
		
		f1.bankrupt();
		
		System.out.println("Factory " + f1.getName() + " is located in "
				+ f1.getLocation() + " and employs " + f1.getWorkerAmount()
				+ " workers. Factories status is "+f1.getStatus());
	}

}
