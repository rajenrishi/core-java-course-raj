package pkg15accessmod;

class A {
	
	private int data = 30;
	
	private void display() {
		
		System.out.println("In Private method Class A." + data);
	}
}

public class JP01PrivateAMDemo {

	public static void main(String[] args) {
		
		A aObj = new A();
		aObj.display();  // Compile Error

	}
}
