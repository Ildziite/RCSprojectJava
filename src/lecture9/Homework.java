package lecture9;
class Employee {
	private String name;
	private String work;
	private double salary;
	private double totalMoney;

	public Employee() {
		this("", "", 0.0, 0.0);
	}

	public Employee(String name) {
		this(name, "", 0.0, 0.0);
	}

	public Employee(String name, String work, double salary, double totalMoney) {
		this.name = name;
		this.work = work;
		this.salary = salary;
		this.totalMoney = totalMoney;
	}

	void output() {
		System.out.println("Employee name: " + name + ", position: " + work
				+ ", salary: " + salary + ", total money: " + totalMoney);
	}

	String getName() {
		return name;
	}

	String getWork() {
		return work;
	}

	double getSalary() {
		return salary;
	}

	double getTotalMoney() {
		return totalMoney;
	}

	void setName(String name) {
		this.name = name;
	}

	void setWork(String work) {
		this.work = work;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	void receiveSalary() {
		this.totalMoney = this.totalMoney + this.salary;
		System.out.println("Salary " + this.salary
				+ " have been aded to total money.");
	}

	void leftJob() {
		System.out.println(name + " has left postition " + work);
		this.work = "";
		this.salary = 0.00;
	}

	void getNewJob(String work, double salary) {
		this.work = work;
		this.salary = salary;
		System.out.println(name + " has started postition " + work + " for "
				+ salary + " euros.");
	}
}

public class Homework {

	public static void main(String[] args) {
		Employee e1 = new Employee("Janis");
		e1.output();
		e1.getNewJob("accountant", 800);
		e1.output();
		e1.receiveSalary();
		e1.output();
		e1.receiveSalary();
		e1.output();

		Employee e2 = new Employee("Peteris", "manager", 1000, 0);
		e2.receiveSalary();
		e2.output();
		e2.leftJob();
		e2.output();
		e2.receiveSalary();
		e2.output();

	}

}
