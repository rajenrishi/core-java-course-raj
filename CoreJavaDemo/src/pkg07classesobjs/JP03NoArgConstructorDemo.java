package pkg07classesobjs;

class ConstructorDemo {
	
	int iVal;
	
	// <ClassName>()
	ConstructorDemo() {
		
		System.out.println("We are in constructor method.");
	}
	
	
	// <access specifier> <return type> <method name>
	public int addNumbers(int a, int b) {

		System.out.println("We are in display method.");
		System.out.println(iVal);
		return a + b;
	}
}

public class JP03NoArgConstructorDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// <ClassName> <refName> = new <ClassName>;
		ConstructorDemo demoRef = new ConstructorDemo();     // creating an object
		System.out.println("After object creation.");
		
		// <refName>.<methodName>();
		sum = demoRef.addNumbers(10, 12);    // calling the method
		System.out.println(sum);
	}
}
