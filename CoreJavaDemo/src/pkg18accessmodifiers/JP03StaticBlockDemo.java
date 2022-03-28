package pkg18accessmodifiers;

class CarSB {
	
	static {

		System.out.println("Control is in static block.");
	}
}

public class JP03StaticBlockDemo {

	public static void main(String[] args) {

		CarSB obj1 = new CarSB();
		CarSB obj2 = new CarSB();
		CarSB obj3 = new CarSB();
	}
}
