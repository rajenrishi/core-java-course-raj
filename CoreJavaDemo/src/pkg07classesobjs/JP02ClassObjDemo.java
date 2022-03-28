package pkg07classesobjs;

class Demo {
	
	// <access specifier> <return type> <method name>
	public int addNumbers(int a, int b) {
		
		System.out.println("We are in display method.");
		return a + b;
	}
}

public class JP02ClassObjDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// <ClassName> <refName> = new <ClassName>;
		Demo demoRef = new Demo();     // creating an object
		
		// <refName>.<methodName>();
		sum = demoRef.addNumbers(10, 12);    // calling the method
		System.out.println(sum);
	}
}
