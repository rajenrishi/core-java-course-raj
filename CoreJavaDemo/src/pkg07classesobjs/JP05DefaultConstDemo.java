package pkg07classesobjs;

class DDemo {
	
	int iVal;
	String strVal;
	
	// <access specifier> <return type> <method name>
	public int addNumbers(int a, int b) {
		
		System.out.println("We are in display method.");
		System.out.println(strVal);
		return a + b;
	}
}

public class JP05DefaultConstDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// <ClassName> <refName> = new <ClassName>;
		DDemo demoRef = new DDemo();     // creating an object
		System.out.println("After object creation.");
		
		// <refName>.<methodName>();
		sum = demoRef.addNumbers(10, 12);    // calling the method
		System.out.println(sum);
	}
}
