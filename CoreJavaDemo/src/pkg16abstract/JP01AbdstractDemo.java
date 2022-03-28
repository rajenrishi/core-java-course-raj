package pkg16abstract;

// class have abstract methods

// concrete, abstract

abstract class AbsDemo {
	
	void display() {  // concrete
		
		System.out.println("In abstract class.");
	}
	
	abstract void display1();
}

abstract class AbsDemo1 extends AbsDemo {
	
	void display() {  // concrete
		
		System.out.println("In abstract class.");
	}
	
	abstract void display1();
}

public class JP01AbdstractDemo extends AbsDemo {

	void display1() {
		
		System.out.println("Implemented method display1.");
	}
	
//	void display() {  // concrete
//		
//		System.out.println("In abstract class display.");
//	}

	public static void main(String[] args) {
		
		JP01AbdstractDemo obj = new JP01AbdstractDemo();
//		obj.display();
//		obj.display1();
	}
}
