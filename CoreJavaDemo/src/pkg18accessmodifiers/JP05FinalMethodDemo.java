package pkg18accessmodifiers;


class FinalMetClass {

	public void display() {

		System.out.println("In display method");
	}
	
	public final void finDisplay() {

		System.out.println("In final display method");
	}
}

class FinalChildClass extends FinalMetClass {

	public void display() {

		System.out.println("FinalChildClass In display method");
	}
//	
//	public void finDisplay() {
//
//		System.out.println("FinalChildClass In final display method");
//	}
	
}

public class JP05FinalMethodDemo {

	public static void main(String[] args) {
		
		FinalChildClass obj = new FinalChildClass();
	}
}
