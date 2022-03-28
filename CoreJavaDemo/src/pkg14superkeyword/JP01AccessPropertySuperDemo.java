package pkg14superkeyword;

// accessing the parent class property using super keyword
class APSD {
	
	String name;
}

public class JP01AccessPropertySuperDemo extends APSD {
	
	String name;
	
	public void display() {
		
		super.name = "Super Class (Parent class)";
		name = "Sub Class (Child class)";
		System.out.println(super.name + "  " + name);
	}

	public static void main(String[] args) {
		
		JP01AccessPropertySuperDemo obj = new JP01AccessPropertySuperDemo();
		obj.display();
	}
}
