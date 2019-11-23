package lecture9;
class Pupil {
	int age;
	int form;
	String name;
	
	//sis ir constructor
	public Pupil(){
		this.age=7;
		this.form=1;
		//var ari
		//this("",7,1);
	}
	
	//sis ir parametrized constructor
	public Pupil(String n, int a, int f){
		this.age=a;
		this.form=f;
		this.name=n;
	}
	
	String output(){
		return "Name: "+name+" age: "+age+" form: "+form;
	}

}

public class ConstructorExample {

	public static void main(String[] args) {

		Pupil pupil1 = new Pupil();
		System.out.println(pupil1.output());
		
		Pupil pupil3=new Pupil("John",7,4);
		System.out.println(pupil3.output());
		
		
		

	}

}
