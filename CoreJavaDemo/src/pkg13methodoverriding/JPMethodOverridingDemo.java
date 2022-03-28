package pkg13methodoverriding;

class A {  // Parent class
	
	public void display() {
		
		System.out.println("In class A display.");
	}
}

public class JPMethodOverridingDemo extends A {  // Child class
	
	// This method overrides the display method in class A
	public void display() {
		
		System.out.println("In class JPMethodOverridingDemo display.");
	}

	public static void main(String[] args) {
		
		JPMethodOverridingDemo moObj = new JPMethodOverridingDemo();
		moObj.display();
	}
}
