package pkg18accessmodifiers;


final class FinalClass {

	public void display() {

		System.out.println("In display method");
	}
}

class FinalChClass extends FinalClass {

	public void display() {

		System.out.println("FinalChildClass In display method");
	}
}

public class JP06FinalClassDemo {

	public static void main(String[] args) {
		
		FinalChClass obj = new FinalChClass();
		obj.display();
	}
}
