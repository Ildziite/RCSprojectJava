package lecture14;
public class User {
	private String name;
	private int banAcc;

	public User() {
		this("", 0);
	}

	public User(String name, int banAcc) {
		this.name = name;
		this.banAcc = banAcc;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setBanAcc(int banAcc) {
		this.banAcc = banAcc;
	}
	public String getName() {
		return name;
	}

	public int getBanAcc() {
		return banAcc;
	}
	
public String toString(){
	return "User "+name+", bank account "+banAcc;
}
}
