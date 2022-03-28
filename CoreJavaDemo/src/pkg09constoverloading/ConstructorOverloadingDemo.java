package pkg09constoverloading;

public class ConstructorOverloadingDemo {
	
	//Different number of params, or diff types
	
	String iName;
	
	public ConstructorOverloadingDemo() {
		System.out.println("No Arg constructor");
	}
	
	public ConstructorOverloadingDemo(String name) {
		System.out.println("One Arg constructor");
		this.iName = name;
//		System.out.println(name);
	}
	
	public ConstructorOverloadingDemo(String fName, String lName) {
		System.out.println("Two Arg constructor");
		this.iName = fName;
//		System.out.println(fName);
	}
	
	public void displayName() {
		System.out.println(this.iName);
	}

	public static void main(String[] args) {

		// No Args
		ConstructorOverloadingDemo cDemo1 = new ConstructorOverloadingDemo();
		cDemo1.displayName();
		
		// One Args
		ConstructorOverloadingDemo cDemo2 = new ConstructorOverloadingDemo("ConODemo");
		cDemo2.displayName();
		
		// Two Args
		ConstructorOverloadingDemo cDemo3 = new ConstructorOverloadingDemo("FN", "LN");
		cDemo3.displayName();
		
	}
}
