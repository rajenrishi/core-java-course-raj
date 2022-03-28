package pkg18accessmodifiers;


class Car {
	
	public String sModel;
	public int iHighSpeed;
	public static int iSteering;
	public static int iWheel;
	public static int iDoors;
	
	Car() {
		
		iSteering = 1;
		iWheel = 4;
	}
	
	public void DisplayChartics() {

		System.out.println("Model: " + sModel);
		System.out.println("Speed: " + iHighSpeed);
		System.out.println("Steering: " + iDoors);
	}
	
	public static void DisplayStaticChartics() {

//		System.out.println("Model: " + sModel);
//		System.out.println("Speed: " + iHighSpeed);
		System.out.println("Doors: " + iDoors);
	}
}

public class JP02StaticMethodDemo {

	public static void main(String[] args) {
		
		
		Car obj = new Car();
		obj.sModel = "Verna";   // instance variable
		obj.iHighSpeed = 200;   // instance variable
		
		
		Car.iDoors = 2;   // static or class variable
		
		obj.DisplayChartics();
		Car.DisplayStaticChartics();
	}
}
