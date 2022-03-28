package pkg15accessmod;

class PriConstA {
	
	private PriConstA() {
		System.out.println("In private constructor");
	}
}

public class JP04PrivateConstDemo {

	public static void main(String[] args) {
		
		// Same class private constructor
		PriConstA aObj = new PriConstA();   // Compile Error
	}
}
