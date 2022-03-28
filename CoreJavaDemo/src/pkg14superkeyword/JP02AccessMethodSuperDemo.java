package pkg14superkeyword;

// accessing the parent class method using super keyword
class AMSD {
	
	String name;
	
	public void display() {
		
		name = "Super Class (Parent class)";
		System.out.println("In Super class:  " + name);
	}
}

public class JP02AccessMethodSuperDemo extends AMSD {
	
	String name;
	
	public void display() {
		
		super.display();   // accessing the method of super class
		name = "Sub Class (Child class)";
		System.out.println("Child class:  " + name);
	}

	public static void main(String[] args) {
		
		JP02AccessMethodSuperDemo obj = new JP02AccessMethodSuperDemo();
		obj.display();
	}
}
