package pkg01datatypes;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		// Widening Type casting
//		int myInt = 12;
//		double myDouble = myInt; // Automatic casting: integer to double
//
//		System.out.println(myInt);      // Outputs 12
//		System.out.println(myDouble);   // Outputs 12.0
//
//		myInt = 1234;
//		long myLInt = myInt; // Automatic casting: integer to long integer
//
//		System.out.println(myInt);      // Outputs 9
//		System.out.println(myLInt);   // Outputs 9.0
		
		
		
		// Narrowing casting  -  depending value there will be data loss
		double dVal = 99.345d;
		int iVal = (int) dVal;
		System.out.println(iVal);
	}
}
